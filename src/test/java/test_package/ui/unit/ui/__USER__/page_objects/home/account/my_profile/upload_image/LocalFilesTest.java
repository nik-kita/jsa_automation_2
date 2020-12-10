
package test_package.ui.unit.ui.__USER__.page_objects.home.account.my_profile.upload_image;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__USER__.page_objects.home_header.home.account.my_profile.upload_image.LocalFiles;


public class LocalFilesTest extends OnixUiTestRunner {
    LocalFiles localFiles;
    @BeforeClass
    public void openLocalFiles() {
        localFiles = openSite()
                .clickHeaderLogin()
                .login(user)
                .clickAccountIcon()
                .clickMyProfile()
                .clickUploadImageIconButton();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                LocalFiles.Locator.values()
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
                LocalFiles.Locators.values()
                //TODO
        );
    }
}

