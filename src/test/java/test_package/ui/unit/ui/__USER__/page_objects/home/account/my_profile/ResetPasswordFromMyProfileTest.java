
package test_package.ui.unit.ui.__USER__.page_objects.home.account.my_profile;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__USER__.page_objects.home_header.home.account.my_profile.ResetPasswordFromMyProfile;


public class ResetPasswordFromMyProfileTest extends OnixUiTestRunner {
    ResetPasswordFromMyProfile resetPasswordFromMyProfile;
    @BeforeClass
    public void openResetPasswordFromMyProfile() {
        //TODO
        //resetPasswordFromMyProfile = openSite();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                ResetPasswordFromMyProfile.Locator.values()
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
                ResetPasswordFromMyProfile.Locators.values()
                //TODO
        );
    }
}

