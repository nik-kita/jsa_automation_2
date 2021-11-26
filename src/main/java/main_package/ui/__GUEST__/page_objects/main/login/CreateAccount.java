
package main_package.ui.__GUEST__.page_objects.main.login;

import main_package.data.Settings;
import main_package.engine.BaseClass;
import main_package.engine.Fly;
import main_package.engine.log_engine.OnixLog;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__GUEST__.page_objects.from_footer.TermsOfService;
import main_package.ui.__GUEST__.page_objects.main.Main;
import main_package.ui.__related_sites__.InCurrentTab;
import org.openqa.selenium.By;
import main_package.data.S;
import org.slf4j.Logger;

public class CreateAccount extends OnixPageObject {
    private String ENDPOINT_URL = ""; //TODO

    public CreateAccount(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "CreateAccount"); //TODO
    }

    public Main clickJsaLogo() {
        driver.findElement(Locator.JSA_LOGO).click();
        log.info("Click 'JSA' logo.");
        return new Main(driver);
    }

    public Main clickJsaLogo(OnixUiAssert onixUiAssert) {
        return clickJsaLogo().check(onixUiAssert);
    }

    public Login clickSignInButton() {
        driver.findElement(Locator.SIGN_IN_BUTTON).click();
        log.info("click [{}] button", "Sign In");
        return new Login(driver);
    }


    public TermsOfService clickTermsOfServiceLink() {
        driver.findElement(Locator.TERMS_OF_SERVICE_LINK).click();
        log.info("click [{}] checkbox", "Terms Of Service");
        return new TermsOfService(driver);
    }

    public FbWindowForLogin clickSignInWithFacebook() {
        driver.findElement(Locator.FACEBOOK_BUTTON).click();
        log.info("click [{}] button", "Sign In With Facebook");
        return new FbWindowForLogin(driver);
    }


    public AppleWindowForLogin clickSignInWithApple() {
        driver.findElement(Locator.APPLE_BUTTON).click();
        log.warn("click [{}] button", "Sign In With Apple");
        return new AppleWindowForLogin(driver);
    }

    @Override
    public CreateAccount openFromUrl() {
        //TODO
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }

    @Override
    public CreateAccount check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                CreateAccount.Locator.values()
                //TODO
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                CreateAccount.Locators.values()
                //TODO
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }

    @Override
    public BaseClass make(Fly fly) {
        fly.make();
        return this;
    }


    public enum Locator implements OnixLocator {
        JSA_LOGO(By.xpath("//a[@href='/']")),
        USERNAME_INPUT(By.xpath("//input[@name='username']")),
        EMAIL_INPUT(By.xpath("//input[@name='email']")),
        PASSWORD_INPUT(By.id("password")),
        PASSWORD_CONFIRMATION_INPUT(By.id("password2")),
        TERMS_CHECKBOX(By.xpath("//input[@name='terms']")),
        TERMS_OF_SERVICE_LINK(By.xpath("//a[@href='/terms/']")),
        PRIVACY_POLICY_LINK(By.xpath("//a[@href='/privacy/']")),
        CREATE_ACCOUNT_BUTTON(By.id("formButton")),
        FACEBOOK_BUTTON(By.cssSelector(".fb-button")),
        APPLE_BUTTON(By.cssSelector(".apple-button")),
        SIGN_IN_BUTTON(By.cssSelector("a[href='/users/login/']")),
        ;
        private By path;
        private S[] actions;

        Locator(By path) {
            this.path = path;
        }

        Locator(By path, S... actions) {
            this.path = path;
            this.actions = actions;
        }

        @Override
        public By getPath() {
            return path;
        }

        @Override
        public S[] specialActions() {
            return actions;
        }
    }

    public enum Locators implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;

        Locators(By path) {
            this.path = path;
        }

        Locators(By path, S... actions) {
            this.path = path;
            this.actions = actions;
        }

        @Override
        public By getPath() {
            return path;
        }

        @Override
        public S[] specialActions() {
            return actions;
        }
    }

}

