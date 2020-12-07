
package main_package.ui.__USER__.page_objects.main.pricing.pricingplans.payment_popup;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.page_objects.main.pricing.pricingplans.PricingPlans;
import org.openqa.selenium.By;
import main_package.data.S;

public class PaymentMethodPopup extends OnixPageObject {
    String PAYPAL_IFRAME_NAME;
    private String ENDPOINT_URL = ""; //TODO

    public PaymentMethodPopup(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "PaymentMethodPopup"); //TODO
    }

    public PricingPlans exit() {
        driver.waitToClick(Locator.EXIT_X_BUTTON).click();
        if (driver.isElementPresent(Locator.EXIT_X_BUTTON)) {
            driver.waitInvisibilityOf(Locator.EXIT_X_BUTTON);
        }
        log.info("click [{}] exit button in [{}] popup", "x", "Payment Method");
        return new PricingPlans(driver);
    }

    public void clickPayWithCard() {
        driver.findElement(Locator.PAY_WITH_CARD_BUTTON).click();
        log.info("click [{}] tab-button", "Pay With Card");
    }

    public PaymentMethodPopup clickPayPalTab() {
        driver.findElement(Locator.PAY_PALL_TAB).click();
        PAYPAL_IFRAME_NAME = driver
                .getSeleniumDriver()
                .findElement(By.xpath("//iframe"))
                .getAttribute("name");
        log.trace("retrieve paypal iframe [name] attribute \n[{}]", PAYPAL_IFRAME_NAME);
        return this;
    }

    public PaymentMethodPopup clickCardTab() {
        driver.findElement(Locator.CARD_TAB).click();
        log.info("click [{}] tab-button", "Card");
        return this;
    }

    public PayPalIframe switchToPayPalIframe() {
        if (PAYPAL_IFRAME_NAME == null) {
            clickPayPalTab();
        }
        driver.getSeleniumDriver().switchTo().frame(PAYPAL_IFRAME_NAME);
        return new PayPalIframe(driver);
    }


    @Override
    public PaymentMethodPopup make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public PaymentMethodPopup openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }

    @Override
    public PaymentMethodPopup openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }

    @Override
    public PaymentMethodPopup check(OnixUiAssert onixUiAssert) {
        for (OnixLocator l : OnixUiAssert.mergeArrays(
                PaymentMethodPopup.Locator.values()
                //TODO
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for (OnixLocator l : OnixUiAssert.mergeArrays(
                PaymentMethodPopup.Locators.values()
                //TODO
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        EXIT_X_BUTTON(By.xpath("(//span[contains(text(), '×')])[1]")),
        PAY_PALL_TAB(By.id("nav-paypal-tab")),
        CARD_TAB(By.id("nav-card-tab")),
        PAY_WITH_CARD_BUTTON(By.xpath("//button[contains(text(), 'Pay with Card')]")),
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

