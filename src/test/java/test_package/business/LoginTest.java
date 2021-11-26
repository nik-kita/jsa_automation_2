package test_package.business;

import main_package.data.User;
import main_package.engine.test_engine.OnixUiTestRunner;
import org.testng.annotations.Test;

public class LoginTest extends OnixUiTestRunner {
    @Test
    public void loginWithFBTest() {
        openSite().clickHeaderLogin().loginByFB(User.getValidUser()).check(onixUiAssert);
    }
}
