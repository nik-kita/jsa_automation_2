
package test_package.ui.unit.ui.__USER__.page_objects.from_footer;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__USER__.page_objects.from_footer.AccessAndDownload;


public class AccessAndDownloadTest extends OnixUiTestRunner {
    AccessAndDownload accessAndDownload;
    @BeforeClass
    public void openAccessAndDownload() {
        accessAndDownload = openSite(user).goAccessAndDownloadFromFooter();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                AccessAndDownload.Locator.values()
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
                AccessAndDownload.Locators.values()
                //TODO
        );
    }
}

