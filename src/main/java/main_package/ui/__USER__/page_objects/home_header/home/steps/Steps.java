
package main_package.ui.__USER__.page_objects.home_header.home.steps;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.general_parts.home.HomeHeader;
import org.openqa.selenium.By;
import main_package.data.S;

public class Steps extends OnixPageObject implements HomeHeader {
    private String ENDPOINT_URL = ""; //TODO
    public Steps(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "Steps"); //TODO
    }

    public EditYourGoalStepsPopup clickEditYourStepsGoalIconPenButton() {
        driver.findElement(Locator.EDIT_YOUR_GOAL_BUTTON).click();
        log.info("click on [{}] icon pen-button", "Edit Your Goal");
        return new EditYourGoalStepsPopup(driver);
    }

    public EditTodayStepsPopup clickEditTodayStepsIconButton() {
        driver.findElement(Locator.EDIT_TODAY_STEPS_BUTTON).click();
        log.info("click on [{}] icon pen-button", "Edit Today's Steps");
        return new EditTodayStepsPopup(driver);
    }

    public int getTodaySteps() {
        log.debug("get current today step's value");
        return Integer.parseInt(driver.findElement(Locator.TODAY_STEPS_VALUE).text());
    }

    public int getGoalSteps() {
        log.debug("get current goal for steps");
        return Integer.parseInt(driver.findElement(Locator.STEPS_GOAL_VALUE).text());
    }

    public int getDailyAverageValue() {
        log.debug("get daily average of steps");
        if(driver.findElement(Locator.DAILY_AVERAGE_STEPS_VALUE).text().length() == 0) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                log.warn("waiting while daily average number is displaying");
            }
        }
        return Integer.parseInt(driver.findElement(Locator.DAILY_AVERAGE_STEPS_VALUE).text());
    }

    public Steps clickOneWeekButton() {
        log.info("click to [{}] button", "1 W");
        driver.findElement(Locator.ONE_WEEK_BUTTON).click();
        return this;
    }
    public Steps clickOneMonthButton() {
        log.info("click to [{}] button", "1 M");
        driver.findElement(Locator.ONE_MONTH_BUTTON).click();
        return this;
    }
    public Steps clickThreeMonthsButton() {
        log.debug("click to [{}] button", "3 M");
        driver.findElement(Locator.THREE_MONTH_BUTTON).click();
        return this;
    }



    @Override
    public Steps make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public Steps openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public Steps openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public Steps check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Steps.Locator.values(),
                HomeHeader.HomeHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Steps.Locators.values(),
                HomeHeader.HomeHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        BACK_HOME_ARROW(By.xpath("//a[@href='#/home']/img")),
        EDIT_YOUR_GOAL_BUTTON(By.cssSelector(".steps_goal img")),
        EDIT_TODAY_STEPS_BUTTON(By.cssSelector(".todays_steps img")),
        ONE_WEEK_BUTTON(By.xpath("//div[text() = '1 W']")),
        ONE_MONTH_BUTTON(By.xpath("//div[text() = '1 M']")),
        THREE_MONTH_BUTTON(By.xpath("//div[text()= '3 M']")),
        TODAY_STEPS_VALUE(By.cssSelector(".todays_steps_value")),
        STEPS_GOAL_VALUE(By.cssSelector(".steps_goal_value")),
        DAILY_AVERAGE_STEPS_VALUE(By.cssSelector(".average_steps_value")),
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

