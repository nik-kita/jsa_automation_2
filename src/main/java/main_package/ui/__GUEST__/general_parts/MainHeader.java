
package main_package.ui.__GUEST__.general_parts;

import main_package.data.S;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPart;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__GUEST__.page_objects.main.Challenge;
import main_package.ui.__GUEST__.page_objects.main.Main;
import main_package.ui.__GUEST__.page_objects.main.Pricing;
import main_package.ui.__GUEST__.page_objects.main.Transformations;
import main_package.ui.__GUEST__.page_objects.main.login.CreateAccount;
import main_package.ui.__GUEST__.page_objects.main.login.Login;
import main_package.ui.__GUEST__.page_objects.main.my_podcast.MyPodcast;
import org.openqa.selenium.By;

import static main_package.ui.__GUEST__.general_parts.MainHeader.MainHeaderLtr.*;

public interface MainHeader extends OnixPart {

    default Main clickHeaderJsaLogo() {
        OnixWebDriver driver = getDriver();
        driver.findElement(JSA_LOGO).click();
        getLog().info("click [Jsa logo] button in header");
        return new Main(driver);
    }
    default Main clickHeaderJsaLogo(OnixUiAssert onixUiAssert) {
        return clickHeaderJsaLogo().check(onixUiAssert);
    }

    default Challenge clickHeaderChallenge() {
        OnixWebDriver driver = getDriver();
        driver.findElement(CHALLENGE_HEADER_BUTTON).
                click();
        getLog().info("click [Challenge] button in header");
        return new Challenge(driver);
    }
    default Challenge clickHeaderChallenge(OnixUiAssert onixUiAssert) {
        return clickHeaderChallenge().check(onixUiAssert);
    }
    default Pricing clickHeaderPricing() {
        OnixWebDriver driver = getDriver();
        driver.findElement(PRICING_HEADER_BUTTON).
                click();
        getLog().info("click [Pricing] button in header");
        return new Pricing(driver);
    }
    default Pricing clickHeaderPricing(OnixUiAssert onixUiAssert) {
        return clickHeaderPricing().check(onixUiAssert);
    }
    default Transformations clickHeaderTransformations() {
        OnixWebDriver driver = getDriver();
        driver.findElement(TRANSFORMATIONS_HEADER_BUTTON).
                click();
        getLog().info("click [Transformations] button in header");
        return new Transformations(driver);
    }
    default Transformations clickHeaderTransformations(OnixUiAssert onixUiAssert) {
        return clickHeaderTransformations().check(onixUiAssert);
    }
    default Login clickHeaderLogin() {
        OnixWebDriver driver = getDriver();
        driver.findElement(LOGIN_HEADER_BUTTON).click();
        getLog().info("click [Login] button in header");
        return new Login(driver);
    }
    default Login clickHeaderLogin(OnixUiAssert onixUiAssert) {
        return clickHeaderLogin().check(onixUiAssert);
    }

    default CreateAccount clickHeaderJoinNow() {
        OnixWebDriver driver = getDriver();
        driver.findElement(JOIN_NOW_HEADER_BUTTON).click();
        getLog().info("click [Join now] button in header");
        return new CreateAccount(driver);
    }
    default CreateAccount clickHeaderJoinNow(OnixUiAssert onixUiAssert) {
        return clickHeaderJoinNow().check(onixUiAssert);
    }

    default MyPodcast clickHeaderMyPodcast() {
        OnixWebDriver driver = getDriver();
        driver.findElement(MY_PODCAST_HEADER_BUTTON).click();
        getLog().info("click [My Podcast] button in header");
        return new MyPodcast(driver);
    }
    default MyPodcast clickHeaderMyPodcast(OnixUiAssert onixUiAssert) {
        return clickHeaderMyPodcast().check(onixUiAssert);
    }


    enum MainHeaderLtr implements OnixLocator {
        JSA_LOGO(By.cssSelector("a[href='/'] img")),
        //TODO books
        PRICING_HEADER_BUTTON(By.cssSelector(".nav a[href='/pricing/']")),
        TRANSFORMATIONS_HEADER_BUTTON(By.cssSelector(".nav a[href='/transformations/']")),
        CHALLENGE_HEADER_BUTTON(By.cssSelector(".nav a[href='/challenge/about/']")),
        MY_PODCAST_HEADER_BUTTON(By.cssSelector(".nav a[href='/podcasts/']")),
        LOGIN_HEADER_BUTTON(By.cssSelector(".nav a[href='/users/login/']")),
        JOIN_NOW_HEADER_BUTTON(By.cssSelector(".nav a[href='/users/register/']")),
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

    