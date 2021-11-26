
package main_package.ui.__GUEST__.page_objects.main.login;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__related_sites__.InCurrentTab;
import org.openqa.selenium.By;
import main_package.data.S;

public class AppleWindowForLogin extends OnixPageObject implements InCurrentTab {
    private String ENDPOINT_URL = ""; //TODO
    public AppleWindowForLogin(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "AppleWindowForLogin"); //TODO
    }


    @Override
    public AppleWindowForLogin make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public AppleWindowForLogin openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public AppleWindowForLogin openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public AppleWindowForLogin check(OnixUiAssert onixUiAssert) {
        onixUiAssert.softCheckUrlContains("apple");
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                AppleWindowForLogin.Locator.values()
                //TODO
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                AppleWindowForLogin.Locators.values()
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

