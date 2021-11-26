
package main_package.ui.__USER__.page_objects.main.pricing;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.general_parts.Footer;
import main_package.ui.__USER__.general_parts.MainHeader;
import main_package.ui.__USER__.page_objects.main.pricing.pricingplans.PricingPlans;
import org.openqa.selenium.By;
import main_package.data.S;

public class Pricing extends OnixPageObject implements Footer, MainHeader {
    private String ENDPOINT_URL = ""; //TODO
    public Pricing(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "Pricing"); //TODO
    }


    public PricingPlans goPricingPlans() {
        driver.findElement(Locator.GET_STARTED_LEFT).click();
        log.info("click [{}] button", "Get Started");
        return new PricingPlans(driver);
    }

    @Override
    public Pricing make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public Pricing openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public Pricing openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public Pricing check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Pricing.Locator.values(),
                Footer.FooterLtr.values(),
                MainHeader.MainHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Pricing.Locators.values(),
                Footer.FooterLtrs.values(),
                MainHeader.MainHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        SUBSCRIPTIONS_BUTTON(By.xpath("//*[contains(text(), 'Subscriptions')]")),
        BLOCKS_BUTTON(By.xpath("//*[contains(text(), 'Blocks')]")),
        GET_STARTED_LEFT(By.xpath("//div[@class='price_block']//div[contains(text(), 'Standard Plan')]/../..//a")),
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

