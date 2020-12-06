package main_package.engine.test_engine;

import io.github.bonigarcia.wdm.WebDriverManager;
import main_package.engine.BaseClass;
import main_package.engine.Fly;
import main_package.engine.ui_engine.OnixWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class OnixUiTestRunner extends OnixTestRunner{
    public OnixUiAssert onixUiAssert;
    public OnixWebDriver driver;

    public OnixWebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void settingDriver() {
        String className = this.getClass().toString();
        MDC.put("class", className);
        log.debug("Class '{}' is started.", className);
        WebDriverManager.chromedriver().setup();
        Map<String, Object> prefs = new HashMap<>();
        // Set the notification setting it will override the default setting
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        //--------
        options.addArguments("--start-maximized");
        options.addArguments("--disable-web-security");
        options.addArguments("--no-proxy-server");
        options.setExperimentalOption("prefs", prefs);
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        //--------
        //chrome notification about automation will not displayed
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("prefs", prefs);
        // pass the options object in Chrome driver
        WebDriver chrome = new ChromeDriver(options);
//        chrome.manage().window().maximize();
        chrome.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver = new OnixWebDriver(chrome);
        onixUiAssert = new OnixUiAssert(driver);
    }

    @BeforeMethod
    public void BeforeMethod(Method method) {
        String name = method.getName();
        log.info("Test '{}' is started", name);
    }

    @AfterMethod
    public void cleanLoggerFromTestInfo(ITestResult result) {
        MDC.put("sms_role", "test");
        String name = result.getMethod().getMethodName();
        Long executionTime = result.getEndMillis() - result.getStartMillis();
        if(result.isSuccess()) {
            log.info("Test '{}' is successfully finished. Time: {} ms.", name, executionTime);
        } else {
            log.error("Test '{}' fails! ({} ms)", name, executionTime);
        }
    }

    @AfterClass
    public void driverOff(ITestContext context) {
        driver.quit();
        log.debug("Class '{}' is finished.", this.getClass().toString());
    }


    @Override
    public OnixUiTestRunner make(Fly fly) {
        fly.make();
        return this;
    }


}
