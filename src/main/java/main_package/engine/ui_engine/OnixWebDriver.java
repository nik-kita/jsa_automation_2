package main_package.engine.ui_engine;

import main_package.engine.BaseClass;
import main_package.engine.Fly;
import main_package.engine.log_engine.OnixLog;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnixWebDriver extends BaseClass {
    WebDriver seleniumWebDriver;
    private Map<String, Boolean> onixSettings;
    public OnixWebDriver(WebDriver seleniumWebDriver) {
        this.seleniumWebDriver = seleniumWebDriver;
        onixSettings = new HashMap<>();
    }
    @Override
    public OnixWebDriver make(Fly fly) {
        fly.make();
        return this;
    }
    public void setSetting(String setting, Boolean status) {
        onixSettings.put(setting, status);
        log.debug("put [{}] setting to OnixWebDriver", setting);
    }

    public boolean checkSetting(String setting) {
        if (onixSettings.containsKey(setting)) {
            log.trace("OnixWebDriver contains [{}] setting", setting);
            return onixSettings.get(setting);
        }
        log.trace("OnixWebDriver haven't [{}] setting", setting);
        return false;
    }

    public OnixWebElement findElement(OnixLocator locator) {
        By path = locator.getPath();
        OnixWebElement result = new OnixWebElement((seleniumWebDriver.findElement(path)));
        log.trace("find webElement by [{}]", path);
        return result;
    }

    public OnixWebElement findElement(By seleniumPath) {
        OnixWebElement result = new OnixWebElement(seleniumWebDriver.findElement(seleniumPath));
        log.trace("find webElement [{}]", seleniumPath);
        return result;
    }

    public WebDriver getSeleniumDriver() {
        log.trace("return original seleniumDriver");
        return seleniumWebDriver;
    }

    public List<OnixWebElement> findElements(OnixLocator locator) {
        List<OnixWebElement> result = new ArrayList<>();
        for (WebElement e : seleniumWebDriver.findElements(locator.getPath())) {
            result.add(new OnixWebElement(e));
        }
        int count = result.size();
        if(count == 0) {
            log.warn("find 0 elements of [{}]", locator);
        } else {
            log.trace("find {} elements [{}]", count, locator);
        }
        return result;
    }

    public List<OnixWebElement> findElements(By seleniumPath) {
        List<OnixWebElement> result = new ArrayList<>();
        for (WebElement e : seleniumWebDriver.findElements(seleniumPath)) {
            result.add(new OnixWebElement(e));
        }
        int count = result.size();
        if(count == 0) {
            log.warn("find 0 elements located by [{}]", seleniumPath);
        } else {
            log.trace("find {} elements located by [{}]", count, seleniumPath);
        }
        return result;
    }

    public OnixWebElement waitVisibility(OnixLocator locator, int seconds) {
        log.trace("wait {} seconds for visibility of element [{}]", seconds, locator.getPath());
        return new OnixWebElement(new WebDriverWait(seleniumWebDriver, seconds)
                .until(ExpectedConditions.visibilityOfElementLocated(locator.getPath())));
    }

    public OnixWebElement waitVisibility(OnixLocator locator) {
        return waitVisibility(locator, 5);
    }

    public OnixWebElement waitVisibility(By seleniumPath, int seconds) {
        log.trace("wait {} seconds for visibility of element located by [{}]", seconds, seleniumPath);
        return new OnixWebElement(new WebDriverWait(seleniumWebDriver, seconds)
                .until(ExpectedConditions.visibilityOfElementLocated(seleniumPath)));
    }

    public OnixWebElement waitVisibility(By seleniumPath) {
        return waitVisibility(seleniumPath, 5);
    }

    public OnixWebDriver toIframe(int index) {
        log.debug("switch to iframe number {}", index);
        return new OnixWebDriver(seleniumWebDriver.switchTo().frame(index));
    }

    public OnixWebDriver toIframe(String nameOrId) {
        log.debug("switch to iframe with name or id [{}]", nameOrId);
        return new OnixWebDriver(seleniumWebDriver.switchTo().frame(nameOrId));
    }


    public OnixWebDriver toParentFrame() {
        log.trace("switch to parent frame");
        return new OnixWebDriver(seleniumWebDriver.switchTo().parentFrame());
    }

    public void scrollPageDown() {
        waitVisibility(By.cssSelector("body"));
        ((JavascriptExecutor) seleniumWebDriver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        log.trace("scroll page down");
    }

    public void scrollPageUp() {
        waitVisibility(By.cssSelector("body"));
        ((JavascriptExecutor) seleniumWebDriver)
                .executeScript("window.scrollTo(0, 0)");
        log.trace("scroll page up");
    }

    public void scrollTo(OnixLocator locator) {
        ((JavascriptExecutor) seleniumWebDriver)
                .executeScript("arguments[0].scrollIntoView(true);", findElement(locator).getSeleniumWebElement());
        log.trace("scroll page to element [{}]", locator);
    }

    public void scrollTo(By seleniumPath) {
        ((JavascriptExecutor) seleniumWebDriver)
                .executeScript("arguments[0].scrollIntoView(true);", findElement(seleniumPath).getSeleniumWebElement());
        log.trace("scroll page to element located by [{}]", seleniumPath);
    }

    public void scrollTo(OnixWebElement element) {
        ((JavascriptExecutor) seleniumWebDriver)
                .executeScript("arguments[0].scrollIntoView(true);", element.getSeleniumWebElement());
        log.trace("scroll page to element [{}]", element);
    }

    public void scrollTo(WebElement element) {
        ((JavascriptExecutor) seleniumWebDriver)
                .executeScript("arguments[0].scrollIntoView(true);", element);
        log.trace("scroll page to element to [{}]", element.getTagName());
    }

    public void protectedScrollTo(OnixLocator locator, int wait) {
        scrollTo(waitVisibility(locator, wait));
    }

    public void protectedScrollTo(By seleniumPath, int wait) {
        scrollTo(waitVisibility(seleniumPath, wait));
    }

    public void protectedScrollTo(OnixLocator locator) {
        scrollTo(waitVisibility(locator));
    }

    public void protectedScrollTo(By seleniumPath) {
        scrollTo(waitVisibility(seleniumPath));
    }

    public void get(String url) {
        seleniumWebDriver.get(url);
        log.debug("navigate seleniumWebDriver to [{}]", url);
    }

    public void quit() {
        seleniumWebDriver.quit();
        log.debug("driver quit");
    }

    public boolean isElementPresent(OnixLocator locator) {
        log.trace("check is element [{}] present", locator);
        return findElements(locator).size() > 0;
    }

    public boolean isElementPresent(By path) {
        log.trace("check is element located by [{}] present", path);
        return findElements(path).size() > 0;
    }

    public boolean waitInvisibilityOf(OnixLocator locator) {
        log.trace("wait for invisibility of [{}]", locator);
        return new WebDriverWait(seleniumWebDriver, 5)
                .until(ExpectedConditions.invisibilityOfElementLocated(locator.getPath()));
    }

    public boolean waitInvisibilityOf(OnixWebElement element) {
        log.trace("wait for invisibility of [{}]", element);
        return new WebDriverWait(seleniumWebDriver, 5)
                .until(ExpectedConditions.invisibilityOf(element.getSeleniumWebElement()));
    }

    public OnixWebElement waitToClick(OnixLocator locator) {
        log.trace("wait to click the element located by [{}]", locator.getPath());
        WebElement e = new WebDriverWait(seleniumWebDriver, 5)
                .until(ExpectedConditions.elementToBeClickable(locator.getPath()));
        return new OnixWebElement(e);
    }

    HashMap<String, String> tabs;

    public OnixWebDriver registerCurrentTab(String name) {
        if (tabs == null) {
            tabs = new HashMap<>();
        }
        tabs.put(name, seleniumWebDriver.getWindowHandle());
        log.debug("register current tab with [{}] name", name);
        return this;
    }
    public OnixWebDriver switchToRegisterTab(String name) {
        seleniumWebDriver.switchTo().window(tabs.get(name));
        log.debug("switch to tab with [{}] name", name);
        return this;
    }
    public OnixWebDriver closeTabsExceptCurrent() {
        String current = seleniumWebDriver.getWindowHandle();
        for(String s : seleniumWebDriver.getWindowHandles()) {
            seleniumWebDriver.switchTo().window(s);
            if(!s.equals(current)) {
                seleniumWebDriver.close();
            }
        }
        seleniumWebDriver.switchTo().window(current);
        tabs = null;
        log.debug("close all tabs except current");
        return this;
    }
    public OnixWebDriver registerTabWithUrlLike(String urlsPart, String nameForTabs) {
        String current = seleniumWebDriver.getWindowHandle();
        for(String s : seleniumWebDriver.getWindowHandles()) {
            if(seleniumWebDriver.switchTo().window(s).getCurrentUrl().contains(urlsPart)) {
                if(tabs == null) {
                    tabs = new HashMap<>();
                }
                tabs.put(nameForTabs, s);
                break;
            }
        }
        seleniumWebDriver.switchTo().window(current);
        log.debug("register tab that contains [{}] in url by name [{}]", urlsPart, nameForTabs);
        return this;
    }

    public String getUrl() {
        log.trace("current url is [{}]", seleniumWebDriver.getCurrentUrl());
        return seleniumWebDriver.getCurrentUrl();
    }

    public OnixWebDriver hoverToElementLocated(By path) {
        Actions actions = new Actions(seleniumWebDriver);
        actions.moveToElement(this.waitVisibility(path).getSeleniumWebElement());
        log.trace("hover to element located by [{}]", path);
        return this;
    }
    public OnixWebDriver hoverToElementLocated(OnixLocator locator) {
        Actions actions = new Actions(seleniumWebDriver);
        actions.moveToElement(this.waitVisibility(locator.getPath()).getSeleniumWebElement());
        log.trace("hover to [{}]", locator);
        return this;
    }

    public OnixWebDriver switchAnotherTab(String nameForOldTab) {
        this.registerCurrentTab(nameForOldTab);
        for(String s : seleniumWebDriver.getWindowHandles()) {
            if(!s.equals(tabs.get(nameForOldTab))) {
                seleniumWebDriver.switchTo().window(s);
            }
        }
        log.debug("switch to another tab");
        return this;
    }

    public OnixWebDriver back() {
        seleniumWebDriver.navigate().back();
        log.debug("navigate back");
        return this;
    }

    public OnixWebDriver executeJsScript(String script) {
        ((JavascriptExecutor) seleniumWebDriver).executeScript(script);
        log.debug("execute JS script: \n{}", script);
        return this;
    }

    public void alertAccept() {
        Alert alert = new WebDriverWait(seleniumWebDriver, 5)
                .until(ExpectedConditions.alertIsPresent());
        alert.accept();
        log.debug("accept alert");
    }

}
