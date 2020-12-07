
package main_package.ui.__USER__.page_objects.home_header.home.my_progress;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.general_parts.home.HomeHeader;
import main_package.ui.__USER__.page_objects.home_header.home.Home;
import main_package.ui.__USER__.page_objects.home_header.home.my_progress.measurements_tab.MeasurementsTab;
import org.openqa.selenium.By;
import main_package.data.S;

public class MyProgress extends OnixPageObject implements HomeHeader {
    private String ENDPOINT_URL = ""; //TODO
    public MyProgress(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "MyProgress"); //TODO
    }

    public MeasurementsTab clickMeasurementsTab() {
        driver.findElement(Locator.MEASUREMENTS_TAB_BUTTON).click();
        log.info("click [{}] tab-button", "Measurements");
        return new MeasurementsTab(driver);
    }

    public ImagesTab clickImagesTab() {
        driver.findElement(Locator.IMAGES_TAB_BUTTON).click();
        log.info("click [{}] tab-button", "Images");
        return new ImagesTab(driver);
    }

    public Home clickBackArrow() {
        driver.findElement(Locator.BACK_HOME_ARROW).click();
        log.info("click [{}] button on [{}] page", "Back Arrow", "My Progress");
        return new Home(driver);
    }


    @Override
    public MyProgress make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public MyProgress openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public MyProgress openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public MyProgress check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                MyProgress.Locator.values(),
                HomeHeader.HomeHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                MyProgress.Locators.values(),
                HomeHeader.HomeHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        BACK_HOME_ARROW(By.xpath("//a[@href='#/home']/img")),
        MEASUREMENTS_TAB_BUTTON(By.xpath("//a[text()='Measurements']")),
        IMAGES_TAB_BUTTON(By.xpath("//a[text()='Images']")),
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

