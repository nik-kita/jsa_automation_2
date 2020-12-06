package main_package.ui.specific;

import main_package.data.S;
import main_package.engine.BaseClass;
import main_package.engine.Fly;
import main_package.engine.ui_engine.BaseSpecificPageObject;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixWebDriver;
import org.openqa.selenium.By;

public class JsaCookies extends BaseSpecificPageObject {
    public JsaCookies(OnixWebDriver onixWebDriver) {
        super(onixWebDriver);
    }

    public OnixWebDriver acceptIfCookiesPresent() {
        if(!driver.checkSetting("jsacookies")) {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (driver.findElements(Locator.OK_BUTTON).size() > 0) {
                driver.findElement(Locator.OK_BUTTON).click();
                driver.setSetting("jsacookies", true);
                log.debug("close 'JsaCookies' popup");
            } else {
                log.warn("try to close 'JsaCookies' popup but no such elements was found");
            }
        }
        return driver;
    }

    @Override
    public JsaCookies make(Fly fly) {
        fly.make();
        return this;
    }

    public enum Locator implements OnixLocator {
        DIALOG_BODY(By.cssSelector("#CybotCookiebotDialog")),
        OK_BUTTON(By.cssSelector("#CybotCookiebotDialogBodyLevelButtonAccept")),

        ;
        private By path;
        private S[] actions;

        Locator(By path) {
            this.path = path;
        }
        Locator(By path, S...actions) {
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
