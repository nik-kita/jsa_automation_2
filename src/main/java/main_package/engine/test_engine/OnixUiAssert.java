package main_package.engine.test_engine;

import main_package.engine.Fly;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixWebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
//TODO clean messages
public class OnixUiAssert extends BaseAssert {
    OnixWebDriver driver;

    public static OnixLocator[] mergeArrays(OnixLocator[]... arrays) {
        int length = 0;
        for (OnixLocator[] array : arrays) {
            length += array.length;
        }
        OnixLocator[] result = new OnixLocator[length];
        int pos = 0;
        for (OnixLocator[] array : arrays) {
            for (OnixLocator l : array) {
                result[pos] = l;
                pos++;
            }
        }
        return result;
    }

    public OnixUiAssert(OnixWebDriver driver) {
        this.driver = driver;
    }

    public void checkFirstGreaterSecond(int first, int second) {
        String errorMessage = "";
        if(first < second) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
            String classLoaderName = stackTraceElement.getClassName();
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            errorMessage = "\n\n" +
                    "\n----------------------------" +
                    "\nIn [" + classLoaderName + " | " + className + " | " + methodName +
                    "]\n----------------------------" +
                    "\n=== FIRST IS NOT GREATER THAN SECOND ===\n" +
                    "\nFirst is:  " + first +
                    "\nSecond is: " + second;
        }
        boolean result = first > second;
        message(result,
                "Success assertion: \n" + first + " > " + second,
                errorMessage);
        Assert.assertTrue(first > second, errorMessage);
    }

    public SoftAssert softCheckFirstGreaterSecond(int first, int second) {
        SoftAssert softAssert = getSoftAssert();
        String errorMessage = "\n\n" +
                "\n----------------------------" +
                "\nIn " + getClass().toString() +
                "\n----------------------------" +
                "\n=== FIRST IS NOT GREATER THAN SECOND ===\n" +
                "\nFirst is:  " + first +
                "\nSecond is: " + second + "\n\n";
        softAssert.assertTrue(first > second, errorMessage);
        boolean result = (first > second);
        softMessage(result,
                first + " > " + second,
                "(" + first + " > " + second + ") != true");
        return softAssert;
    }

    public void checkCount(int actual, int expected) {
        String errorMessage = "\n\n" +
                "\n----------------------------" +
                "\nIn " + getClass().toString() +
                "\n----------------------------" +
                "\n=== AMOUNT ===\n" +
                "\nActual:   " + actual +
                "\nExpected: " + expected;
        boolean result = actual == expected;
        message(result,
                "Counting result is " + actual,
                errorMessage);
        Assert.assertEquals(actual, expected, errorMessage);
    }

    public SoftAssert softCheckCount(int actual, int expected) {
        SoftAssert softAssert = getSoftAssert();
        String errorMessage = "\n\n" +
                "\n----------------------------" +
                "\nIn " + getClass().toString() +
                "\n----------------------------" +
                "\n=== AMOUNT ===\n" +
                "\nActual:   " + actual +
                "\nExpected: " + expected;
        boolean result = actual == expected;
        softMessage(result,
                "Counting result is " + actual,
                "Counting result is " + actual + ". However expected " + expected);
        softAssert.assertEquals(actual, expected, errorMessage);
        return softAssert;
    }

    public void checkMinimumOfElementsByLocator(OnixLocator locator, int min) {
        int actualElCount = driver
                .findElements(locator)
                .size();
        String locatorName = locator.name();
        String locatorPath = locator.getPath().toString();
        String locatorClass = locator.getClass().toString();
        String errorMessage = "\n" +
                "\n----------------------------" +
                "\nIn " + locatorClass +
                "\n\n" + locatorName +
                "\n" + locatorPath +
                "\n----------------------------find " + actualElCount + " elements" +
                "\n=== EXPECTED THAT THEIR COUNT WILL BE MORE THAN "+ min + " ===\n";
        boolean result = actualElCount >= min;
        message(result, locatorClass + "." + locatorName + " with " + locatorPath + " + has more than " + min + " elements (" + actualElCount + ")",
                locatorClass + "." + locatorName + " with " + locatorPath + " + hasn't more than " + min + " elements (only " + actualElCount + ")");
        Assert.assertTrue(result, errorMessage);
    }

    public SoftAssert softCheckMinimumOfElementsByLocator(OnixLocator locator, int min) {
        SoftAssert softAssert = getSoftAssert();
        int actualElCount = driver
                .findElements(locator)
                .size();
        String locatorName = locator.name();
        String locatorPath = locator.getPath().toString();
        String locatorClass = locator.getClass().toString();
        String errorMessage = "\n" +
                "\n----------------------------" +
                "\nIn " + locatorClass +
                "\n\n" + locatorName +
                "\n" + locatorPath +
                "\n----------------------------find " + actualElCount + " elements" +
                "\n=== EXPECTED THAT THEIR COUNT WILL BE MORE THAN "+ min + " ===\n";
        boolean result = actualElCount >= min;
        softMessage(result, locatorClass + "." + locatorName + " with " + locatorPath + " + has more than " + min + " elements (" + actualElCount + ")",
                errorMessage);
        softAssert.assertTrue(result, errorMessage);
        return softAssert;
    }

    public void checkCountOfElementByLocator(OnixLocator locator, int expectedElCount) {
        int actualElCount = driver
                .findElements(locator)
                .size();
        String locatorName = locator.name();
        String locatorPath = locator.getPath().toString();
        String locatorClass = locator.getClass().toString();

        String errorMessage = "\n" +
                "\n----------------------------" +
                "\nIn " + locatorClass +
                "\n\n" + locatorName +
                "\n" + locatorPath +
                "\n----------------------------" +
                "\n=== NUMBER OF ELEMENTS ===\n";
        boolean result = actualElCount == expectedElCount;
        message(result,
                locatorClass + "." + locatorName + "(" + locatorPath + ") find " + actualElCount + " elements.",
                locatorClass + "." + locatorName + "(" + locatorPath + ") find " + actualElCount + " elements instead of " + expectedElCount);
        Assert.assertEquals(actualElCount, expectedElCount, errorMessage);
    }

    public SoftAssert softCheckCountOfElementByLocator(OnixLocator locator, int expectedElCount) {
        SoftAssert softAssert = getSoftAssert();
        int actualElCount = driver
                .findElements(locator)
                .size();
        String locatorName = locator.name();
        String locatorPath = locator.getPath().toString();
        String locatorClass = locator.getClass().toString();

        String errorMessage = "\n" +
                "\n----------------------------" +
                "\nIn " + locatorClass +
                "\n\n" + locatorName +
                "\n" + locatorPath +
                "\n----------------------------" +
                "\n=== NUMBER OF ELEMENTS ===\n";
        boolean result = (actualElCount == expectedElCount);
        softMessage(
                result,
                locatorClass + "." + locatorName + "(" + locatorPath + ") find " + actualElCount + " elements.",
                errorMessage
        );
        softAssert.assertEquals(actualElCount, expectedElCount, errorMessage);
        return softAssert;
    }
    public void checkUrlContains(String wordInUrl) {
        String url = driver.getUrl();
        boolean result = url.toLowerCase().contains(wordInUrl.toLowerCase());
        message(result, "Current url '" + url + "' contains '" + wordInUrl + "'", "Current url is '" + url + "' however you try to find '" + wordInUrl + "' in it.");
        Assert.assertTrue(url.toLowerCase().contains(wordInUrl.toLowerCase()));
    }
    public SoftAssert softCheckUrlContains(String wordInUrl) {
        SoftAssert softAssert = getSoftAssert();
        String url = driver.getUrl();
        boolean result = url.toLowerCase().contains(wordInUrl.toLowerCase());
        softMessage(result, "Current url '" + url + "' contains '" + wordInUrl + "'", "Current url is '" + url + "' however you try to find '" + wordInUrl + "' in it.");
        softAssert.assertTrue(result);
        return softAssert;
    }

    @Override
    public OnixUiAssert make(Fly fly) {
        fly.make();
        return this;
    }
}
