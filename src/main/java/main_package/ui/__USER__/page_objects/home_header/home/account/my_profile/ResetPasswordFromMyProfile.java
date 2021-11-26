
package main_package.ui.__USER__.page_objects.home_header.home.account.my_profile;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.general_parts.Footer;
import main_package.ui.__USER__.general_parts.home.account.AccountHeader;
import org.openqa.selenium.By;
import main_package.data.S;

public class ResetPasswordFromMyProfile extends OnixPageObject implements Footer, AccountHeader {
    private String ENDPOINT_URL = ""; //TODO
    public ResetPasswordFromMyProfile(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "ResetPasswordFromMyProfile"); //TODO
    }


    @Override
    public ResetPasswordFromMyProfile make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public ResetPasswordFromMyProfile openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public ResetPasswordFromMyProfile openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public ResetPasswordFromMyProfile check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                ResetPasswordFromMyProfile.Locator.values(),
                AccountHeader.AccountHeaderLtr.values(),
                Footer.FooterLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                ResetPasswordFromMyProfile.Locators.values(),
                AccountHeader.AccountHeaderLtrs.values(),
                Footer.FooterLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        OLD_PASSWORD_INPUT(By.cssSelector("[name='old_password']")),
        NEW_PASSWORD_INPUT(By.cssSelector("[name='new_password1']")),
        NEW_PASSWORD_CONFIRM(By.cssSelector("[name='new_password2']")),
        ENTER_BUTTON(By.cssSelector("form button")),
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

