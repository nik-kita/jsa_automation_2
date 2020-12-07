
package main_package.ui.__USER__.page_objects.home_header.nutrition;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.general_parts.home.HomeHeader;
import main_package.ui.__USER__.general_parts.home.HomePart;
import org.openqa.selenium.By;
import main_package.data.S;

public class ShoppingLists extends OnixPageObject implements HomePart {
    private String ENDPOINT_URL = ""; //TODO
    public ShoppingLists(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "ShoppingLists"); //TODO
    }


    public Recipes clickRecipesTab() {
        driver.findElement(Locator.RECIPES_TAB).click();
        log.info("click [{}] tab-button", "Recipes");
        return new Recipes(driver);
    }
    public Meals clickMealsTab() {
        driver.findElement(Locator.MEALS_TAB).click();
        log.info("click [{}] tab-button", "Meals");
        return new Meals(driver);
    }

    @Override
    public ShoppingLists make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public ShoppingLists openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public ShoppingLists openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public ShoppingLists check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                ShoppingLists.Locator.values(),
                HomeHeader.HomeHeaderLtr.values(),
                HomePart.HomePartLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                ShoppingLists.Locators.values(),
                HomeHeader.HomeHeaderLtrs.values(),
                HomePart.HomePartLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        RECIPES_TAB(By.cssSelector(".tab-nav-bar-container [href='#/nutrition/recipes']")),
        MEALS_TAB(By.cssSelector(".tab-nav-bar-container [href='#/nutrition/meals']")),

        ;
        private By path;
        private S[] actions;
        Locator(By path) {
            this.path = path;
        }
        Locator(By path, S... actions) {
            this.path = path;
            this.actions = actions;
        }
        @Override
        public By getPath() {
            return path;
        }
        @Override
        public S[] specialActions() {
           return actions;
        }
    }

    public enum Locators implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        Locators(By path) {
            this.path = path;
        }
        Locators(By path, S... actions) {
            this.path = path;
            this.actions = actions;
        }
        @Override
        public By getPath() {
            return path;
        }
        @Override
        public S[] specialActions() {
           return actions;
        }
    }

}

