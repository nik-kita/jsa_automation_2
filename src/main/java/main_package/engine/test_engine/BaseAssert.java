package main_package.engine.test_engine;

import main_package.engine.BaseClass;
import org.testng.asserts.SoftAssert;

public abstract class BaseAssert extends BaseClass {
    private SoftAssert softAssert;
    protected int totalSoftCounter;
    protected int successSoftCounter;
    public SoftAssert getSoftAssert() {
        if(softAssert == null) {
            softAssert = new SoftAssert();
            successSoftCounter = totalSoftCounter = 0;
        }
        return softAssert;
    }
    public BaseAssert assertAll() {
        if(totalSoftCounter == successSoftCounter) {
            message(true, "All softAssertions passed!" , "this message will never displayed");
        } else {
            message(false, "", "Not all tests passed!!!");
        }
        try {
            softAssert.assertAll();
        } finally {
            softAssert = null;
        }
        return this;
    }
    public BaseAssert assertAll(String good, String bad) {
        if(totalSoftCounter == successSoftCounter) {
            message(true, good, "this message will never displayed");
        } else {
            message(false, "", bad);
        }
        try {
            softAssert.assertAll();
        } finally {
            softAssert = null;
        }
        return this;
    }
    public void message(boolean success, String good, String bad) {
        if(success) {
            log.info("Success! {}", good);
        } else {
            log.error("Fail!!! {}", bad);
        }
    }
    public void softMessage(boolean success, String good, String bad) {
        if(success) {
            log.trace("Pass in softAssert: {}", good);
            successSoftCounter++;
        } else {
            log.error("Fail in softAssert: {}", bad);
        }
        totalSoftCounter++;
    }
}
