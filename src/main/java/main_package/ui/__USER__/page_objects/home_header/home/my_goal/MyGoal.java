
package main_package.ui.__USER__.page_objects.home_header.home.my_goal;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.engine.ui_engine.OnixWebElement;
import main_package.ui.__USER__.general_parts.home.HomeHeader;
import main_package.ui.__USER__.page_objects.home_header.home.Home;
import org.openqa.selenium.By;
import main_package.data.S;

public class MyGoal extends OnixPageObject  implements HomeHeader {
    private String ENDPOINT_URL = ""; //TODO
    public MyGoal(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "MyGoal"); //TODO
    }

    public boolean hasWeeklyGoal() {
        boolean result = driver.isElementPresent(Locators.WEEKLY_GOAL);
        if(result) {
            log.debug("page has weeklyGoal");
        } else {
            log.debug("no weeklyGoal elements on page");
        }
        return result;
    }
    public int amountOfWeeklyGoals () {
        int result = driver.findElements(Locators.WEEKLY_GOAL).size();
        log.debug("there are [{}] weeklyGoals on the page", result);
        return result;
    }
    public MyGoal clickAcceptWeeklyGoal(String name) {
        OnixWebElement e = driver.findElement(By.xpath(String.format("//p[contains(text(), '%s')]/../../..", name)));
        e.findElementInsideThis(By.cssSelector("img.save_goal")).click();
        log.info("accept weeklyGoal that contains [{}] word", name);
        return this;
    }
    public MyGoal clickDeleteWeeklyGoal(String name) {
        By pathToWeeklyGoal = By.xpath(String.format("//p[contains(text(), '%s')]/../../..", name));
        OnixWebElement e = driver.findElement(pathToWeeklyGoal);
        e.findElementInsideThis(By.cssSelector("img.delete_goal")).click();
        driver.alertAccept();
        if(driver.isElementPresent(pathToWeeklyGoal)) {
            driver.waitInvisibilityOf(e);
        }
        log.info("delete weeklyGoal that contains [{}] word by accepting delete alert", name);
        return this;
    }
    public MyGoal clickAcceptWeeklyGoal(int number) {
        OnixWebElement e = driver.findElements(Locators.WEEKLY_GOAL).get(number);
        e = e.findElementInsideThis(By.cssSelector("img.save_goal"));
        e.click();
        log.info("accept weeklyGoal number {}", number);
        return this;
    }
    public MyGoal clickDeleteWeeklyGoal(int number) {
        int before = amountOfWeeklyGoals();
        OnixWebElement e = driver.findElements(Locators.WEEKLY_GOAL).get(number);
        e.findElementInsideThis(By.cssSelector("img.delete_goal")).click();
        driver.alertAccept();
        if(before == amountOfWeeklyGoals()) {
            driver.waitInvisibilityOf(e);
        }
        log.info("delete weeklyGoal number {} by accepting delete alert", number);
        return this;
    }
    public MyGoal removeAllWeeklyGoals() {
        for(OnixWebElement e : driver.findElements(Locators.WEEKLY_GOAL)) {
            e.findElementInsideThis(By.cssSelector("img.delete_goal")).click();
            driver.alertAccept();
        }
        log.debug("delete all weeklyGoal on page");
        return this;
    }


    public Home clickBackArrow() {
        driver.findElement(Locator.BACK_ARROW).click();
        log.info("click [{}] button on [{}]", "Back Arrow", "My Goal");
        return new Home(driver);
    }
    public MyGoal selectGoalByString(String select) {
        driver.findElement(Locator.GOAL_SELECT).click();
        for(OnixWebElement e : driver.findElements(Locators.OPTION_IN_GOAL_SELECT)) {
            if(e.text().equals(select)) {
                e.click();
                break;
            }
        }
        log.info("select goal that contains [{}] in name", select);
        return this;
    }
    public MyGoal selectGoal(int number) {
        driver.findElement(Locator.GOAL_SELECT).click();
        driver.findElements(Locators.OPTION_IN_GOAL_SELECT).get(number).click();
        log.info("select goal number {}", number);
        return this;
    }
    public MyGoal selectGoal() {
        return selectGoal(0);
    }
    public MyGoal fillMoreDetailTextarea(String text) {
        OnixWebElement textarea = driver.findElement(Locator.MORE_DETAIL_TEXTAREA);
        textarea.click();
        textarea.getSeleniumWebElement().clear();
        textarea.sendKeys(text);
        log.info("fill [{}] textarea with text:\n[{}]", "More Details", text);
        return this;
    }
    public MyGoal clickSaveButton() {
        driver.findElement(Locator.SAVE_BUTTON).click();
        log.info("click [{}] button", "Save");
        return this;
    }
    public NewWeeklyGoal clickNewGoalButton() {
        driver.findElement(Locator.NEW_GOAL_BUTTON).click();
        log.info("click [{}] button", "New Goal");
        return new NewWeeklyGoal(driver);
    }

    public NewWeeklyGoal clickNewGoalButton(OnixUiAssert onixUiAssert) {
        driver.findElement(Locator.NEW_GOAL_BUTTON).click();
        log.info("click on [{}] button.", "New Goal");
        for(OnixLocator l : NewWeeklyGoal.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        return new NewWeeklyGoal(driver);
    }



    @Override
    public MyGoal make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public MyGoal openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public MyGoal openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public MyGoal check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                MyGoal.Locator.values(),
                HomeHeader.HomeHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                MyGoal.Locators.values(),
                HomeHeader.HomeHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        BACK_ARROW(By.xpath("//img[contains(@src, 'ic_back_purple')]")),
        GOAL_SELECT(By.cssSelector("select[name='goalCategory']")),
        MORE_DETAIL_TEXTAREA(By.cssSelector("textarea[name='goal']")),
        SAVE_BUTTON(By.xpath("//button[contains(text(), 'Save')]")),
        NEW_GOAL_BUTTON(By.xpath("//div[contains(@class, 'weekly_goal_list')]//button[text()='New Goal']")),
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
        OPTION_IN_GOAL_SELECT(By.cssSelector("select[name='goalCategory'] option")),
        WEEKLY_GOAL(By.className("weekly_goal_list_item")),
        DONE_ACTIVE(By.xpath("//img[contains(@src, 'bt_done.svg')]")),
        DONE_GRAY(By.xpath("//img[contains(@src, 'bt_done_gray')]")),
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

