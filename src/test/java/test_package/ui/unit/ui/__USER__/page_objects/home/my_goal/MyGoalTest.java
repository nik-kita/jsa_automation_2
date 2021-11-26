
package test_package.ui.unit.ui.__USER__.page_objects.home.my_goal;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__USER__.page_objects.home_header.home.my_goal.MyGoal;


public class MyGoalTest extends OnixUiTestRunner {
    MyGoal myGoal;
    @BeforeClass
    public void openMyGoal() {
        myGoal = openSite()
                .clickHeaderLogin()
                .login(user)
                .clickMyGoalLink();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                MyGoal.Locator.values()
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
                MyGoal.Locators.values()
                //TODO
        );
    }
}

