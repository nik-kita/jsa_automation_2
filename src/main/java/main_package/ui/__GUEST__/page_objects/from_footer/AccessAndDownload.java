
package main_package.ui.__GUEST__.page_objects.from_footer;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__GUEST__.general_parts.Footer;
import main_package.ui.__GUEST__.general_parts.MainHeader;
import org.openqa.selenium.By;
import main_package.data.S;

public class AccessAndDownload extends OnixPageObject implements MainHeader, Footer {
    private String ENDPOINT_URL = ""; //TODO
    public AccessAndDownload(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "AccessAndDownload"); //TODO
    }


    @Override
    public AccessAndDownload make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public AccessAndDownload openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public AccessAndDownload openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public AccessAndDownload check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                AccessAndDownload.Locator.values(),
                Footer.FooterLtr.values(),
                MainHeader.MainHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                TermsOfService.Locators.values(),
                Footer.FooterLtrs.values(),
                MainHeader.MainHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        H4_TITLE(By.xpath("//h4[contains(text(), 'Access & Download')]")),

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

