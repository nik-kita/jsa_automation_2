
package test_package.ui.unit.ui.__USER__.page_objects.main.pricing.pricingplans;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__USER__.page_objects.main.pricing.pricingplans.payment_popup.PaymentMethodPopup;


public class PaymentMethodPopupTest extends OnixUiTestRunner {
    PaymentMethodPopup paymentMethodPopup;
    @BeforeClass
    public void openPaymentMethodPopup() {
        //TODO
        //paymentMethodPopup = openSite();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                PaymentMethodPopup.Locator.values()
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
                PaymentMethodPopup.Locators.values()
                //TODO
        );
    }
}

