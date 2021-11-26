
package test_package.ui.unit.ui.__USER__.page_objects.home.account.my_profile;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__USER__.page_objects.home_header.home.account.my_profile.EmailPreferences;


public class EmailPreferencesTest extends OnixUiTestRunner {
    EmailPreferences emailPreferences;
    @BeforeClass
    public void openEmailPreferences() {
        emailPreferences = openSite()
                .clickHeaderLogin()
                .login(user)
                .clickAccountIcon()
                .clickMyProfile()
                .clickUpdateEmailPreferences();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                EmailPreferences.Locator.values()
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
                EmailPreferences.Locators.values()
                //TODO
        );
    }
}

