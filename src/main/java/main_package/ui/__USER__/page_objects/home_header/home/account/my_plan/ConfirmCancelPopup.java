
package main_package.ui.__USER__.page_objects.home_header.home.account.my_plan;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import org.openqa.selenium.By;
import main_package.data.S;

public class ConfirmCancelPopup extends OnixPageObject {
    private String ENDPOINT_URL = ""; //TODO
    public ConfirmCancelPopup(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "ConfirmCancelPopup"); //TODO
    }

    public MyPlan close() {
        driver.waitToClick(Locator.CLOSE_BUTTON).click();
        log.info("click [{}] close button", "x");
        return new MyPlan(driver);
    }

    @Override
    public ConfirmCancelPopup make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public ConfirmCancelPopup openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public ConfirmCancelPopup openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public ConfirmCancelPopup check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                ConfirmCancelPopup.Locator.values()
                //TODO
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                ConfirmCancelPopup.Locators.values()
                //TODO
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        MAIN_REASON_SELECT(By.cssSelector("select#main_reason")),
        LET_US_KNOW_TEXTAREA(By.cssSelector("textarea#explanation")),
        SUBMIT_FEEDBACK_BUTTON(By.cssSelector("button[onclick='_postFeedback()']")),
        CANCEL_SUBSCRIPTION_BUTTON(By.cssSelector("button[name='submitButton']")),
        CLOSE_BUTTON(By.cssSelector("#cancelModal button.close span")),
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

