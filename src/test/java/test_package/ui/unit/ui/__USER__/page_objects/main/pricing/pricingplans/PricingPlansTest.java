
package test_package.ui.unit.ui.__USER__.page_objects.main.pricing.pricingplans;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__USER__.page_objects.main.pricing.pricingplans.PricingPlans;


public class PricingPlansTest extends OnixUiTestRunner {
    PricingPlans pricingPlans;
    @BeforeClass
    public void openPricingPlans() {
        pricingPlans = openSite(user)
                .goPricingPage()
                .goPricingPlans();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                PricingPlans.Locator.values()
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
                PricingPlans.Locators.values()
                //TODO
        );
    }
}

