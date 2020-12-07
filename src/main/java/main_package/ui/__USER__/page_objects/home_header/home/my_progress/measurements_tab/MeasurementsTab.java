
package main_package.ui.__USER__.page_objects.home_header.home.my_progress.measurements_tab;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.general_parts.home.HomeHeader;
import org.openqa.selenium.By;
import main_package.data.S;

public class MeasurementsTab extends OnixPageObject implements HomeHeader {
    private String ENDPOINT_URL = ""; //TODO
    public MeasurementsTab(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "MeasurementsTab"); //TODO
    }


    @Override
    public MeasurementsTab make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public MeasurementsTab openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public MeasurementsTab openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public MeasurementsTab check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                MeasurementsTab.Locator.values(),
                HomeHeader.HomeHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                MeasurementsTab.Locators.values(),
                HomeHeader.HomeHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        BENCH(By.xpath("//p[text()='Bench']")),
        DEADLIFT(By.xpath("//p[text()='Deadlift']")),
        SQUAT(By.xpath("//p[text()='Squat']")),
        _1_KM_TIMED(By.xpath("//p[text()='1 Km Timed']")),
        ARM(By.xpath("//p[text()='Arm']")),
        CHEST(By.xpath("//p[text()='Chest']")),
        WAIST(By.xpath("//p[text()='Waist']")),
        HIP(By.xpath("//p[text()='Hip']")),
        THIGH(By.xpath("//p[text()='Thigh']")),
        CALF(By.xpath("//p[text()='Calf']")),
        CUSTOM_BUTTON(By.xpath("//button[text()='Custom']"))
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

