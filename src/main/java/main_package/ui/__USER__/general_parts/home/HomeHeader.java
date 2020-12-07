
package main_package.ui.__USER__.general_parts.home;

import main_package.data.S;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPart;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.page_objects.home_header.UserCabinetDropdown;
import main_package.ui.__USER__.page_objects.home_header.home.Home;
import main_package.ui.__USER__.page_objects.home_header.learn.Learn;
import main_package.ui.__USER__.page_objects.home_header.nutrition.Meals;
import main_package.ui.__USER__.page_objects.home_header.workouts.Personalised;
import main_package.ui.__USER__.page_objects.main.Main;
import org.openqa.selenium.By;

import static main_package.ui.__USER__.general_parts.home.HomeHeader.HomeHeaderLtr.*;

public interface HomeHeader extends OnixPart {

    default UserCabinetDropdown openUserDropDown() {
        OnixWebDriver driver = getDriver();
        driver.findElement(MY_CABINET_DROPDOWN).click();
        getLog().info("click [{}] from home-header", "'My Cabinet' dropdown");
        return new UserCabinetDropdown(driver);
    }
    default Main goMainPage() {
        OnixWebDriver driver = getDriver();
        driver.findElement(JSA_LOGO).click();
        getLog().info("click [{}] from home-header", "JSA logo");
        return new Main(driver);
    }
    default Home clickHomeTab() {
        OnixWebDriver driver = getDriver();
        driver.findElement(HOME).click();
        getLog().info("click [{}] from home-header", "Home");
        return new Home(driver);
    }

    default Personalised clickWorkoutsTab() {
        OnixWebDriver driver = getDriver();
        driver.findElement(WORKOUTS).click();
        getLog().info("click [{}] from home-header", "Workouts");
        return new Personalised(driver);
    }
    default Meals clickNutritionTab() {
        OnixWebDriver driver = getDriver();
        driver.findElement(NUTRITION).click();
        getLog().info("click [{}] from home-header", "Nutrition");
        return new Meals(driver);
    }
    default Learn clickLearnTab() {
        OnixWebDriver driver = getDriver();
        driver.findElement(LEARN).click();
        getLog().info("click [{}] from home-header", "Learn");
        return new Learn(driver);
    }


    enum HomeHeaderLtr implements OnixLocator {
        JSA_LOGO(By.xpath("//a[@href='/']")),
        HOME(By.cssSelector("#navbar [href='#/home']")),
        WORKOUTS(By.cssSelector("#navbar [href='#/workouts']")),
        LEARN(By.cssSelector("#navbar #coaching")),
        NUTRITION(By.cssSelector("#navbar #nutrition")),
        MY_CABINET_DROPDOWN(By.id("navbarDropdownMenuLink")),
        ;
        private By path;
        private S[] actions;
        HomeHeaderLtr(By path) {
            this.path = path;
        }
        HomeHeaderLtr(By path, S... actions) {
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

    enum HomeHeaderLtrs implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        HomeHeaderLtrs(By path) {
            this.path = path;
        }
        HomeHeaderLtrs(By path, S... actions) {
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

    