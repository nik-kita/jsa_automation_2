
package main_package.ui.__USER__.page_objects.main.pricing.pricingplans;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.general_parts.Footer;
import main_package.ui.__USER__.general_parts.home.account.AccountHeader;
import main_package.ui.__USER__.page_objects.home_header.home.Home;
import main_package.ui.__USER__.page_objects.main.pricing.pricingplans.payment_popup.PaymentMethodPopup;
import org.openqa.selenium.By;
import main_package.data.S;

import static main_package.ui.__USER__.general_parts.home.account.AccountHeader.AccountHeaderLtr.HOME_HEADER_BUTTON;

public class PricingPlans extends OnixPageObject implements Footer, AccountHeader {
    private String ENDPOINT_URL = ""; //TODO
    public PricingPlans(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "PricingPlans"); //TODO
    }

    public Home goHome() {
        driver.findElement(HOME_HEADER_BUTTON).click();
        log.info("click [{}] button in home-header", "Home");
        return new Home(driver);
    }

    public PaymentMethodPopup subscribeStandard() {
        driver.scrollPageDown();
        driver.findElement(Locator.SUBSCRIBE_BTN_STANDARD_PLAN).click();
        log.info("click [{}] button in [{}] tab", "Subscribe", "Standard Plan");
        return new PaymentMethodPopup(driver);
    }
    public PaymentMethodPopup subscribePremium() {
        driver.scrollPageDown();
        driver.findElement(Locator.SUBSCRIBE_BTN_PREMIUM_PLAN).click();
        log.info("click [{}] button in [{}] tab", "Subscribe", "Premium Plan");
        return new PaymentMethodPopup(driver);
    }

    public PaymentMethodPopup buyNow() {
        clickBlocksButton();
        driver.scrollPageDown();
        driver.findElement(BlocksTabLocator.BUY_NOW_BUTTON).click();
        log.info("click [{}] button in [{}] tab", "Buy Now", "Blocks");
        return new PaymentMethodPopup(driver);
    }
    public PricingPlans clickBlocksButton() {
        driver.scrollPageUp();
        driver.findElement(Locator.BLOCKS_BUTTON).click();
        log.info("click [{}] tab-button", "Blocks");
        return this;
    }

    public PricingPlans clickSubscriptionsButton() {
        driver.scrollPageUp();
        driver.findElement(Locator.SUBSCRIPTIONS_BUTTON).click();
        log.info("click [{}] button", "Subscription"); //TODO wtf? check! change log sms
        return this;
    }


    @Override
    public PricingPlans make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public PricingPlans openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public PricingPlans openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public PricingPlans check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                PricingPlans.Locator.values(),
                AccountHeader.AccountHeaderLtr.values(),
                Footer.FooterLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                PricingPlans.Locators.values(),
                AccountHeader.AccountHeaderLtrs.values(),
                Footer.FooterLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        SUBSCRIPTIONS_BUTTON(By.xpath("//*[contains(text(), 'Subscriptions')]")),
        BLOCKS_BUTTON(By.xpath("//*[contains(text(), 'Blocks')]")),
        SUBSCRIBE_BTN_STANDARD_PLAN(By.id("standardSubscriptionButton")),
        SUBSCRIBE_BTN_PREMIUM_PLAN(By.id("premiumSubscriptionButton")),

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

    //TODO

    /**
     * TODO
     * make separate page object for 'Block Tab' !!!
     */
    public enum BlocksTabLocator implements OnixLocator {
        BUY_NOW_BUTTON(By.cssSelector("#premiumBlockButton")),

        ;
        private By path;
        private S[] actions;
        BlocksTabLocator(By path) {
            this.path = path;
        }
        BlocksTabLocator(By path, S... actions) {
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

