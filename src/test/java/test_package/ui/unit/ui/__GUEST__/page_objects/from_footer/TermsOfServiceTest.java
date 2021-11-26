
package test_package.ui.unit.ui.__GUEST__.page_objects.from_footer;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import main_package.ui.__GUEST__.general_parts.Footer;
import main_package.ui.__GUEST__.general_parts.MainHeader;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__GUEST__.page_objects.from_footer.TermsOfService;


public class TermsOfServiceTest extends OnixUiTestRunner {
    TermsOfService termsOfService;
    @BeforeClass
    public void openTermsOfService() {
        termsOfService = openSite().clickFooterTermsOfService();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                TermsOfService.Locator.values(),
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
                TermsOfService.Locators.values(),
                Footer.FooterLtrs.values(),
                MainHeader.MainHeaderLtrs.values()
        );
    }
}

