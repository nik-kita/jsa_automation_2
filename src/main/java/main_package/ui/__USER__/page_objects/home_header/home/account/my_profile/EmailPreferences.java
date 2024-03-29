
package main_package.ui.__USER__.page_objects.home_header.home.account.my_profile;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.general_parts.home.account.AccountHeader;
import org.openqa.selenium.By;
import main_package.data.S;

public class EmailPreferences extends OnixPageObject implements AccountHeader {
    private String ENDPOINT_URL = ""; //TODO
    public EmailPreferences(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "EmailPreferences"); //TODO
    }


    @Override
    public EmailPreferences make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public EmailPreferences openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public EmailPreferences openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public EmailPreferences check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                EmailPreferences.Locator.values(),
                AccountHeader.AccountHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                EmailPreferences.Locators.values(),
                AccountHeader.AccountHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        OPT_OUT_OF_ALL_EMAILS_SELECT(By.cssSelector("[name=\"globalUnsubscribe\"]")),
        //TODO may be these locator true only for specific user
        DAILY_EMAILS_SELECT(By.cssSelector("[name=\"list-14588\"]")),
        CHALLENGE_WAITING_LIST_SELECT(By.cssSelector("[name=\"list-14589\"]")),
        WELCOME_EMAILS_SELECT(By.cssSelector("[name=\"list-14590\"]")),
        UPDATE_PREFERENCES_BUTTON(By.cssSelector("[name='submitButton']")),
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

