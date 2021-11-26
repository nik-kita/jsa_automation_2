
package main_package.ui.__USER__.page_objects.home_header.learn;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.general_parts.home.HomeHeader;
import org.openqa.selenium.By;
import main_package.data.S;

public class Favourites extends OnixPageObject implements HomeHeader {
    private String ENDPOINT_URL = ""; //TODO
    public Favourites(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "Favourites"); //TODO
    }

    public Learn clickBackArrow() {
        driver.findElement(Locator.BACK_ARROW).click();
        log.info("click [{}] button", "Back Arrow");
        return new Learn(driver);
    }

    @Override
    public Favourites make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public Favourites openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public Favourites openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public Favourites check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Favourites.Locator.values(),
                HomeHeader.HomeHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Favourites.Locators.values(),
                HomeHeader.HomeHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        H6_TITLE(By.xpath("//h6[text() = 'Favourites']")),
        BACK_ARROW(By.cssSelector(".back_link_arrow img")),
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

