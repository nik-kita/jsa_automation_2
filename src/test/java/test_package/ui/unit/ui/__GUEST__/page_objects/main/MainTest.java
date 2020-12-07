
package test_package.ui.unit.ui.__GUEST__.page_objects.main;


import main_package.data.S;
import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__GUEST__.page_objects.main.Main;


public class MainTest extends OnixUiTestRunner {
    Main main;
    @BeforeClass
    public void openMain() {
        main = openSite();//TODO
    }
    
    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                Main.Locator.values()
                //TODO
        );
    }
    
    @Test(dataProvider = "getRepeated")
    public void repeated(OnixLocator locator) {
        onixUiAssert.
                checkMinimumOfElementsByLocator(locator, 1);
    }
    
    @DataProvider
    public Object[] getRepeated() {
        return mergeArrays(
                Main.Locators.values(),
                new OnixLocator[]{
                        new OnixLocator() {
                            @Override
                            public By getPath() {
                                return By.cssSelector("#fail");
                            }

                            @Override
                            public String name() {
                                return null;
                            }

                            @Override
                            public S[] specialActions() {
                                return new S[0];
                            }
                        }
                }
                //TODO
        );
    }
}    

