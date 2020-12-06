import sys, re, os

file = sys.argv[1]


def create_unit_test(file):
    test_unit_file = "src/test/java/test_package/ui/unit/" + re.search("(src/main/java/main_package/)(.*)", file).group(2)
    if not os.path.exists(test_unit_file):
        os.makedirs(test_unit_file)


def create_smoke_test(file):
    test_smoke_file = "src/test/java/test_package/ui/smoke/" + re.search("(src/main/java/main_package/)(.*)(/\w*$)", file).group(2)
    if not os.path.exists(test_smoke_file):
        os.makedirs(test_smoke_file)

    po_name = escape_path(file)
    test_name = po_name + "Test"

    smoke_string = f'''
package {generate_package(file).get("smoke")}
    
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import {generate_package(file).get("main_package")[0:-1] + "." + po_name + ";"}

public class {test_name} extends OnixUiTestRunner {{
    {po_name} {po_name[0].lower() + po_name[1:]};
    @BeforeMethod
    public void open{po_name}() {{
        //TODO
    }}
    //TODO
}}    

'''
    open(test_smoke_file + "/" + test_name + ".java", "w").write(smoke_string)

def create_page_object(file):
    po_name = escape_path(file)
    package = generate_package(file)
    path = re.search("(.*)(\w+$)", file).group(2)

    if not os.path.exists(path):
        os.makedirs(path)
    po_string = f'''
package {package.get("main_package")};
    
import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import org.openqa.selenium.By;

public class {po_name} extends OnixPageObject {{
    private String ENDPOINT_URL = ""; //TODO
    public {po_name}(OnixWebDriver driver) {{
        super(driver);
        log.debug("[{{}}] is open", "{po_name}"); //TODO
    }}


    @Override
    public {po_name} make(Fly fly) {{
        fly.make();
        return this;
    }}

    @Override
    public {po_name} openFromScratch() {{
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }}
    @Override
    public {po_name} openFromUrl() {{
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }}
    @Override
    public {po_name} check(OnixUiAssert onixUiAssert) {{
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                {po_name}.Locator.values()
                //TODO
        )) {{
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }}
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                {po_name}.Locators.values()
                //TODO
        )) {{
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }}
        return this;
    }} 


    public enum Locator implements OnixLocator {{

        ;

        private By path;

        Locator(By path) {{
            this.path = path;
        }}

        @Override
        public By getPath() {{
            return path;
        }}
    }}

    public enum Locators implements OnixLocator {{

        ;

        private By path;

        Locators(By path) {{
            this.path = path;
        }}

        @Override
        public By getPath() {{
            return path;
        }}
    }}

}}

'''
    open(file + ".java", "w").write(po_string)


def escape_path(file_name):
    return re.findall("\w+$", file_name)[0]


def generate_package(file_name):
    main_package = (re.search("(src/main/java/)(.*)(/\w+$)", file_name).group(2) + ";").replace("/", ".")
    unit = "test_package.ui.unit.ui." + re.search("(ui\.)(.*)", main_package).group(2);
    smoke = "test_package.ui.smoke.ui." + re.search("(ui\.)(.*)", main_package).group(2);
    result = {
        "main_package": main_package,
        "unit": unit,
        "smoke": smoke,
    }
    print(result)
    return result


if __name__ == "__main__":
    if (len(sys.argv) == 2):
        create_page_object(sys.argv[1])
        create_unit_test(sys.argv[1])
        create_smoke_test(sys.argv[1])
    else:
        if (sys.argv[2] == "--po"):
            create_page_object(sys.argv[1])
        elif (sys.argv[2] == "--unit"):
            create_unit_test(sys.argv[1])
        elif (sys.argv[2] == "--smoke"):
            create_smoke_test(sys.argv[1])
