
package test_package.ui.unit.ui.__USER__.page_objects.home_header.workouts;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__USER__.page_objects.home_header.workouts.MyWorkouts;


public class MyWorkoutsTest extends OnixUiTestRunner {
    MyWorkouts myWorkouts;
    @BeforeClass
    public void openMyWorkouts() {
        myWorkouts = openSite()
                .clickHeaderLogin()
                .login(user)
                .clickWorkoutsTab()
                .clickMyWorkoutsTab();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                MyWorkouts.Locator.values()
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
                MyWorkouts.Locators.values()
                //TODO
        );
    }
}

