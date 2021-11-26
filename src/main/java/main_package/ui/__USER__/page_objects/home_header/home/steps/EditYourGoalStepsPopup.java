
package main_package.ui.__USER__.page_objects.home_header.home.steps;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import org.openqa.selenium.By;
import main_package.data.S;

public class EditYourGoalStepsPopup extends OnixPageObject {
    private String ENDPOINT_URL = ""; //TODO
    public EditYourGoalStepsPopup(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "EditYourGoalStepsPopup"); //TODO
    }

    public Steps close() {
        driver.findElement(EditTodayStepsPopup.Locator.CLOSE_BUTTON).click();
        log.info("click [{}] close button in [{}] popup", "x", "Daily Step Goal");
        if(driver.isElementPresent(EditTodayStepsPopup.Locator.CLOSE_BUTTON)) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                log.warn("Waiting for invisibility of modal window (popup).");
            }
        }
        return new Steps(driver);
    }

    public Steps update(int steps) {
        driver.findElement(EditYourGoalStepsPopup.Locator.DAILY_STEP_GOAL_INPUT).getSeleniumWebElement().clear();
        driver.findElement(EditYourGoalStepsPopup.Locator.DAILY_STEP_GOAL_INPUT).sendKeys(String.valueOf(steps));
        log.info("Write [{}] into [{}] input.", steps, "Today's Steps");
        driver.findElement(Locator.SAVE_BUTTON).click();
        if(driver.isElementPresent(Locator.SAVE_BUTTON)) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                log.warn("Waiting for invisibility of modal window (popup).");
            }
        }
        return new Steps(driver);
    }


    @Override
    public EditYourGoalStepsPopup make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public EditYourGoalStepsPopup openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public EditYourGoalStepsPopup openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public EditYourGoalStepsPopup check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                EditYourGoalStepsPopup.Locator.values()
                //TODO
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                EditYourGoalStepsPopup.Locators.values()
                //TODO
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        CLOSE_BUTTON(By.cssSelector(".modal-window .btn img")),
        DAILY_STEPS_GOAL_INPUT(By.cssSelector("input[name='steps']")),
        DAILY_STEP_GOAL_INPUT(By.cssSelector("input[name='steps']")),
        SAVE_BUTTON(By.cssSelector(".steps_goal_form .btn-primary"))

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

