
package main_package.ui.__GUEST__.page_objects.main;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__GUEST__.general_parts.Footer;
import main_package.ui.__GUEST__.general_parts.MainHeader;
import org.openqa.selenium.By;
import main_package.data.S;

public class Transformations extends OnixPageObject implements MainHeader, Footer {
    private String ENDPOINT_URL = ""; //TODO
    private By TRANSFORMATION_BLOCK = By.xpath(
            "//div[@class='masonry-grid']//div[contains(@class, 'masonry-block')][contains(@style, 'display: block')]"
    );
    private By HIDDEN_SEE_MORE_BUTTON = By.xpath("//*[@class='transformation_wr']//a[@style='display: none;']");

    public Transformations(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "Transformations"); //TODO
    }


    public Transformations clickSeeMoreButton() {
        driver.findElement(Locator.SEE_MORE_BUTTON).click();
        log.info("Click [{}] button", "See more");
        return new Transformations(driver);
    }

    public int countTransformations() {
        log.trace("count posts");
        return driver.findElements(TRANSFORMATION_BLOCK).size();
    }

    public boolean isSeeMoreButtonPresent() {
        return driver
                .findElement(Locator.SEE_MORE_BUTTON)
                .getSeleniumWebElement().isDisplayed();
    }

    public boolean seeMore() {
        if (isSeeMoreButtonPresent()) {
            clickSeeMoreButton();
            return true;
        }
        log.debug("all posts are shown so 'see more' button is not exists");
        return false;
    }

    @Override
    public Transformations make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public Transformations openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }

    @Override
    public Transformations openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }

    @Override
    public Transformations check(OnixUiAssert onixUiAssert) {
        for (OnixLocator l : OnixUiAssert.mergeArrays(
                Transformations.Locator.values(),
                Footer.FooterLtr.values(),
                MainHeader.MainHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for (OnixLocator l : OnixUiAssert.mergeArrays(
                Transformations.Locators.values(),
                Footer.FooterLtrs.values(),
                MainHeader.MainHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        SEE_MORE_BUTTON(By.cssSelector(".transformation_wr a"), S.SCROLL_PAGE_DOWN),

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

