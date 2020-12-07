
package main_package.ui.__GUEST__.page_objects.from_footer;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import org.openqa.selenium.By;
import main_package.data.S;

public class ContactUs extends OnixPageObject {
    private String ENDPOINT_URL = ""; //TODO
    public ContactUs(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "ContactUs"); //TODO
    }


    @Override
    public ContactUs make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public ContactUs openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public ContactUs openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public ContactUs check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                ContactUs.Locator.values()
                //TODO
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                ContactUs.Locators.values()
                //TODO
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        //TODO
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

