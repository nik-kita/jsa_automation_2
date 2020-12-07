
package main_package.ui.__USER__.page_objects.home_header.home.my_goal;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import org.openqa.selenium.By;
import main_package.data.S;

public class NewWeeklyGoal extends OnixPageObject {
    private String ENDPOINT_URL = ""; //TODO
    public NewWeeklyGoal(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "NewWeeklyGoal"); //TODO
    }

    public MyGoal clickCloseButton() {
        driver.findElement(Locator.CLOSE_X_BUTTON).click();
        log.info("click [{}] close button in [{}] popup", "x", "New Weekly Goal");
        return new MyGoal(driver);
    }
    public MyGoal save(String text) {
        driver.findElement(Locator.GAOL_TEXTAREA).sendKeys(text);
        driver.findElement(Locator.SAVE_BUTTON).click();
        if(driver.isElementPresent(Locator.SAVE_BUTTON)) {
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                log.error(e.getMessage());
            }
            log.warn("waiting for invisibility of [{}] button", "Save");
        }
        log.info("click [{}] button after adding some text \n[{}]", "Save", text);
        return new MyGoal(driver);
    }

    public MyGoal save(String text, Fly fly) {
        driver.findElement(Locator.GAOL_TEXTAREA).sendKeys(text);
        driver.findElement(Locator.SAVE_BUTTON).click();
        if(driver.isElementPresent(Locator.SAVE_BUTTON)) {
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                log.error(e.getMessage());
            }
            log.warn("waiting for invisibility of [{}] button", "Save");
        }
        log.info("click [{}] button after adding some text \n[{}]", "Save", text);
        fly.make();
        return new MyGoal(driver);
    }


    @Override
    public NewWeeklyGoal make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public NewWeeklyGoal openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public NewWeeklyGoal openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public NewWeeklyGoal check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                NewWeeklyGoal.Locator.values()
                //TODO
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                NewWeeklyGoal.Locators.values()
                //TODO
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        CLOSE_X_BUTTON(By.xpath("//button//img[contains(@src, 'close')]")),
        GAOL_TEXTAREA(By.cssSelector(".new_weekly_goal_form textarea[name='goal']")),
        SAVE_BUTTON(By.xpath("//div[@class='modal-window']//button[text()='Save']")),
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

