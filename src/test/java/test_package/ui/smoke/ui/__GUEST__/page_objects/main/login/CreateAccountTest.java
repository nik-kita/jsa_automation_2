
package test_package.ui.smoke.ui.__GUEST__.page_objects.main.login;

import main_package.engine.test_engine.OnixUiTestRunner;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import main_package.ui.__GUEST__.page_objects.main.login.CreateAccount;


public class CreateAccountTest extends OnixUiTestRunner {
    CreateAccount createAccount;
    @BeforeMethod
    public void openCreateAccount() {
        createAccount = openSite().clickHeaderJoinNow();
    }
    @Test
    public void createAccountTest() {
        createAccount.check(onixUiAssert);
        onixUiAssert.assertAll();
    }
    @Test
    public void clickJsaLogoTest() {
        createAccount.clickJsaLogo().check(onixUiAssert);
        onixUiAssert.assertAll();
    }
    @Test
    public void clickSignInWithFacebook() {
        createAccount.clickSignInWithFacebook().check(onixUiAssert);
        onixUiAssert.assertAll();
    }
    @Test
    public void clickSignInWithApple() {
        createAccount.clickSignInWithApple().check(onixUiAssert);
        onixUiAssert.assertAll();
    }
    @Test
    public void clickSignIn() {
        createAccount.clickSignInButton().check(onixUiAssert);
        onixUiAssert.assertAll();
    }
    @Test
    public void clickCreateAccountButton() {
        //TODO
        log.error("This test is not written!");
    }
}

