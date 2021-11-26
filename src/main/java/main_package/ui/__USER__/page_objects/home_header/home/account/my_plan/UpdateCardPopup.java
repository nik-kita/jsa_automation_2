
package main_package.ui.__USER__.page_objects.home_header.home.account.my_plan;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import org.openqa.selenium.By;
import main_package.data.S;

public class UpdateCardPopup extends OnixPageObject {
    String iFrameCardInputName;
    private String ENDPOINT_URL = ""; //TODO
    public UpdateCardPopup(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "UpdateCardPopup"); //TODO
        iFrameCardInputName = driver
                .findElement(Locator.CARD_NUMBER_INPUT_IFRAME).getSeleniumWebElement()
                .getAttribute("name"); //TODO create getAttribute() in OnixWebElement
    }

    public MyPlan close() {
        driver.waitToClick(Locator.CLOSE_BUTTON).click();
        log.info("click [{}] close button in [{}] popup", "x", "Update Card");
        return new MyPlan(driver);
    }

    @Override
    public UpdateCardPopup make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public UpdateCardPopup openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public UpdateCardPopup openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public UpdateCardPopup check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                UpdateCardPopup.Locator.values()
                //TODO
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                UpdateCardPopup.Locators.values()
                //TODO
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        EMAIL_INPUT(By.cssSelector("input#email")),
        CARD_NUMBER_INPUT_IFRAME(By.xpath("//iframe[contains(@name, 'privateStripeFrame')]")),
        NAME_ON_CARD_INPUT(By.cssSelector("input#customer_name")),
        UPDATE_CARD_BUTTON(By.cssSelector("button#submitPaymentButton")),
        CLOSE_BUTTON(By.cssSelector("#updateCardModal button.close span")),
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

