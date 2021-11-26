
package main_package.ui.__GUEST__.page_objects.main.my_podcast;

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

public class MyPodcast extends OnixPageObject implements Footer, MainHeader {
    private String ENDPOINT_URL = ""; //TODO
    public MyPodcast(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "MyPodcast"); //TODO
    }

    public PodcastEpisode clickEpisodeContains(String partOfTheEpisodeName) {
        By uniqueEpisode = By.xpath("//div[@class='content']//a[contains(text(), '" + partOfTheEpisodeName + "')]");
        driver.findElement(uniqueEpisode).click();
        log.info("click [{}] that contains [{}] word in name", "My Podcast Episode", partOfTheEpisodeName);
        return new PodcastEpisode(driver);
    }
    public PodcastEpisode clickSomeoneEpisode() {
        driver.findElement(Locators.ONE_EPISODE).click();
        log.info("click to any of episodes on [{}] page", "My Podcast");
        return new PodcastEpisode(driver);
    }


    @Override
    public MyPodcast make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public MyPodcast openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public MyPodcast openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public MyPodcast check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                MyPodcast.Locator.values(),
                MainHeader.MainHeaderLtr.values(),
                Footer.FooterLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                MyPodcast.Locators.values(),
                MainHeader.MainHeaderLtrs.values(),
                Footer.FooterLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        APPLE_PODCASTS_LINK(By.xpath("//a[contains(@href, 'podcasts.apple')]")),
        SPOTIFY_LINK(By.xpath("//a[contains(@href, 'open.spotify')]")),
        YOUTUBE_LINK(By.xpath("//div[@class='buttons']//a[contains(@href, 'youtube')]")),
        SHARE_LINK_CHAIN_IMAGE(By.xpath("//div[@class='item']//img[contains(@src, 'ic_url')]")),
        FACEBOOK_SHARE_LINK(By.xpath("//div[@class='item']//img[contains(@src, 'ic_facebook')]")),
        TWITTER_SHARE_LINK(By.xpath("//div[@class='item']//img[contains(@src, 'ic_twitter')]")),

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
        ONE_EPISODE(By.cssSelector(".content .podcast_image")),

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

