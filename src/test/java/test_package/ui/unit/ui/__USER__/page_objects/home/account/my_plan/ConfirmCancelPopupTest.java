
package test_package.ui.unit.ui.__USER__.page_objects.home.account.my_plan;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__USER__.page_objects.home_header.home.account.my_plan.ConfirmCancelPopup;


public class ConfirmCancelPopupTest extends OnixUiTestRunner {
    ConfirmCancelPopup confirmCancelPopup;
    @BeforeClass
    public void openConfirmCancelPopup() {
        confirmCancelPopup = openSite().clickHeaderLogin()
                .login(user)
                .clickAccountIcon()
                .clickCancelSubscriptionPlan();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                ConfirmCancelPopup.Locator.values()
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
                ConfirmCancelPopup.Locators.values()
                //TODO
        );
    }
}

