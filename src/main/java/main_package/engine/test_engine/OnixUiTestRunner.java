package main_package.engine.test_engine;

import io.github.bonigarcia.wdm.WebDriverManager;
import main_package.data.Settings;
import main_package.data.User;
import main_package.engine.Fly;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__GUEST__.page_objects.main.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.MDC;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


@Listeners(OnixScreenFailListener.class)
public class OnixUiTestRunner extends OnixTestRunner {
    protected OnixUiAssert onixUiAssert;
    protected OnixWebDriver driver;
    private Main mainGuest;
    private main_package.ui.__USER__.page_objects.main.Main mainUser;
    protected User user = User.getValidUser();

    @BeforeClass
    public void settingDriver() {
        log.debug("Class '{}' is started.", this.getClass().toString());
        ChromeOptions options = new ChromeOptions();
        /**
         * ===================================== HEROKU =============================
         */
//        String GOOGLE_CHROME_PATH = "/app/.apt/usr/bin/google_chrome";
//        String CHROMEDRIVER_PATH = "/app/.chromedriver/bin/chromedriver";
//        options.addArguments("--headless");
//        options.addArguments("--disable-gpu");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--window-size=1280,800");
//        options.setBinary(GOOGLE_CHROME_PATH);
//        System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH);
//        WebDriver chrome = new ChromeDriver(options);
        /**
         *===========================================================================
         */
        WebDriverManager.chromedriver().setup();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        options.addArguments("--start-maximized");
        options.addArguments("--disable-web-security");
        options.addArguments("--no-proxy-server");
        options.setExperimentalOption("prefs", prefs);
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("prefs", prefs);
        WebDriver chrome = new ChromeDriver(options);
        chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
        if (result.isSuccess()) {
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

    public OnixWebDriver getDriver() {
        return driver;
    }

    protected Main openSite() {
        driver.get(Settings.BASE_URL);
        mainGuest = new Main(driver);
        log.info("Open https://www.jamessmithacademy.com/");
        return mainGuest;
    }
    protected main_package.ui.__USER__.page_objects.main.Main openSite(User user) {
        driver.get(Settings.BASE_URL);
        mainGuest = new Main(driver);
        log.info("Open https://www.jamessmithacademy.com/");
        mainUser = mainGuest.clickHeaderLogin().login(user).goMainPage();
        return mainUser;
    }

    @Override
    public OnixUiTestRunner make(Fly fly) {
        fly.make();
        return this;
    }

}
