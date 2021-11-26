
package main_package.ui.__USER__.page_objects.home_header.home.steps;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import org.openqa.selenium.By;
import main_package.data.S;

public class EditTodayStepsPopup extends OnixPageObject {
    private String ENDPOINT_URL = ""; //TODO
    public EditTodayStepsPopup(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "EditTodayStepsPopup"); //TODO
    }

    public Steps close() {
        driver.findElement(Locator.CLOSE_BUTTON).click();
        log.info("click [{}] close button in [{}] popup", "x", "Add Today's Steps");
        if(driver.isElementPresent(Locator.CLOSE_BUTTON)) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                log.warn("Waiting for invisibility of modal window (popup).");
            }
        }
        return new Steps(driver);
    }

    public Steps update(int steps) {
        driver.findElement(Locator.TODAY_STEPS_INPUT).getSeleniumWebElement().clear();
        driver.findElement(Locator.TODAY_STEPS_INPUT).sendKeys(String.valueOf(steps));
        log.info("Write [{}] into [{}] input.", steps, "Today's Steps");
        driver.findElement(Locator.UPDATE_BUTTON).click();
        if(driver.isElementPresent(Locator.UPDATE_BUTTON)) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                log.warn("Waiting for invisibility of modal window (popup).");
            }
        }
        return new Steps(driver);
    }

    @Override
    public EditTodayStepsPopup make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public EditTodayStepsPopup openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public EditTodayStepsPopup openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public EditTodayStepsPopup check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                EditTodayStepsPopup.Locator.values()
                //TODO
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                EditTodayStepsPopup.Locators.values()
                //TODO
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        CLOSE_BUTTON(By.cssSelector(".modal-window .btn img")),
        TODAY_STEPS_INPUT(By.cssSelector("input[name='steps']")),
        UPDATE_BUTTON(By.cssSelector(".todays_step_form .btn-primary"))
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

