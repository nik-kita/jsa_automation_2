
package main_package.ui.__USER__.general_parts.home.account;

import main_package.data.S;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPart;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.page_objects.home_header.home.account.PairedDevices;
import main_package.ui.__USER__.page_objects.home_header.home.account.Units;
import main_package.ui.__USER__.page_objects.home_header.home.account.my_plan.MyPlan;
import main_package.ui.__USER__.page_objects.home_header.home.account.my_profile.MyProfile;
import org.openqa.selenium.By;

import static main_package.ui.__USER__.general_parts.home.account.AccountSidebar.AccountSidebarLtr.*;

public interface AccountSidebar extends OnixPart {

    default MyProfile clickMyProfile() {
        OnixWebDriver driver = getDriver();
        driver.findElement(MY_PROFILE).click();
        getLog().info("click [{}] button in account sidebar", "My Profile");
        return new MyProfile(driver);
    }
    default MyPlan clickMyPlan() {
        OnixWebDriver driver = getDriver();
        driver.findElement(MY_PLAN_BUTTON).click();
        getLog().info("click [{}] button in account sidebar", "My Plan");
        return new MyPlan(driver);
    }
    default Units clickUnits() {
        OnixWebDriver driver = getDriver();
        driver.findElement(UNITS).click();
        getLog().info("click [{}] button in account sidebar", "Units");
        return new Units(driver);
    }
    default PairedDevices clickPairedDevices() {
        OnixWebDriver driver = getDriver();
        driver.findElement(PAIRED_DEVICES).click();
        getLog().info("click [{}] button in account sidebar", "Paired Devices");
        return new PairedDevices(driver);
    }


    enum AccountSidebarLtr implements OnixLocator {
        MY_PLAN_BUTTON(By.cssSelector(".account-tab-container-desktop [href=\"/users/account/my-plan\"]")),
        MY_PROFILE(By.cssSelector(".account-tab-container-desktop [href=\"/users/account/profile\"]")),
        UNITS(By.cssSelector(".account-tab-container-desktop [href=\"/users/account/units-settings\"]")),
        PAIRED_DEVICES(By.cssSelector(".account-tab-container-desktop [href=\"/users/account/fitness-tracker\"]"))
        ;
        private By path;
        private S[] actions;
        AccountSidebarLtr(By path) {
            this.path = path;
        }
        AccountSidebarLtr(By path, S... actions) {
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

    enum AccountSidebarLtrs implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        AccountSidebarLtrs(By path) {
            this.path = path;
        }
        AccountSidebarLtrs(By path, S... actions) {
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

    