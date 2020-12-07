
package main_package.ui.__GUEST__.page_objects.main;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__GUEST__.general_parts.Footer;
import main_package.ui.__GUEST__.general_parts.MainHeader;
import main_package.ui.__GUEST__.page_objects.main.login.CreateAccount;
import org.openqa.selenium.By;
import main_package.data.S;

import static main_package.ui.__USER__.page_objects.main.Challenge.Locator.CREATE_ACCOUNT_BUTTON_INNER_PAGE;

public class Challenge extends OnixPageObject implements MainHeader, Footer {
    private String ENDPOINT_URL = ""; //TODO
    public Challenge(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "Challenge"); //TODO
    }

    public CreateAccount clickCreateAccountButton() {
        driver.findElement(CREATE_ACCOUNT_BUTTON_INNER_PAGE).click();
        log.debug("'Create Account' from 'Challenge'");
        return new CreateAccount(driver);
    }

    @Override
    public Challenge make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public Challenge openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public Challenge openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public Challenge check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Challenge.Locator.values(),
                Footer.FooterLtr.values(),
                MainHeader.MainHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Challenge.Locators.values(),
                Footer.FooterLtrs.values(),
                MainHeader.MainHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        CREATE_ACCOUNT_BUTTON_INNER_PAGE(By.cssSelector(".inner_page a[href='/users/register/']")),
        EMAIL_INPUT_INNER_PAGE(By.cssSelector("input[name='email']")),
        SIGN_UP_BUTTON_INNER_PAGE(By.cssSelector("button[onclick='submitRegisterInterest()']")),
        PREMIUM_PLAN_LINK(By.cssSelector("[href='/users/pricing/']")),
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

