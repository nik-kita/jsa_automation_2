
package test_package.ui.unit.ui.__USER__.page_objects.home.steps;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__USER__.page_objects.home_header.home.steps.EditYourGoalStepsPopup;


public class EditYourGoalStepsPopupTest extends OnixUiTestRunner {
    EditYourGoalStepsPopup editYourGoalStepsPopup;
    @BeforeClass
    public void openEditYourGoalStepsPopup() {
        editYourGoalStepsPopup = openSite()
                .clickHeaderLogin()
                .login(user)
                .clickStepsLink()
                .clickEditYourStepsGoalIconPenButton();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                EditYourGoalStepsPopup.Locator.values()
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
                EditYourGoalStepsPopup.Locators.values()
                //TODO
        );
    }
}

