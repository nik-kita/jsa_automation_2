
package main_package.ui.__USER__.page_objects.home_header.learn;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.general_parts.home.HomeHeader;
import main_package.ui.__USER__.general_parts.home.HomePart;
import main_package.ui.__USER__.page_objects.home_header.learn.single_learn_video.SingleLearnVideo;
import org.openqa.selenium.By;
import main_package.data.S;

public class Learn extends OnixPageObject implements HomePart {
    private String ENDPOINT_URL = ""; //TODO
    public Learn(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "Learn"); //TODO
    }

    public SearchVideos clickSearchIcon() {
        driver.findElement(Locator.SEARCH_ICON).click();
        log.info("click [{}] icon", "Search");
        return new SearchVideos(driver);
    }

    public CategoriesMultiPage clickCategory() {
        driver.findElement(Locator.CATEGORY_INTRODUCING).click();
        log.info("click [{}] button", "Category Introducing");
        return new CategoriesMultiPage(driver);
    }

    public Favourites clickFavourites() {
        driver.findElement(Locator.FAVOURITES).click();
        log.info("click [{}] button", "Favourites");
        return new Favourites(driver);
    }

    public ToComplete clickToComplete() {
        driver.findElement(Locator.TO_COMPLETE).click();
        log.info("click [{}] button", "To Complete");
        return new ToComplete(driver);
    }
    public SingleLearnVideo clickVideo() {
        driver.findElement(Locators.VIDEO_ITEM).click();
        log.info("click on video-item");
        return new SingleLearnVideo(driver);
    }



    @Override
    public Learn make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public Learn openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public Learn openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public Learn check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Learn.Locator.values(),
                HomeHeader.HomeHeaderLtr.values(),
                HomePart.HomePartLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Learn.Locators.values(),
                HomeHeader.HomeHeaderLtrs.values(),
                HomePart.HomePartLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        SEARCH_ICON(By.cssSelector(".navbar-nav [href='#/learn/search']")),
        CATEGORY_INTRODUCING(By.cssSelector("[href=\"#/learn/category/14/Introducing\"]")),
        CATEGORY_EX_PRINCIPLES(By.cssSelector("[href=\"#/learn/category/15/Exercise Principles\"]")),
        CATEGORY_NUTRITION_PRINCIPLES(By.cssSelector("[href=\"#/learn/category/16/Nutrition Principles\"]")),
        CATEGORY_EXERCISES(By.cssSelector("[href=\"#/learn/category/26/Exercises\"]")),
        CATEGORY_MOBILITY_FUNCTIONS(By.cssSelector("[href=\"#/learn/category/19/Mobility & Functions\"]")),
        CATEGORY_SOCIAL_MEDIA(By.cssSelector("[href=\"#/learn/category/21/Social Media\"]")),
        FAVOURITES(By.cssSelector("[href=\"#/learn/favourite\"]")),
        TO_COMPLETE(By.cssSelector("[href=\"#/learn/uncompleted\"]")),

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

