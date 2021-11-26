
package main_package.ui.__USER__.page_objects.home_header.workouts;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.general_parts.home.HomeHeader;
import main_package.ui.__USER__.general_parts.home.HomePart;
import org.openqa.selenium.By;
import main_package.data.S;

public class MyWorkouts extends OnixPageObject implements HomePart {
    private String ENDPOINT_URL = ""; //TODO
    public MyWorkouts(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "MyWorkouts"); //TODO
    }

    public Personalised clickPersonalisedTab() {
        driver.findElement(Locator.PERSONALISED_TAB).click();
        log.info("click [{}] tab-button", "Personalised");
        return new Personalised(driver);
    }
    public Browse clickBrowseTab() {
        driver.findElement(Locator.BROWSE_TAB).click();
        log.info("click [{}] tab-button", "Browse");
        return new Browse(driver);
    }

    @Override
    public MyWorkouts make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public MyWorkouts openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public MyWorkouts openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public MyWorkouts check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                MyWorkouts.Locator.values(),
                HomePart.HomePartLtr.values(),
                HomeHeader.HomeHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                MyWorkouts.Locators.values(),
                HomePart.HomePartLtrs.values(),
                HomeHeader.HomeHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        PERSONALISED_TAB(By.cssSelector(".tab-nav-bar-container [href='#/workouts/personalised']")),
        BROWSE_TAB(By.cssSelector(".tab-nav-bar-container [href='#/workouts/browse']")),
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

