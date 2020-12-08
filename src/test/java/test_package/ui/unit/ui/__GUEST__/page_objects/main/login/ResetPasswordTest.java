
package test_package.ui.unit.ui.__GUEST__.page_objects.main.login;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import main_package.ui.__GUEST__.general_parts.Footer;
import main_package.ui.__GUEST__.general_parts.MainHeader;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__GUEST__.page_objects.main.login.ResetPassword;


public class ResetPasswordTest extends OnixUiTestRunner {
    ResetPassword resetPassword;
    @BeforeClass
    public void openResetPassword() {
        resetPassword = openSite().clickHeaderLogin().clickForgotPassword();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                ResetPassword.Locator.values(),
                MainHeader.MainHeaderLtr.values(),
                Footer.FooterLtr.values()
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
                ResetPassword.Locators.values(),
                MainHeader.MainHeaderLtr.values(),
                Footer.FooterLtr.values()
        );
    }
}

