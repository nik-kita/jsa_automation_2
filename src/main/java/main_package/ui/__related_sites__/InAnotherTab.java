
package main_package.ui.__related_sites__;

import main_package.data.S;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPart;
import main_package.engine.ui_engine.OnixWebDriver;
import org.openqa.selenium.By;

public interface InAnotherTab extends OnixPart {

    default OnixWebDriver closeAndBackToJsaTab() {
        OnixWebDriver driver = getDriver();
        driver.switchToRegisterTab("jsa");
        driver.closeTabsExceptCurrent();
        getLog().info("close [{}] and back to tab with 'jsa' content", this.getClass());//TODO check correct name of 'this.getClass()'
        return driver;
    }

}

    