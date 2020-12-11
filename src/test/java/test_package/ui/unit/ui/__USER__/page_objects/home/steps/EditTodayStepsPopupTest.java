
package test_package.ui.unit.ui.__USER__.page_objects.home.steps;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__USER__.page_objects.home_header.home.steps.EditTodayStepsPopup;


public class EditTodayStepsPopupTest extends OnixUiTestRunner {
    EditTodayStepsPopup editTodayStepsPopup;
    @BeforeClass
    public void openEditTodayStepsPopup() {
        editTodayStepsPopup = openSite()
                .clickHeaderLogin()
                .login(user)
                .clickStepsLink()
                .clickEditTodayStepsIconButton();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                EditTodayStepsPopup.Locator.values()
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
                EditTodayStepsPopup.Locators.values()
                //TODO
        );
    }
}

