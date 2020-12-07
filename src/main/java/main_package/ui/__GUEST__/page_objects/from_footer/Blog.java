
package main_package.ui.__GUEST__.page_objects.from_footer;

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

public class Blog extends OnixPageObject implements MainHeader, Footer {
    private String ENDPOINT_URL = ""; //TODO
    public Blog(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "Blog"); //TODO
    }

    public Blog clickRecentPosts() {
        driver.findElement(Blog.Locator.RECENT_POSTS).click();
        log.info("click [{}] button", "Recent Posts");
        return this;
    }

    public Blog clickOnlineFitness() {
        driver.findElement(Blog.Locator.ONLINE_FITNESS).click();
        log.info("click [{}] button", "Online Fitness");
        return this;
    }

    public Blog clickNews() {
        driver.findElement(Blog.Locator.NEWS).click();
        log.info("click [{}] button", "News");
        return this;
    }

    public Blog clickThinking() {
        driver.findElement(Blog.Locator.THINKING).click();
        log.info("click [{}] button", "Thinking");
        return this;
    }

    public Blog clickFeedback() {
        driver.findElement(Blog.Locator.FEEDBACK).click();
        log.info("click [{}] button", "Feedback");
        return this;
    }

    public int countPosts() {
        driver.scrollPageDown();
        int result =  driver.findElements(Locators.POST).size();
        driver.scrollPageUp();
        log.trace("count posts in current tab on 'Blog' page ({})", result);
        return result;
    }



    @Override
    public Blog make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public Blog openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public Blog openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public Blog check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Blog.Locator.values(),
                Footer.FooterLtr.values(),
                MainHeader.MainHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                TermsOfService.Locators.values(),
                Footer.FooterLtrs.values(),
                MainHeader.MainHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        RECENT_POSTS(By.xpath("//span[contains(text(), 'Recent posts')]")),
        ONLINE_FITNESS(By.xpath("//span[contains(text(), 'Online Fitness')]")),
        NEWS(By.xpath("//span[contains(text(), 'News')]")),
        TRAINING(By.xpath("//span[contains(text(), 'Training')]")),
        THINKING(By.xpath("//span[contains(text(), 'Thinking')]")),
        FEEDBACK(By.xpath("//span[contains(text(), 'Feedback')]")),

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
        POST(By.cssSelector(".post")),
        LINK_IN_POST(By.cssSelector(".post div.post_descr a.title")),
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

