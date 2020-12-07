
package main_package.ui.__USER__.general_parts;

import main_package.data.S;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPart;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.page_objects.from_footer.*;
import org.openqa.selenium.By;

import static main_package.ui.__USER__.general_parts.Footer.FooterLtr.*;

public interface Footer extends OnixPart {

    default Blog goBlogPageFromFooter() {
        OnixWebDriver driver = getDriver();
        driver.findElement(BLOG_SUPPORT_LINK).click();
        getLog().debug("'Blog' from footer");
        return new Blog(driver);
    }

    default CookiesPolicy goCookiesPolicyFromFooter() {
        OnixWebDriver driver = getDriver();
        driver.findElement(COOKIES_POLICY_LINK).click();
        getLog().debug("'CookiesPolicy' from footer");
        return new CookiesPolicy(driver);
    }

    default PrivacyPolicy goPrivacyPolicyFromFooter() {
        OnixWebDriver driver = getDriver();
        driver.findElement(PRIVACY_POLICY_LINK).click();
        getLog().debug("'PrivacyPolicy' from footer");
        return new PrivacyPolicy(driver);
    }

    default TermsOfService goTermsOfServiceFromFooter() {
        OnixWebDriver driver = getDriver();
        driver.findElement(TERMS_OF_SERVICE_LINK).click();
        getLog().debug("'TermsOfService' from footer");
        return new TermsOfService(driver);
    }

    default ReportBugs goReportBugsFromFooter() {
        OnixWebDriver driver = getDriver();
        driver.findElement(BUG_SUPPORT_LINK).click();
        getLog().debug("'ReportBugs' from footer");
        return new ReportBugs(driver);
    }

    default ContactUs goContactUsFromFooter() {
        OnixWebDriver driver = getDriver();
        driver.findElement(CONTACT_US_LINK).click();
        getLog().debug("'ContactUs' from footer");
        return new ContactUs(driver);
    }

    default AccessAndDownload goAccessAndDownloadFromFooter() {
        OnixWebDriver driver = getDriver();
        driver.findElement(ACCESS_LINK).click();
        getLog().debug("'AccessAndDownload' from footer");
        return new AccessAndDownload(driver);
    }

    default Faqs goFaqsFromFooter() {
        OnixWebDriver driver = getDriver();
        driver.findElement(FAQS_LINK).click();
        getLog().debug("'Faqs' from footer");
        return new Faqs(driver);
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

    