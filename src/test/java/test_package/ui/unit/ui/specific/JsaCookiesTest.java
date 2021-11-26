
package test_package.ui.unit.ui.specific;


import main_package.data.Settings;
import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.specific.JsaCookies;


public class JsaCookiesTest extends OnixUiTestRunner {
    JsaCookies jsaCookies;
    @BeforeClass
    public void openJsaCookies() {
        driver.get(Settings.BASE_URL);
        jsaCookies = new JsaCookies(driver);//TODO
    }
    
    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                JsaCookies.Locator.values()
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
                JsaCookies.Locators.values()
                //TODO
        );
    }
}    

