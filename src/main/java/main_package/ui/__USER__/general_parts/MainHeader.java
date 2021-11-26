
package main_package.ui.__USER__.general_parts;

import main_package.data.S;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPart;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.page_objects.home_header.home.Home;
import main_package.ui.__USER__.page_objects.main.Challenge;
import main_package.ui.__USER__.page_objects.main.Main;
import main_package.ui.__USER__.page_objects.main.Transformations;
import main_package.ui.__USER__.page_objects.main.my_podcast.MyPodcast;
import main_package.ui.__USER__.page_objects.main.pricing.Pricing;
import org.openqa.selenium.By;

import static main_package.ui.__USER__.general_parts.MainHeader.MainHeaderLtr.*;

public interface MainHeader extends OnixPart {

    default Home goHome() {
        OnixWebDriver driver = getDriver();
        driver.findElement(TO_USER_HOME_CORNER_LINK).click();
        getLog().info("Click [{}] header button", "to user's home icon link");
        return new Home(driver);
    }

    default Main goMainPage() {
        OnixWebDriver driver = getDriver();
        driver.findElement(JSA_LOGO).click();
        getLog().info("Click [{}] header button", "JSA logo");
        return new Main(driver);
    }
    default Pricing goPricingPage() {
        OnixWebDriver driver = getDriver();
        driver.findElement(PRICING_HEADER_BUTTON).click();
        getLog().info("Click [{}] header button", "Pricing");
        return new Pricing(driver);
    }
    default Challenge goChallengePage() {
        OnixWebDriver driver = getDriver();
        driver.findElement(CHALLENGE_HEADER_BUTTON).click();
        getLog().info("Click [{}] header button", "Challenge");
        return new Challenge(driver);
    }
    default Transformations goTransformationsPage() {
        OnixWebDriver driver = getDriver();
        driver.findElement(TRANSFORMATIONS_HEADER_BUTTON).click();
        getLog().info("Click [{}] header button", "Transformations");
        return new Transformations(driver);
    }
    default MyPodcast goMyPodcastPageFromHeader() {
        OnixWebDriver driver = getDriver();
        driver.findElement(MY_PODCAST_HEADER_BUTTON).click();
        getLog().info("Click [{}] header button", "My Podcast");
        return new MyPodcast(driver);
    }


    enum MainHeaderLtr implements OnixLocator {
        JSA_LOGO(By.cssSelector("a[href='/'] img")),
        BOOK_LOGO(By.cssSelector(".nav a[href='/not-a-diet-book/'] img")),//TODO there are two books logos on this locator
        PRICING_HEADER_BUTTON(By.cssSelector(".nav a[href='/pricing/']")),
        TRANSFORMATIONS_HEADER_BUTTON(By.cssSelector(".nav a[href='/transformations/']")),
        CHALLENGE_HEADER_BUTTON(By.cssSelector(".nav a[href='/challenge/about/']")),
        MY_PODCAST_HEADER_BUTTON(By.cssSelector(".nav a[href='/podcasts/']")),
        TO_USER_HOME_CORNER_LINK(By.cssSelector("[href='/users/']")),
        ;
        private By path;
        private S[] actions;
        MainHeaderLtr(By path) {
            this.path = path;
        }
        MainHeaderLtr(By path, S... actions) {
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

    enum MainHeaderLtrs implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        MainHeaderLtrs(By path) {
            this.path = path;
        }
        MainHeaderLtrs(By path, S... actions) {
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

    