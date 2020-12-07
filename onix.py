import sys, re, os

file = sys.argv[1]


def create_unit_test(file):
    test_unit_file = "src/test/java/test_package/ui/unit/" + re.search("(src/main/java/main_package/)(.*)(/\w*$)",
                                                                       file).group(2)
    if not os.path.exists(test_unit_file):
        os.makedirs(test_unit_file)

    po_name = escape_path(file)
    test_name = po_name + "Test"

    unit_string = f'''
package {generate_package(file).get("unit")};


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import {generate_package(file).get("main_package") + "." + po_name + ";"}


public class {test_name} extends OnixUiTestRunner {{
    {po_name} {po_name[0].lower() + po_name[1:]};
    @BeforeClass
    public void open{po_name}() {{
        //TODO
        //{po_name[0].lower() + po_name[1:]} = openSite();
    }}

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {{
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }}

    @DataProvider
    public Object[] getUnique() {{
        return mergeArrays(
                {po_name}.Locator.values()
                //TODO
        );
    }}

    @Test(dataProvider = "getRepeated")
    public void repeated(OnixLocator locator) {{
        onixUiAssert.
                checkMinimumOfElementsByLocator(locator, 1);
    }}

    @DataProvider
    public Object[] getRepeated() {{
        return mergeArrays(
                {po_name}.Locators.values()
                //TODO
        );
    }}
}}

'''
    open(test_unit_file + "/" + test_name + ".java", "w").write(unit_string)


def create_smoke_test(file):
    test_smoke_file = "src/test/java/test_package/ui/smoke/" + re.search("(src/main/java/main_package/)(.*)(/\w*$)",
                                                                         file).group(2)
    if not os.path.exists(test_smoke_file):
        os.makedirs(test_smoke_file)

    po_name = escape_path(file)
    test_name = po_name + "Test"

    smoke_string = f'''
package {generate_package(file).get("smoke")};

import main_package.engine.test_engine.OnixUiTestRunner;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import {generate_package(file).get("main_package") + "." + po_name + ";"}


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
    path = re.search("(.*)(/\w+$)", file).group(1)

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
import main_package.data.S;

public class {po_name} extends OnixPageObject {{
    private String ENDPOINT_URL = ""; //TODO
    public {po_name}(OnixWebDriver driver) {{
        super(driver);
        log.debug("[{{}}] page is open", "{po_name}"); //TODO
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
        //TODO
        ;
        private By path;
        private S[] actions;
        Locator(By path) {{
            this.path = path;
        }}
        Locator(By path, S... actions) {{
            this.path = path;
            this.actions = actions;
        }}
        @Override
        public By getPath() {{
            return path;
        }}
        @Override
        public S[] specialActions() {{
           return actions;
        }}
    }}

    public enum Locators implements OnixLocator {{
        //TODO
        ;
        private By path;
        private S[] actions;
        Locators(By path) {{
            this.path = path;
        }}
        Locators(By path, S... actions) {{
            this.path = path;
            this.actions = actions;
        }}
        @Override
        public By getPath() {{
            return path;
        }}
        @Override
        public S[] specialActions() {{
           return actions;
        }}
    }}

}}

'''
    print(file)
    print(path)
    open(file + ".java", "w").write(po_string)


def escape_path(file_name):
    return re.findall("\w+$", file_name)[0]


def generate_package(file_name):
    main_package = (re.search("(src/main/java/)(.*)(/\w+$)", file_name).group(2)).replace("/", ".")
    unit = "test_package.ui.unit.ui." + re.search("(ui\.)(.*)", main_package).group(2)
    smoke = "test_package.ui.smoke.ui." + re.search("(ui\.)(.*)", main_package).group(2)
    result = {
        "main_package": main_package,
        "unit": unit,
        "smoke": smoke,
    }
    print(result)
    return result

def part_create(file):
    package = generate_package(file).get("main_package")
    name = escape_path(file)
    path = re.search("(.*)(/\w+$)", file).group(1)
    if not os.path.exists(path):
        os.makedirs(path)



    part_string = f'''
package {package};

import main_package.data.S;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPart;
import org.openqa.selenium.By;

public interface {name} extends OnixPart {{

    //TODO

    enum {name}Ltr implements OnixLocator {{
        //TODO
        ;
        private By path;
        private S[] actions;
        {name}Ltr(By path) {{
            this.path = path;
        }}
        {name}Ltr(By path, S... actions) {{
            this.path = path;
            this.actions = actions;
        }}
        @Override
        public By getPath() {{
            return path;
        }}
        @Override
        public S[] specialActions() {{
            return actions;
        }}
    }}

    enum {name}Ltrs implements OnixLocator {{
        //TODO
        ;
        private By path;
        private S[] actions;
        {name}Ltrs(By path) {{
            this.path = path;
        }}
        {name}Ltrs(By path, S... actions) {{
            this.path = path;
            this.actions = actions;
        }}
        @Override
        public By getPath() {{
            return path;
        }}
        @Override
        public S[] specialActions() {{
            return actions;
        }}
    }}
}}

    '''
    print(file)
    open(file + ".java", "w").write(part_string)

if __name__ == "__main__":
    if (sys.argv[1] == "make:po"):
        if (sys.argv[2] == "--all"):
            for arg in sys.argv[3:]:
                create_page_object(arg)
                create_smoke_test(arg)
                create_unit_test(arg)
        elif (sys.argv[2] == "--unit"):
            create_unit_test(sys.argv[3])
        elif (sys.argv[2] == "--smoke"):
            create_smoke_test(sys.argv[3])
        else:
            create_page_object(sys.argv[2])

    #TODO
    elif (sys.argv[1] == "make:part"):
        if (sys.argv[2] == "--all"):
            print("--all functionality in progress")
        elif (sys.argv[2] == "--unit"):
            print("--unit functionality in progress")
        elif (sys.argv[2] == "--smoke"):
            print("--smoke functionality in progress")
        else:
            print("ok")
            part_create(sys.argv[2])