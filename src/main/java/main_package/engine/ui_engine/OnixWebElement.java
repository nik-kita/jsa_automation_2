package main_package.engine.ui_engine;

import main_package.engine.BaseClass;
import main_package.engine.Fly;
import org.openqa.selenium.By;
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
    public WebElement getSeleniumWebElement() {
        log.trace("get WebElement " + this + " from OnixWebElement");
        return seleniumWebElement;
    }

    public void click() {
        seleniumWebElement.click();
        log.debug("click " + this);
    }

    public void sendKeys(CharSequence keysToSend) {
        seleniumWebElement.sendKeys(keysToSend);
        log.trace("send keys '{}' to {}", keysToSend, this);
    }

    public String text() {
        log.trace("read text from {}", this);
        return seleniumWebElement.getText();
    }

    public OnixWebElement findElementInsideThis(OnixLocator locator) {
        log.trace("find in {} new seleniumWebElement by {}", this, locator);
        return new OnixWebElement(seleniumWebElement.findElement(locator.getPath()));
    }
    public OnixWebElement findElementInsideThis(By path) {
        log.trace("find in {} new seleniumWebElement by {}", this, path);
        return new OnixWebElement(seleniumWebElement.findElement(path));
    }

    @Override
    public String toString() {
        return seleniumWebElement.toString().substring(seleniumWebElement.toString().indexOf(")] -> ") + 6);
    }
}
