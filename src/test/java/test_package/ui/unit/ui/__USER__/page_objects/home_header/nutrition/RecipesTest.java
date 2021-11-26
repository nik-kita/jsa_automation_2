
package test_package.ui.unit.ui.__USER__.page_objects.home_header.nutrition;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__USER__.page_objects.home_header.nutrition.Recipes;


public class RecipesTest extends OnixUiTestRunner {
    Recipes recipes;
    @BeforeClass
    public void openRecipes() {
        recipes = openSite()
                .clickHeaderLogin()
                .login(user)
                .clickNutritionTab()
                .clickRecipesTab();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                Recipes.Locator.values()
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
                Recipes.Locators.values()
                //TODO
        );
    }
}

