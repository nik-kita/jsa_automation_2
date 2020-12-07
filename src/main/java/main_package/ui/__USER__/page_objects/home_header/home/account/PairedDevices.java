
package main_package.ui.__USER__.page_objects.home_header.home.account;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.general_parts.Footer;
import main_package.ui.__USER__.general_parts.home.account.AccountHeader;
import main_package.ui.__USER__.general_parts.home.account.AccountSidebar;
import org.openqa.selenium.By;
import main_package.data.S;

public class PairedDevices extends OnixPageObject implements AccountHeader, AccountSidebar, Footer {
    private String ENDPOINT_URL = ""; //TODO
    public PairedDevices(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "PairedDevices"); //TODO
    }


    @Override
    public PairedDevices make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public PairedDevices openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public PairedDevices openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public PairedDevices check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                PairedDevices.Locator.values(),
                Footer.FooterLtr.values(),
                AccountSidebar.AccountSidebarLtr.values(),
                AccountHeader.AccountHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                PairedDevices.Locators.values(),
                Footer.FooterLtrs.values(),
                AccountSidebar.AccountSidebarLtrs.values(),
                AccountHeader.AccountHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        CONNECT_TO_FITBIT_BUTTON(By.xpath("//a[contains(text(), 'Connect to Fitbit')]")),
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

