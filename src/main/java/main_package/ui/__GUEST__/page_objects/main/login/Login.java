
package main_package.ui.__GUEST__.page_objects.main.login;

import main_package.data.Settings;
import main_package.data.User;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.engine.ui_engine.OnixWebElement;
import main_package.ui.__GUEST__.page_objects.main.Main;
import main_package.ui.__USER__.page_objects.home_header.home.Home;
import org.openqa.selenium.By;
import main_package.data.S;

public class Login extends OnixPageObject {
    private String ENDPOINT_URL = ""; //TODO
    public Login(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "Login"); //TODO
    }

    public Main goHomePage() {
        driver.findElement(Locator.JSA_LOGO).click();
        log.info("click [{}]", "JSA logo");
        return new Main(driver);
    }

    private OnixWebElement getUserInput() {
        return driver.findElement(Locator.USERNAME_INPUT);
    }

    private OnixWebElement getPasswordInput() {
        return driver.findElement(Locator.PASSWORD_INPUT);
    }

    private OnixWebElement getSubmitButton() {
        return driver.findElement(Locator.GET_STARTED_BUTTON);
    }

    private void fillUserInput(String userNameOrEmail) {
        getUserInput().sendKeys(userNameOrEmail);
    }

    private void fillPasswordInput(String password) {
        getPasswordInput().sendKeys(password);
    }

    public Home login(User validUser) {
        fillUserInput(validUser.getName());
        log.info("fill [{}] input", "User Name");
        fillPasswordInput(validUser.getPassword());
        log.info("fill [{}] input", "Password");
        getSubmitButton().click();
        log.info("click [{}] button", "Submit");
        log.debug("login to the site");
        return new Home(driver);
    }

    public Home loginByFB(User user) {
        driver.findElement(Locator.FACEBOOK_BUTTON).click();
        return new FbWindowForLogin(driver)
                .login(user.getFacebookEmail(), user.getFacebookPassword());
    }

    public CreateAccount clickCreateAccountButton() {
        driver.findElement(Locator.CREATE_ACCOUNT_LINK).click();
        log.info("click [{}] button", "Create Account");
        return new CreateAccount(driver);
    }



    public ResetPassword clickForgotPassword() {
        driver.findElement(Locator.FORGOT_PASSWORD_LINK).click();
        log.info("click [{}] button", "Reset Password");
        return new ResetPassword(driver);
    }

    @Override
    public Login make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public Login openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }
    @Override
    public Login openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }
    @Override
    public Login check(OnixUiAssert onixUiAssert) {
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Login.Locator.values()
                //TODO
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for(OnixLocator l : OnixUiAssert.mergeArrays(
                Login.Locators.values()
                //TODO
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


    public enum Locator implements OnixLocator {
        JSA_LOGO(By.xpath("//a[@href='/']")),
        USERNAME_INPUT(By.xpath("//input[@name='username']")),
        PASSWORD_INPUT(By.id("password")),
        FORGOT_PASSWORD_LINK(By.xpath("//a[contains(text(), 'Forgot')]")),
        GET_STARTED_BUTTON(By.xpath("//button[contains(text(), 'Started')]")),
        FACEBOOK_BUTTON(By.cssSelector(".fb-button")),
        APPLE_BUTTON(By.cssSelector(".apple-button")),
        CREATE_ACCOUNT_LINK(By.xpath("//*[@href='/users/register/']"))
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

