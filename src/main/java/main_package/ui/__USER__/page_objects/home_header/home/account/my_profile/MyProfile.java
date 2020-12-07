
package main_package.ui.__USER__.page_objects.home_header.home.account.my_profile;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.general_parts.Footer;
import main_package.ui.__USER__.general_parts.home.account.AccountHeader;
import main_package.ui.__USER__.general_parts.home.account.AccountSidebar;
import main_package.ui.__USER__.page_objects.home_header.home.account.my_profile.upload_image.LocalFiles;
import org.openqa.selenium.By;
import main_package.data.S;

public class MyProfile extends OnixPageObject implements AccountHeader, AccountSidebar, Footer {
    private String ENDPOINT_URL = ""; //TODO
    public MyProfile(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "MyProfile"); //TODO
    }

    public ResetPasswordFromMyProfile clickResetPassword() {
        driver.findElement(Locator.RESET_YOUR_PASSWORD_HERE_LINK).click();
        log.info("click [{}] link", "Reset Your Password Here");
        return new ResetPasswordFromMyProfile(driver);
    }
    public EmailPreferences clickUpdateEmailPreferences() {
        driver.findElement(Locator.UPDATE_YOUR_EMAIL_PREFERENCES).click();
        log.info("click [{}] link", "Update Your Email Preferences");
        return new EmailPreferences(driver);
    }

    public LocalFiles clickUploadImageIconButton() {
        driver.findElement(Locator.UPLOAD_IMAGE_LITTLE_ICON_BUTTON).click();
        log.info("click [{}] little icon button", "Upload Image");
        return new LocalFiles(driver);
    }

    @Override
    public MyProfile make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public MyProfile openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public MyProfile openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public MyProfile check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                MyProfile.Locator.values(),
                AccountHeader.AccountHeaderLtr.values(),
                AccountSidebar.AccountSidebarLtr.values(),
                Footer.FooterLtr.values()
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                MyProfile.Locators.values(),
                AccountHeader.AccountHeaderLtrs.values(),
                AccountSidebar.AccountSidebarLtrs.values(),
                Footer.FooterLtrs.values()
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        RESET_YOUR_PASSWORD_HERE_LINK(By.cssSelector("[href=\"/users/account/reset-password\"]")),
        UPDATE_YOUR_EMAIL_PREFERENCES(By.cssSelector("[href=\"/emails/preferences/\"]")),
        UPLOAD_IMAGE_LITTLE_ICON_BUTTON(By.cssSelector(".uploadcare--widget__button_type_open")),
        USERNAME_INPUT(By.cssSelector("[name='username']")),
        FIRSTNAME_INPUT(By.cssSelector("[name='first_name']")),
        EMAIL_INPUT(By.cssSelector("[name='email']")),
        LASTNAME_INPUT(By.cssSelector("[name='last_name']")),
        UPDATE_DETAILS_BUTTON(By.xpath("//button[@type = 'submit'][contains(text(), 'Update Details')]")),
        FACEBOOK_CONNECT_OR_DISCONNECT(By.xpath("//div[@class = 'profile-socials__action']//form[contains(@action, 'facebook')]//button")),
        APPLE_CONNECT_OR_DISCONNECT(By.xpath("//div[@class = 'profile-socials__action']//form[contains(@action, 'apple')]//button")),
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

