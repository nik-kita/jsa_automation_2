
package test_package.ui.unit.ui.__USER__.page_objects.home_header.learn;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__USER__.page_objects.home_header.learn.ToComplete;


public class ToCompleteTest extends OnixUiTestRunner {
    ToComplete toComplete;
    @BeforeClass
    public void openToComplete() {
        toComplete = openSite()
                .clickHeaderLogin()
                .login(user)
                .clickLearnTab()
                .clickToComplete();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                ToComplete.Locator.values()
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
                ToComplete.Locators.values()
                //TODO
        );
    }
}

