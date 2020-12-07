
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

public class Browse extends OnixPageObject implements HomePart {
    private String ENDPOINT_URL = ""; //TODO
    public Browse(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "Browse"); //TODO
    }

    public Personalised clickPersonalisedTab() {
        driver.findElement(Locator.PERSONALISED_TAB).click();
        log.info("click [{}] tab-button", "Personalised");
        return new Personalised(driver);
    }
    public MyWorkouts clickMyWorkoutsTab() {
        driver.findElement(Locator.MY_WORKOUTS_TAB).click();
        log.info("click [{}] tab-button", "My Workouts");
        return new MyWorkouts(driver);
    }

    @Override
    public Browse make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public Browse openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public Browse openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public Browse check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Browse.Locator.values(),
                HomePart.HomePartLtr.values(),
                HomeHeader.HomeHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Browse.Locators.values(),
                HomePart.HomePartLtrs.values(),
                HomeHeader.HomeHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        PERSONALISED_TAB(By.cssSelector(".tab-nav-bar-container [href='#/workouts/personalised']")),
        MY_WORKOUTS_TAB(By.cssSelector(".tab-nav-bar-container [href='#/workouts/myworkouts']"))
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

