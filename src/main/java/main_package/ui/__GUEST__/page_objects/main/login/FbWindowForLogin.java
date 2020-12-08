
package main_package.ui.__GUEST__.page_objects.main.login;

import main_package.data.Settings;
import main_package.engine.Fly;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPageObject;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.page_objects.home_header.home.Home;
import org.openqa.selenium.By;
import main_package.data.S;

public class FbWindowForLogin extends OnixPageObject {
    private String ENDPOINT_URL = ""; //TODO
    private By confirm_button = By.xpath("//button[@name='__CONFIRM__']");
    private By first_check_name_input = By.xpath("//input[contains(@value, ' ')]");
    private By first_check_terms_checkbox = By.cssSelector(".checkbox #terms-styler");
    private By first_check_create_account_button = By.cssSelector("input[type='submit']");


    public FbWindowForLogin(OnixWebDriver driver) {
        super(driver);
        log.debug("[{}] page is open", "FbWindowForLogin"); //TODO
    }

    public Home login(String name, String password) {
        driver.findElement(Locator.EMAIL_OR_NUMBER_INPUT).sendKeys(name);
        driver.findElement(Locator.PASSWORD_INPUT).sendKeys(password);
        driver.findElement(Locator.LOG_IN_BUTTON).click();
        if (driver.isElementPresent(confirm_button)) {
            log.warn("additional facebook page for confirmation is present");
            driver.waitToClick(confirm_button).click();
            log.info("click [{}] button", "Confirm");
        }
        if (driver.isElementPresent(first_check_name_input)) {
            driver.waitToClick(first_check_terms_checkbox).click();
            log.info("click [{}] checkbox", "Terms");
            driver.waitToClick(first_check_create_account_button).click();
            log.info("click [{}] button", "Create Account");
            log.warn("additional first name checking page is present");
        }
        return new Home(driver);
    }


    @Override
    public FbWindowForLogin make(Fly fly) {
        fly.make();
        return this;
    }

    @Override
    public FbWindowForLogin openFromScratch() {
        driver.get(Settings.BASE_URL);
        //TODO
        return this;
    }

    @Override
    public FbWindowForLogin openFromUrl() {
        driver.get(Settings.BASE_URL + ENDPOINT_URL);
        return this;
    }

    @Override
    public FbWindowForLogin check(OnixUiAssert onixUiAssert) {
        for (OnixLocator l : OnixUiAssert.mergeArrays(
                FbWindowForLogin.Locator.values()
                //TODO
        )) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        for (OnixLocator l : OnixUiAssert.mergeArrays(
                FbWindowForLogin.Locators.values()
                //TODO
        )) {
            onixUiAssert.softCheckMinimumOfElementsByLocator(l, 1);
        }
        return this;
    }


public enum Locator implements OnixLocator {
    EMAIL_OR_NUMBER_INPUT(By.xpath("//input[@id='email']")),
    PASSWORD_INPUT(By.xpath("//input[@type='password']")),
    LOG_IN_BUTTON(By.cssSelector("#loginbutton"));
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

