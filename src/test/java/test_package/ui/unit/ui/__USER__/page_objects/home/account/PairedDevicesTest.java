
package test_package.ui.unit.ui.__USER__.page_objects.home.account;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__USER__.page_objects.home_header.home.account.PairedDevices;


public class PairedDevicesTest extends OnixUiTestRunner {
    PairedDevices pairedDevices;
    @BeforeClass
    public void openPairedDevices() {
        pairedDevices = openSite()
                .clickHeaderLogin()
                .login(user)
                .clickAccountIcon()
                .clickPairedDevices();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                PairedDevices.Locator.values()
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
                PairedDevices.Locators.values()
                //TODO
        );
    }
}

