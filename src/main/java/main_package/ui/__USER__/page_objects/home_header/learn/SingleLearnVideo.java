
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

public class SingleLearnVideo extends OnixPageObject implements HomeHeader {
    private String ENDPOINT_URL = ""; //TODO
    public SingleLearnVideo(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "SingleLearnVideo"); //TODO
    }

    public Learn clickBackArrow() {
        driver.findElement(Locator.BACK_ARROW).click();
        log.info("click [{}] button", "Back Arrow");
        return new Learn(driver);
    }

    @Override
    public SingleLearnVideo make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public SingleLearnVideo openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public SingleLearnVideo openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public SingleLearnVideo check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                SingleLearnVideo.Locator.values(),
                HomeHeader.HomeHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                SingleLearnVideo.Locators.values(),
                HomeHeader.HomeHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        BACK_ARROW(By.cssSelector(".back_link_arrow img")),
        FAVOURITES_HEART_BUTTON(By.xpath("//button//div[text() = 'Favourites']")),
        COMPLETED_ICON_BUTTON(By.xpath("//button//div[text() = 'Completed']")),
        NEXT_VIDEO_LINK(By.cssSelector(".up_next_video a")),
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
        VIDEO_ITEM_FROM_LIST(By.cssSelector(".related_videos.container .related_videos_item_body")),
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

