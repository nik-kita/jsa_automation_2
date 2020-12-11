
package test_package.ui.unit.ui.__USER__.page_objects.home.my_progress;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__USER__.page_objects.home_header.home.my_progress.ImagesTab;


public class ImagesTabTest extends OnixUiTestRunner {
    ImagesTab imagesTab;
    @BeforeClass
    public void openImagesTab() {
        imagesTab = openSite()
                .clickHeaderLogin()
                .login(user)
                .clickMyProgressLink()
                .clickImagesTab();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                ImagesTab.Locator.values()
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
                ImagesTab.Locators.values()
                //TODO
        );
    }
}

