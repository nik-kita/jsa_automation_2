
package main_package.ui.__GUEST__.general_parts;

import main_package.data.S;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPart;
import org.openqa.selenium.By;

public interface Footer extends OnixPart {

    //TODO

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

    