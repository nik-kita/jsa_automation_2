
package main_package.ui.__USER__.page_objects.home_header.home;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.general_parts.home.HomeHeader;
import main_package.ui.__USER__.general_parts.home.HomePart;
import main_package.ui.__USER__.page_objects.home_header.home.account.my_plan.MyPlan;
import main_package.ui.__USER__.page_objects.home_header.home.my_goal.MyGoal;
import main_package.ui.__USER__.page_objects.home_header.home.my_progress.MyProgress;
import main_package.ui.__USER__.page_objects.home_header.home.steps.Steps;
import main_package.ui.__related_sites__.FacebookGroupPage;
import org.openqa.selenium.By;
import main_package.data.S;

public class Home extends OnixPageObject implements HomePart {
    private String ENDPOINT_URL = ""; //TODO
    public Home(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "Home"); //TODO
    }

    public String getCurrentGoalTitle() {
        String result = driver.findElement(By.cssSelector(".my_goal_overview_body_heading")).text();
        log.debug("the current goal title is: [{}]", result);
        return result;
    }
    public String getCurrentGoalText() {
        String result = driver.findElement(By.cssSelector(".my_goal_overview_body_goal")).text();
        log.debug("the current goal text is: [{}]", result);
        return result;
    }

    public MyPlan clickAccountIcon() {
        driver.findElement(Locator.MY_PLAN_ACCOUNT_ICON_LINK).click();
        log.info("click [{}] div-link on [{}] page", "My Plan", "Home");
        return new MyPlan(driver);
    }
    public MyGoal clickMyGoalLink() {
        driver.findElement(Locator.MY_GOAL_DIV_LINK).click();
        log.info("click [{}] div-link on [{}] page", "My Goal", "Home");
        return new MyGoal(driver);
    }

    public Steps clickStepsLink() {
        driver.findElement(Locator.STEPS_DIV_LINK).click();
        log.info("click on [{}] dev-link", "Steps");
        return new Steps(driver);
    }


    public MyProgress clickMyProgressLink() {
        driver.findElement(Locator.MY_PROGRESS_DIV_LINK).click();
        log.info("click [{}] div-link", "My Progress");
        return new MyProgress(driver);
    }

    public Challenges clickChallenges() {
        driver.findElement(Locator.CHALLENGE_DIV_LINK).click();
        log.info("click [{}] div-link", "Challenge");
        return new Challenges(driver);
    }
//TODO for SimpleUser mode
//    public PricingPlans clickUpgradeToAccess() {
//        driver.findElement(Locator.UPGRADE_TO_ACCESS_BTN).click();
//        return new PricingPlans(driver);
//    }


    public FacebookGroupPage clickJoinNow() {
        driver.findElement(Locator.JOIN_NOW_BUTTON_LINK).click();
        driver.switchAnotherTab("jsa");
        log.info("click [{}] button", "Join Now");
        return new FacebookGroupPage(driver);
    }

    @Override
    public Home make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public Home openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public Home openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public Home check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Home.Locator.values(),
                HomeHeader.HomeHeaderLtr.values(),
                HomePart.HomePartLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Home.Locators.values(),
                HomeHeader.HomeHeaderLtrs.values(),
                HomePart.HomePartLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        MY_PLAN_ACCOUNT_ICON_LINK(By.cssSelector("[href='/users/account/my-plan']")),
        GET_STARTED_6_STEPS_DIV_LINK(By.cssSelector("[href='#/home/step-two']")),
        MY_GOAL_DIV_LINK(By.cssSelector("[href='#/home/my-goal']")),
        STEPS_DIV_LINK(By.cssSelector("[href='#/home/steps']")),
        EDIT_IMG_BTM_IN_STEPS_DIV(By.cssSelector(".todays_steps img")),
        MY_PROGRESS_DIV_LINK(By.cssSelector("[href='#/home/my-progress']")),
        CHALLENGE_DIV_LINK(By.cssSelector("[href='#/home/challenges']")),
        JOIN_NOW_BUTTON_LINK(By.cssSelector("[href=\"https://www.facebook.com/groups/193449874723532/\"]")),
//TODO  UPGRADE_TO_ACCESS_BTN(By.cssSelector(".facebook_group [href='/users/pricing/']")),
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

