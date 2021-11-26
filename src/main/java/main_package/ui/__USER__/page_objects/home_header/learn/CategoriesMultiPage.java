
package main_package.ui.__USER__.page_objects.home_header.learn;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.general_parts.home.HomeHeader;
import org.openqa.selenium.By;
import main_package.data.S;

public class CategoriesMultiPage extends OnixPageObject implements HomeHeader {
    private String ENDPOINT_URL = ""; //TODO
    public CategoriesMultiPage(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "CategoriesMultiPage"); //TODO
    }

    public Learn clickBackArrow() {
        driver.findElement(Locator.BACK_ARROW).click();
        log.info("click [{}] button", "Back Arrow");
        return new Learn(driver);
    }

    public enum CategoriesVariant {
        INTRODUCING, EXERCISE_PRINCIPLES, NUTRITION_PRINCIPLES, EXERCISES, MOBILITY_FUNCTIONS, SOCIAL_MEDIA,
    }

    @Override
    public CategoriesMultiPage make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public CategoriesMultiPage openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public CategoriesMultiPage openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public CategoriesMultiPage check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                CategoriesMultiPage.Locator.values(),
                HomeHeader.HomeHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                CategoriesMultiPage.Locators.values(),
                HomeHeader.HomeHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        DROPDOWN_CATEGORY_MENU(By.cssSelector("#dropdownCategoryMenu")),
        SEARCH(By.cssSelector("[href='#/learn/search']")),
        BACK_ARROW(By.cssSelector(".back_link_arrow img")),
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
        VIDEO_ITEM(By.cssSelector(".horizontal_video_list_item_image")),
        CATEGORY_TAG_ITEM(By.cssSelector(".sub_category_menu_item")),
        SEE_ALL_ITEM(By.xpath("//a[text() = 'See All']")),
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

