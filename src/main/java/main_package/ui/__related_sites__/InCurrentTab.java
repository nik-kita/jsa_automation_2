
package main_package.ui.__related_sites__;

import main_package.engine.ui_engine.OnixPart;
import main_package.engine.ui_engine.OnixWebDriver;

public interface InCurrentTab extends OnixPart {

    default OnixWebDriver backToJsa() {
        OnixWebDriver driver = getDriver();
        driver.back();
        getLog().debug("click [Browser Back Arrow] to return to page with 'jsa' content");
        return driver;
    }

}

    