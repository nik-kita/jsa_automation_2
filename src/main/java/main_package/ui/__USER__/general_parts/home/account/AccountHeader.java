
package main_package.ui.__USER__.general_parts.home.account;

import main_package.data.S;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPart;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__GUEST__.page_objects.AfterLogout;
import main_package.ui.__USER__.page_objects.home_header.home.Home;
import main_package.ui.__USER__.page_objects.home_header.home.account.my_plan.MyPlan;
import main_package.ui.__USER__.page_objects.main.Main;
import main_package.ui.__USER__.page_objects.main.pricing.pricingplans.PricingPlans;
import org.openqa.selenium.By;

import static main_package.ui.__USER__.general_parts.home.account.AccountHeader.AccountHeaderLtr.*;

public interface AccountHeader extends OnixPart {

    default Home clickHomeHeaderButton() {
        OnixWebDriver onixWebDriver = getDriver();
        onixWebDriver.findElement(HOME_HEADER_BUTTON).click();
        getLog().info("click [{}] button in account-header", "Home");
        return new Home(onixWebDriver);
    }
    default Main clickJsaHeaderLogo() {
        OnixWebDriver driver = getDriver();
        driver.findElement(JSA_LOGO).click();
        getLog().info("click [{}] in account-header", "JSA logo");
        return new Main(driver);
    }
    default MyPlan clickAccountHeaderButton() {
        OnixWebDriver driver = getDriver();
        driver.findElement(ACCOUNT_HEADER_BUTTON).click();
        getLog().info("click [{}] button in account-header", "Account");
        return new MyPlan(driver);
    }
    default PricingPlans clickPricingPlansHeaderButton() {
        OnixWebDriver driver = getDriver();
        driver.findElement(PRICING_PLANS_HEADER_BUTTON).click();
        getLog().info("click [{}] button in account-header", "Pricing Plans");
        return new PricingPlans(driver);
    }
    default AfterLogout clickLogoutHeaderButton() {
        OnixWebDriver driver = getDriver();
        driver.findElement(LOGOUT_HEADER_BUTTON).click();
        getLog().info("click [{}] button in account-header", "Logout");
        return new AfterLogout(driver);
    }


    enum AccountHeaderLtr implements OnixLocator {
        JSA_LOGO(By.cssSelector(".main-header [href='/']")),
        HOME_HEADER_BUTTON(By.cssSelector(".nav [href='/users/']")),
        ACCOUNT_HEADER_BUTTON(By.cssSelector(".nav [href='/users/account/']")),
        PRICING_PLANS_HEADER_BUTTON(By.cssSelector(".nav [href='/users/pricing/']")),
        LOGOUT_HEADER_BUTTON(By.xpath("//div[@class='nav']//a[contains(text(), 'Logout')]"))
        ;
        private By path;
        private S[] actions;
        AccountHeaderLtr(By path) {
            this.path = path;
        }
        AccountHeaderLtr(By path, S... actions) {
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

    enum AccountHeaderLtrs implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        AccountHeaderLtrs(By path) {
            this.path = path;
        }
        AccountHeaderLtrs(By path, S... actions) {
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

    