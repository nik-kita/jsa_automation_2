
package test_package.ui.smoke.ui.__GUEST__.page_objects.main;

import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.BeforeMethod;
import main_package.ui.__GUEST__.page_objects.main.Main;
import org.testng.annotations.Test;


public class MainTest extends OnixUiTestRunner {
    Main main;

    @BeforeMethod
    public void openMain() {
        main = openSite();
    }

    @Test
    public void clickHeaderPricing() {
        main.clickHeaderPricing().check(onixUiAssert);
        onixUiAssert.assertAll();
    }

    @Test
    public void clickHeaderJsaLogo() {
        main.clickHeaderJsaLogo().check(onixUiAssert);
        onixUiAssert.assertAll();
    }

    @Test
    public void clickHeaderTransformations() {
        main.clickHeaderTransformations().check(onixUiAssert);
        onixUiAssert.assertAll();
    }

    @Test
    public void clickHeaderChallenge() {
        main.clickHeaderChallenge().check(onixUiAssert);
        onixUiAssert.assertAll();
    }

    @Test
    public void clickHeaderMyPodcast() {
        main.clickHeaderMyPodcast().check(onixUiAssert);
        onixUiAssert.assertAll();
    }

    @Test
    public void clickHeaderMyBook() {
        //TODO
        log.error("This test is not written!");
    }

    @Test
    public void clickHeaderLogin() {
        main.clickHeaderLogin().check(onixUiAssert);
        onixUiAssert.assertAll();
    }

    @Test
    public void clickHeaderJoinNow() {
        main.clickHeaderJoinNow().check(onixUiAssert);
        onixUiAssert.assertAll();
    }

}    

