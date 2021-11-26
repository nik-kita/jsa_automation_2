
package test_package.ui.unit.ui.__GUEST__.page_objects;


import main_package.data.User;
import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import main_package.ui.__GUEST__.general_parts.Footer;
import main_package.ui.__GUEST__.general_parts.MainHeader;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__GUEST__.page_objects.AfterLogout;


public class AfterLogoutTest extends OnixUiTestRunner {
    AfterLogout afterLogout;
    @BeforeClass
    public void openAfterLogout() {
        afterLogout = openSite().clickHeaderLogin().login(User.getValidUser()).openUserDropDown().logout();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                AfterLogout.Locator.values(),
                Footer.FooterLtr.values(),
                MainHeader.MainHeaderLtr.values()
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
                AfterLogout.Locators.values(),
                Footer.FooterLtrs.values(),
                MainHeader.MainHeaderLtrs.values()
        );
    }
}

