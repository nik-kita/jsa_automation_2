
package test_package.ui.unit.ui.__USER__.page_objects.home.my_goal;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__USER__.page_objects.home_header.home.my_goal.NewWeeklyGoal;


public class NewWeeklyGoalTest extends OnixUiTestRunner {
    NewWeeklyGoal newWeeklyGoal;
    @BeforeClass
    public void openNewWeeklyGoal() {
        newWeeklyGoal = openSite()
                .clickHeaderLogin()
                .login(user)
                .clickMyGoalLink()
                .clickNewGoalButton();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                NewWeeklyGoal.Locator.values()
                //TODO
        );
    }

    @Test(dataProvider = "getRepeated")
    public void repeated(OnixLocator locator) {
        onixUiAssert.
                checkMinimumOfElementsByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getRepeated() {
        return mergeArrays(
                NewWeeklyGoal.Locators.values()
                //TODO
        );
    }
}

