package test_package.ui.business;

import io.qameta.allure.Allure;
import main_package.data.User;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixWebElement;
import main_package.ui.__GUEST__.page_objects.main.Main;
import main_package.ui.__USER__.page_objects.home_header.home.Home;
import main_package.ui.__USER__.page_objects.home_header.home.my_goal.MyGoal;
import main_package.ui.__USER__.page_objects.home_header.home.steps.Steps;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Date;

public class WSHome extends OnixUiTestRunner {
    @Test
    public void myGoal() {
        Allure.link("Full test's info", "https://docs.google.com/spreadsheets/d/1gudjZ7fh4aUsozP7aPIovLnI4qGdbUFpIHJ6AbTlbC4/edit#gid=1648986495&range=C11:D11");
        log.info("1. Open https://www.jamessmithacademy.com/");
        Main main = openSite();
        for (OnixLocator l : Main.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.debug("Check that 'Main' page is open.");
        log.info("2. Login to the site");
        Home home = main.clickHeaderLogin().login(User.getValidUser());
        for (OnixLocator l : Home.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.debug("Check that 'Home' page is open.");
        String firstGoalTitle = home.getCurrentGoalTitle();
        String firstGoalText = home.getCurrentGoalText();
        log.info("3. Click on 'My Goal'");
        MyGoal myGoal = home.clickMyGoalLink();
        for (OnixLocator l : MyGoal.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.debug("Check that 'MyGoal' page is open.");
        String goalName = "Lose Fat";
        log.info("4. Select '{}' from 'Overall Goal'", goalName);
        myGoal = myGoal.selectGoalByString(goalName);
        Select select = new Select(driver.findElement(MyGoal.Locator.GOAL_SELECT).getSeleniumWebElement());
        String activeSelectOption = select.getFirstSelectedOption().getText();
        onixUiAssert.getSoftAssert().assertEquals(activeSelectOption, goalName);
        myGoal.fillMoreDetailTextarea("");
        log.info("Checking that selected option is displayed as active.");
        log.info("5. Click on 'Save' button with leaving empty 'in more details' textarea.");
        myGoal = myGoal.clickSaveButton();
        home = myGoal.clickHomeTab();
        onixUiAssert.getSoftAssert().assertEquals(firstGoalText, home.getCurrentGoalText());
        onixUiAssert.getSoftAssert().assertEquals(firstGoalTitle, home.getCurrentGoalTitle());
        log.info("Check that changes were not saved.");
        log.info("You should fill in the \"In more detail\" field");
        String text = "Blablabla";
        home = home.clickMyGoalLink().fillMoreDetailTextarea(text).selectGoalByString(goalName).clickSaveButton().clickHomeTab();
        onixUiAssert.getSoftAssert().assertEquals(goalName, home.getCurrentGoalTitle());
        onixUiAssert.getSoftAssert().assertEquals(text, home.getCurrentGoalText());
        log.info("Check that after filling textarea the goal was successfully saved.");
        log.debug("Return old values to these field for future retesting.");
        home.clickMyGoalLink()
                .selectGoalByString("Other")
                .fillMoreDetailTextarea("Test is successfully ended in " + new Date(System.currentTimeMillis()))
                .clickSaveButton()
                .openUserDropDown().logout().clickHeaderJsaLogo();
        log.info("Logout");
        onixUiAssert.assertAll();
    }

    @Test
    public void myGoal_2() {
        Allure.link("Full test's info", "https://docs.google.com/spreadsheets/d/1gudjZ7fh4aUsozP7aPIovLnI4qGdbUFpIHJ6AbTlbC4/edit#gid=1648986495&range=C11:D11");
        openSite().check(onixUiAssert)
                .clickHeaderLogin().check(onixUiAssert)
                .login(User.getValidUser()).check(onixUiAssert)
                .make(() -> {
                    Fly.testMap.put("oldGoalTitle", new Home(driver).getCurrentGoalTitle());
                    Fly.testMap.put("oldGoalText", new Home(driver).getCurrentGoalText());
                    Fly.testMap.put("testGoalTitle", "Improve Overall Health");
                    Fly.testMap.put("testGoalText", "Don't worry be happy!");
                })
                .clickMyGoalLink().check(onixUiAssert)
                .selectGoalByString((String) Fly.testMap.get("testGoalTitle"))
                .make(() -> {
                    onixUiAssert.getSoftAssert().assertEquals(new Select(driver.findElement(MyGoal.Locator.GOAL_SELECT)
                            .getSeleniumWebElement())
                            .getFirstSelectedOption().getText(), Fly.testMap.get("testGoalTitle"));
                    log.info("Check that select display correct active option.");
                })
                .fillMoreDetailTextarea("")
                .clickSaveButton()
                .clickHomeTab()
                .make(() -> {
                    onixUiAssert.getSoftAssert()
                            .assertEquals(new Home(driver).getCurrentGoalTitle(), Fly.testMap.get("oldGoalTitle"));
                    onixUiAssert.getSoftAssert()
                            .assertEquals(new Home(driver).getCurrentGoalText(), Fly.testMap.get("oldGoalText"));
                    log.info("Check that goal don't saved without adding text to 'in more details' textarea.");
                })
                .clickMyGoalLink()
                .selectGoalByString((String) Fly.testMap.get("testGoalTitle"))
                .fillMoreDetailTextarea((String) Fly.testMap.get("testGoalText"))
                .clickSaveButton()
                .clickHomeTab()
                .make(() -> {
                    onixUiAssert.getSoftAssert()
                            .assertEquals(new Home(driver).getCurrentGoalTitle(), Fly.testMap.get("testGoalTitle"));
                    onixUiAssert.getSoftAssert()
                            .assertEquals(new Home(driver).getCurrentGoalText(), Fly.testMap.get("testGoalText"));
                    log.info("Check that after filling textarea the goal was successfully saved.");
                })
                .make(() -> log.debug("Return old values to these field for future retesting."))
                .clickMyGoalLink()
                .selectGoalByString("Other")
                .fillMoreDetailTextarea("Test is successfully ended in " + new Date(System.currentTimeMillis()))
                .clickSaveButton()
                .openUserDropDown().logout().clickHeaderJsaLogo();
        log.info("Logout");
    }

    @Test
    public void weeklyGoal() {
        Allure.link("Full test's info", "https://docs.google.com/spreadsheets/d/1gudjZ7fh4aUsozP7aPIovLnI4qGdbUFpIHJ6AbTlbC4/edit#gid=1648986495&range=C24:D24");
        String testText = "Hello world! " + new Date(System.currentTimeMillis()).toString();

        openSite().check(onixUiAssert)
                .clickHeaderLogin().check(onixUiAssert)
                .login(User.getValidUser()).check(onixUiAssert)
                .clickMyGoalLink().check(onixUiAssert)
                .clickNewGoalButton().check(onixUiAssert)
                .save(testText, () -> {
                    boolean isSave = false;
                    for (OnixWebElement p : driver.findElements(MyGoal.Locators.WEEKLY_GOAL)) {
                        if (p.text().equals(testText)) {
                            isSave = true;
                            break;
                        }
                    }
                    onixUiAssert.getSoftAssert().assertTrue(isSave);
                }).openUserDropDown().logout().clickHeaderJsaLogo();

        onixUiAssert.assertAll();
    }

    @Test
    public void steps() {
        Allure.link("Full test's info", "https://docs.google.com/spreadsheets/d/1gudjZ7fh4aUsozP7aPIovLnI4qGdbUFpIHJ6AbTlbC4/edit?ts=5f7593b0#gid=1648986495&range=C34:D34");
        int stepsForTest = (int) (Math.random() * 100);
        openSite().check(onixUiAssert)
                .clickHeaderLogin().check(onixUiAssert)
                .login(User.getValidUser()).check(onixUiAssert)
                .clickStepsLink().check(onixUiAssert)
                .clickEditTodayStepsIconButton().check(onixUiAssert)
                .update(stepsForTest)
                .make(() -> {
                    onixUiAssert.getSoftAssert().assertEquals(new Steps(driver).getTodaySteps(), stepsForTest);
                    log.info("Check that new step's value '{}' is saving.", stepsForTest);
                }).openUserDropDown().logout().clickHeaderJsaLogo();
        log.info("Logout");
        onixUiAssert.assertAll();
    }

    @Test
    public void stepsInside() {
        Allure.link("Full test's info", "https://docs.google.com/spreadsheets/d/1gudjZ7fh4aUsozP7aPIovLnI4qGdbUFpIHJ6AbTlbC4/edit?ts=5f7593b0#gid=1648986495&range=C44:D44");

        int todayStepsForTest = (int) (Math.random() * 100);
        int stepsGoalForTest = (int) (Math.random() * 1000);

        openSite()
                .clickHeaderLogin()
                .login(User.getValidUser())
                .clickStepsLink().check(onixUiAssert)
                .clickEditYourStepsGoalIconPenButton()
                .update(stepsGoalForTest)
                .make(() -> Fly.testMap.put("dailyAverage", new Steps(driver).getDailyAverageValue()))
                .clickEditTodayStepsIconButton()
                .update(todayStepsForTest)
                .make(() -> {
                    Steps steps = new Steps(driver);
                    int todaySteps = steps.getTodaySteps();
                    int stepsGoal = steps.getGoalSteps();
                    onixUiAssert.softCheckCount(todayStepsForTest, todaySteps);
                    onixUiAssert.softCheckCount(stepsGoalForTest, stepsGoal);
                    int dailyAverage = (int) Fly.testMap.get("dailyAverage");
                    onixUiAssert.getSoftAssert().assertNotEquals(dailyAverage, steps.getDailyAverageValue());
                    dailyAverage = steps.getDailyAverageValue();
                    steps.clickOneMonthButton();
                    onixUiAssert.getSoftAssert().assertNotEquals(dailyAverage, steps.getDailyAverageValue());
                    steps.clickThreeMonthsButton();
                    onixUiAssert.getSoftAssert().assertNotEquals(dailyAverage, steps.getDailyAverageValue());
                    dailyAverage = steps.getDailyAverageValue();
                    steps.clickOneWeekButton();
                    onixUiAssert.getSoftAssert().assertNotEquals(dailyAverage, steps.getDailyAverageValue());
                })
                .openUserDropDown().logout().clickHeaderJsaLogo();
    }
}

