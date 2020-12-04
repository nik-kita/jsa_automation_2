package main_package.engine.ui_engine;

import main_package.engine.BaseClass;
import main_package.engine.Fly;
import org.openqa.selenium.WebElement;

public class OnixWebElement extends BaseClass {
    WebElement seleniumWebElement;
    public OnixWebElement(WebElement seleniumWebElement) {
        this.seleniumWebElement = seleniumWebElement;
    }
    @Override
    public OnixWebElement make(Fly fly) {
        fly.make();
        return this;
    }
}
