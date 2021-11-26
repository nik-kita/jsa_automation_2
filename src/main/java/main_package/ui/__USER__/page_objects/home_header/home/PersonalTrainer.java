
package main_package.ui.__USER__.page_objects.home_header.home;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.general_parts.home.HomeHeader;
import org.openqa.selenium.By;
import main_package.data.S;

public class PersonalTrainer extends OnixPageObject implements HomeHeader {
    private String ENDPOINT_URL = ""; //TODO
    public PersonalTrainer(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "PersonalTrainer"); //TODO
    }

    public Home clickClose() {
        driver.findElement(Locator.CLOSE_ICON).click();
        log.info("click [{}] icon", "Close"); //TODO check message
        return new Home(driver);
    }


    @Override
    public PersonalTrainer make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public PersonalTrainer openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public PersonalTrainer openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public PersonalTrainer check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                PersonalTrainer.Locator.values(),
                HomeHeader.HomeHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                PersonalTrainer.Locators.values(),
                HomeHeader.HomeHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        CLOSE_ICON(By.xpath("//div[contains(@class, 'header_two')]//img[contains(@src, 'ic_close')]")),
        INFO_ICON(By.xpath("//img[contains(@src, 'ic_info')]")),
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

