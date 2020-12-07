
package main_package.ui.__USER__.general_parts.home;

import main_package.data.S;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.page_objects.home_header.home.PersonalTrainer;
import org.openqa.selenium.By;

import static main_package.ui.__USER__.general_parts.home.HomePart.HomePartLtr.SUPPORT_BUTTON;

public interface HomePart extends HomeHeader {

    default PersonalTrainer clickSupportButton() {
        OnixWebDriver driver = getDriver();
        driver.findElement(SUPPORT_BUTTON).click();
        getLog().info("click [{}] fly icon button", "Support");
        return new PersonalTrainer(driver);
    }

    enum HomePartLtr implements OnixLocator {
        SUPPORT_BUTTON(By.xpath("//button[contains(text(), 'Support')]")),
        ;
        private By path;
        private S[] actions;
        HomePartLtr(By path) {
            this.path = path;
        }
        HomePartLtr(By path, S... actions) {
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

    enum HomePartLtrs implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        HomePartLtrs(By path) {
            this.path = path;
        }
        HomePartLtrs(By path, S... actions) {
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

    