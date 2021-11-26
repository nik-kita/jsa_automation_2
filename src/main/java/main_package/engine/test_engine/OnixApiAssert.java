package main_package.engine.test_engine;

import io.restassured.response.Response;
import main_package.engine.BaseClass;
import main_package.engine.Fly;
import main_package.engine.log_engine.CssInTag;
import main_package.engine.log_engine.Tag;
import org.testng.Assert;

public class OnixApiAssert extends BaseAssert {
    public OnixApiAssert softCheckStatusCode(int actual, int expected) {
        getSoftAssert().assertEquals(actual, expected);
        softMessage(
                actual == expected,
                "Correct Status Code (" + actual + ")",
                "Status code is " + actual + " but expected " + expected
        );
        return this;
    }
    public void checkStatusCode(int actual, int expected) {
        message(
                actual == expected,
                "Correct Status Code (" + actual + ")",
                "Status code is " + actual + " but expected " + expected
        );
        Assert.assertEquals(actual, expected);
    }

    public void assertAll(Response response) {
        assertAll(
                "This is good response!\n" + Tag.inPre(response.asPrettyString(), CssInTag.Color.GREEN),
                "This response has problems!\n" + Tag.inPre(response.asPrettyString(), CssInTag.Color.RED)
        );
    }

    @Override
    public void message(boolean success, String good, String bad) {
        if(success) {
            log.info("Success! <pre>{}</pre>", good);
        } else {
            log.error("Fail!!! <pre>{}</pre>", bad);
        }
    }

//    @Override
//    public void softMessage(boolean success, String good, String bad) {
//        if(success) {
//            log.trace("Pass in softAssert: <pre>{}</pre>", good);
//            successSoftCounter++;
//        } else {
//            log.error("Fail in softAssert: <pre>{}</pre>", bad);
//        }
//        totalSoftCounter++;
//    }
    @Override
    public BaseClass make(Fly fly) {
        return null;
    }
}
