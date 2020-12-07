
package main_package.ui.__USER__.page_objects.home_header.home.account.my_plan;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.general_parts.Footer;
import main_package.ui.__USER__.general_parts.home.account.AccountHeader;
import main_package.ui.__USER__.general_parts.home.account.AccountSidebar;
import main_package.ui.__USER__.page_objects.main.pricing.pricingplans.PricingPlans;
import org.openqa.selenium.By;
import main_package.data.S;

public class MyPlan extends OnixPageObject implements Footer, AccountHeader, AccountSidebar {
    private String ENDPOINT_URL = ""; //TODO
    public MyPlan(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "MyPlan"); //TODO
    }

    public PricingPlans clickChangePlan() {
        driver.findElement(Locator.CHANGE_PLAN_LINK).click();
        log.info("Click [{}] link", "Change Plan");
        return new PricingPlans(driver);
    }

    public ConfirmCancelPopup clickCancelSubscriptionPlan() {
        driver.findElement(Locator.CANCEL_SUBSCRIPTION_PLAN_LINK).click();
        log.info("Click [{}] link", "Cancel Subscription Plan");
        return new ConfirmCancelPopup(driver);
    }

    public UpdateCardPopup clickUpdateCard() {
        driver.waitToClick(Locator.UPDATE_CARD_LINK).click();
        log.info("Click [{}] link", "Update Card");
        return new UpdateCardPopup(driver);
    }

    public MyPlan clickRedeem(String code) {
        driver.findElement(Locator.COUPON_CODE_INPUT).sendKeys(code);
        log.info("write [{}] in [{}] input", code, "Coupon Code");
        driver.findElement(Locator.REDEEM_BUTTON).click();
        log.info("click [{}] button", "Redeem");
        driver.alertAccept();
        return this;
    }


    @Override
    public MyPlan make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public MyPlan openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public MyPlan openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public MyPlan check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                MyPlan.Locator.values(),
                Footer.FooterLtr.values(),
                AccountSidebar.AccountSidebarLtr.values(),
                AccountHeader.AccountHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                MyPlan.Locators.values(),
                Footer.FooterLtrs.values(),
                AccountSidebar.AccountSidebarLtrs.values(),
                AccountHeader.AccountHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        CHANGE_PLAN_LINK(By.xpath("//a[text() = 'Change plan']")),
        CANCEL_SUBSCRIPTION_PLAN_LINK(By.cssSelector(".my-plan__action--cancel")),
        UPDATE_CARD_LINK(By.cssSelector(".my-plan__action--update")),
        COUPON_CODE_INPUT(By.cssSelector("[name='coupon']")),
        REDEEM_BUTTON(By.cssSelector("#button-addon2")),
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

