
package main_package.ui.__GUEST__.general_parts;

import main_package.data.S;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPart;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__GUEST__.page_objects.from_footer.*;
import main_package.ui.__related_sites__.*;
import org.openqa.selenium.By;

import static main_package.ui.__GUEST__.general_parts.Footer.FooterLtr.*;

public interface Footer extends OnixPart {

    default Blog clickFooterBlog() {
        OnixWebDriver driver = getDriver();
        driver.findElement(BLOG_SUPPORT_LINK).click();
        getLog().info("click [Blog] button in footer [Support] section.");
        return new Blog(driver);
    }

    default CookiesPolicy clickFooterCookiesPolicy() {
        OnixWebDriver driver = getDriver();
        driver.findElement(COOKIES_POLICY_LINK).click();
        getLog().info("click [Cookies Policy] button in footer [Company] section.");
        return new CookiesPolicy(driver);
    }

    default PrivacyPolicy clickFooterPrivatePolicy() {
        OnixWebDriver driver = getDriver();
        driver.findElement(PRIVACY_POLICY_LINK).click();
        getLog().info("click [Privacy Policy] button in footer [Company] section.");
        return new PrivacyPolicy(driver);
    }

    default TermsOfService clickFooterTermsOfService() {
        OnixWebDriver driver = getDriver();
        driver.findElement(TERMS_OF_SERVICE_LINK).click();
        getLog().info("click [Terms Of Service] button in footer [Company] section.");
        return new TermsOfService(driver);
    }

    default ReportBugs clickFooterBugReports() {
        OnixWebDriver driver = getDriver();
        driver.findElement(BUG_SUPPORT_LINK).click();
        getLog().info("click [Bug Reports] button in footer [Support] section.");
        return new ReportBugs(driver);
    }

    default ContactUs clickFooterContactUs() {
        OnixWebDriver driver = getDriver();
        driver.findElement(CONTACT_US_LINK).click();
        getLog().info("click [Contact Us] button in footer [Support] section.");
        return new ContactUs(driver);
    }

    default AccessAndDownload clickFooterAccess() {
        OnixWebDriver driver = getDriver();
        driver.findElement(ACCESS_LINK).click();
        getLog().info("click [Access] button in footer [Support] section.");
        return new AccessAndDownload(driver);
    }

    default Faqs clickFooterFAQs() {
        OnixWebDriver driver = getDriver();
        driver.findElement(FAQS_LINK).click();
        getLog().info("click [FAQS] button in footer [Support] section.");
        return new Faqs(driver);
    }


    default GooglePlayPage clickFooterPlayStore() {
        OnixWebDriver driver = getDriver();
        driver.findElement(PLAY_STORE_BUTTON).click();
        getLog().info("click [Play Store] button in footer [Download our app] section.");
        return new GooglePlayPage(driver);
    }

    default AppStorePage clickFooterAppStore() {
        OnixWebDriver driver = getDriver();
        driver.findElement(APPSTORE_BUTTON).click();
        getLog().info("click [App Store] button in footer [Download our app] section.");
        return new AppStorePage(driver);
    }

    default FacebookPage clickFooterFacebook() {
        OnixWebDriver driver = getDriver();
        driver.findElement(FACEBOOK_LINK).click();
        driver.switchAnotherTab("jsa");
        getLog().info("click [Facebook] button in footer [Social media] section.");
        return new FacebookPage(driver);
    }

    default InstagramPage clickFooterInstagram() {
        OnixWebDriver driver = getDriver();
        driver.findElement(INSTAGRAM_LINK).click();
        driver.switchAnotherTab("jsa");
        getLog().info("click [Instagram] button in footer [Social media] section.");
        return new InstagramPage(driver);
    }

    default SpotifyPage clickFooterSpotify() {
        OnixWebDriver driver = getDriver();
        driver.findElement(SPOTIFY_PLAYLIST_LINK).click();
        driver.switchAnotherTab("jsa");
        getLog().info("click [Spotify] button in footer [Social media] section.");
        return new SpotifyPage(driver);
    }

    enum FooterLtr implements OnixLocator {
        JSA_LOGO(By.cssSelector("footer .logo")),
        TERMS_OF_SERVICE_LINK(By.cssSelector(".company [href='/terms/']")),
        COOKIES_POLICY_LINK(By.cssSelector(".company [href='/cookies-policy/']")),
        PRIVACY_POLICY_LINK(By.cssSelector(".company [href='/privacy/']")),
        BLOG_SUPPORT_LINK(By.xpath("//footer//div[@class='support']//a[contains(text(), 'Blog')]")),
        BUG_SUPPORT_LINK(By.cssSelector(".support [href='/emails/bug-report/']")),
        CONTACT_US_LINK(By.cssSelector(".support [href='/emails/contact-us/']")),
        ACCESS_LINK(By.cssSelector(".support [href='/access/']")),
        FAQS_LINK(By.cssSelector(".support [href='/faqs/']")),
        PLAY_STORE_BUTTON(By.cssSelector("#website-footer img[alt='playstore']")),
        APPSTORE_BUTTON(By.cssSelector("#website-footer img[alt='appstore']")),
        FACEBOOK_LINK(By.cssSelector("#website-footer [alt='ic_facebook']")),
        INSTAGRAM_LINK(By.cssSelector("[alt='ic_instagram']")),
        SPOTIFY_PLAYLIST_LINK(By.cssSelector("#website-footer [alt='ic_spotify']")),
        ;
        private By path;
        private S[] actions;
        FooterLtr(By path) {
            this.path = path;
        }
        FooterLtr(By path, S... actions) {
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

    enum FooterLtrs implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        FooterLtrs(By path) {
            this.path = path;
        }
        FooterLtrs(By path, S... actions) {
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

    