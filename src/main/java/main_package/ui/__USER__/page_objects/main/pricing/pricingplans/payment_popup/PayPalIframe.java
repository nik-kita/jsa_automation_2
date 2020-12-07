
package main_package.ui.__USER__.page_objects.main.pricing.pricingplans.payment_popup;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import org.openqa.selenium.By;
import main_package.data.S;

public class PayPalIframe extends OnixPageObject {
    private String ENDPOINT_URL = ""; //TODO
    public PayPalIframe(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "PayPalIframe"); //TODO
    }

    public void clickPayPalButton() {
        driver.findElement(Locator.PAYPAL_BTN_IN_PAYPAL_IFRAME).click();
        log.info("click [{}] button", "PayPal");
    }

    public void clickDebitOrCreditCard() {
        driver.findElement(Locator.DEBIT_OR_CREDIT_BTN_IN_PAYPAL_IFRAME).click();
        log.info("click [{}] button", "Debit Or Credit Card");
    }

    public PaymentMethodPopup clickCardTab() {
        driver.toParentFrame();
        log.info("click [{}] tab-button", "Card");
        return new PaymentMethodPopup(driver);
    }

    @Override
    public PayPalIframe make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public PayPalIframe openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public PayPalIframe openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public PayPalIframe check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                PayPalIframe.Locator.values()
                //TODO
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                PayPalIframe.Locators.values()
                //TODO
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        PAYPAL_BTN_IN_PAYPAL_IFRAME(By.xpath("//div[@class='paypal-button-label-container']//img[@aria-label='PayPal']")),
        DEBIT_OR_CREDIT_BTN_IN_PAYPAL_IFRAME(By.xpath("//*[@class='paypal-button-label-container']//span[contains(text(), 'Debit or Credit')]")),
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

