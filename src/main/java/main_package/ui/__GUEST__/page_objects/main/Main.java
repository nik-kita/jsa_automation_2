
package main_package.ui.__GUEST__.page_objects.main;;
    
import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__GUEST__.general_parts.Footer;
import main_package.ui.__GUEST__.general_parts.MainHeader;
import main_package.ui.__GUEST__.page_objects.main.login.CreateAccount;
import main_package.ui.__related_sites__.AppStorePage;
import main_package.ui.__related_sites__.FacebookPage;
import main_package.ui.__related_sites__.GooglePlayPage;
import main_package.ui.__related_sites__.InstagramPage;
import org.openqa.selenium.By;
import main_package.data.S;

public class Main extends OnixPageObject implements MainHeader, Footer {
    private String ENDPOINT_URL = ""; //TODO
    public Main(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "Main"); //TODO
    }

    /**
     *TODO
     * TODO
     *  TODO
     * change logger sms style!
     */


    public CreateAccount clickGetStartedButton() {
        driver.findElement(Locator.GET_STARTED_BUTTON).click();
        log.info("Click 'Get started - it's free' button from main page");
        return new CreateAccount(driver);
    }




    public GooglePlayPage clickPlayStoreBannerButton() {
        driver.findElement(Locator.PLAY_STORE_BUTTON_BANNER).click();
        log.info("Click 'Play Store' button.");
        return new GooglePlayPage(driver);
    }


    public GooglePlayPage clickPlayStoreButtonInDownloadSection() {
        driver.findElement(Locator.PLAY_STORE_BUTTON_DOWNLOAD).click();
        log.info("Click 'Play Store' button in download section.");
        return new GooglePlayPage(driver);
    }


    public AppStorePage clickAppStoreBannerButton() {
        driver.findElement(Locator.APPSTORE_BUTTON_BANNER).click();
        log.info("Click 'App Store' button.");
        return new AppStorePage(driver);
    }

    public AppStorePage clickAppStoreButtonInDownloadSection() {
        driver.findElement(Locator.APPSTORE_BUTTON_DOWNLOAD).click();
        log.info("Click 'App Store' button in download section.");
        return new AppStorePage(driver);
    }

    public InstagramPage clickMyInstagramBannerButton() {
        driver.findElement(Locator.INSTAGRAM_BUTTON_INTRODUCTION).click();
        driver.switchAnotherTab("jsa");
        log.debug("Click 'My Instagram' button.");
        return new InstagramPage(driver);
    }

    public FacebookPage clickMyFacebookBannerButton() {
        driver.findElement(Locator.FACEBOOK_BUTTON_INTRODUCTION).click();
        driver.switchAnotherTab("jsa");
        log.info("Click 'My Facebook' button.");
        return new FacebookPage(driver);
    }

    public Challenge clickAboutChallengesButton() {
        driver.findElement(Locator.ABOUT_CHALLENGES_MOTIVATION).click();
        log.info("Click 'About Challenges' button.");
        return new Challenge(driver);
    }

    public Transformations clickSeeMoreTransformationsButton() {
        driver.findElement(Locator.TRANSFORMATIONS_BUTTON_MEMBER_TRANSFORMATIONS).click();
        log.info("Click 'See More Transformations' button.");
        return new Transformations(driver);
    }


    public FamousDailyEmails cheaterClickFamousDailyEmail() {
        String fakeEmail = "fakeEmail@gmail.com";
        String script = "document.querySelector(\"button[type='submit']\").removeAttribute(\"disabled\")";
        driver.findElement(Locator.EMAIL_INPUT_DAILY_EMAILS).sendKeys(fakeEmail);
        driver.executeJsScript(script);
        driver.findElement(Locator.SIGN_UP_DAILY_EMAILS).click();
        log.info("Click 'Sign up' button in 'Famous Daily Emails' section.");
        log.warn("Use cheater way to click 'input' button under the 'daily famous emails' because of captcha.");
        return new FamousDailyEmails(driver);
    }


    @Override
    public Main make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public Main openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public Main openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public Main check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Main.Locator.values(),
                Footer.FooterLtr.values(),
                MainHeader.MainHeaderLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Main.Locators.values(),
                Footer.FooterLtrs.values(),
                MainHeader.MainHeaderLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    } 


    public enum Locator implements OnixLocator {
        GET_STARTED_BUTTON(By.cssSelector(".banner a[href='/users/register/']")),
        PLAY_STORE_BUTTON_BANNER(By.cssSelector(".banner img[alt='playstore']")),
        APPSTORE_BUTTON_BANNER(By.cssSelector(".banner img[alt='appstore']")),
        INSTAGRAM_BUTTON_INTRODUCTION(By.cssSelector(".introduction .insta")),
        PLAY_STORE_BUTTON_DOWNLOAD(By.cssSelector(".download img[alt='playstore']")),
        FACEBOOK_BUTTON_INTRODUCTION(By.cssSelector(".introduction .facebook")),
        APPSTORE_BUTTON_DOWNLOAD(By.cssSelector(".download img[alt='appstore']")),
        ABOUT_CHALLENGES_MOTIVATION(By.cssSelector(".motivation [href='/challenge/about/']")),
        TRANSFORMATIONS_BUTTON_MEMBER_TRANSFORMATIONS(By.cssSelector(".member_transformations [href='/transformations/']")),
        EMAIL_INPUT_DAILY_EMAILS(By.cssSelector("input[name='email']")),
        SIGN_UP_DAILY_EMAILS(By.cssSelector("#daily-button")),
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

