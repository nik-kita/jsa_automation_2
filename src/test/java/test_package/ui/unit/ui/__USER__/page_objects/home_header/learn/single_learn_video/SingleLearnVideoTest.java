
package test_package.ui.unit.ui.__USER__.page_objects.home_header.learn.single_learn_video;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__USER__.page_objects.home_header.learn.single_learn_video.SingleLearnVideo;


public class SingleLearnVideoTest extends OnixUiTestRunner {
    SingleLearnVideo singleLearnVideo;
    @BeforeClass
    public void openSingleLearnVideo() {
        //TODO
        //singleLearnVideo = openSite();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                SingleLearnVideo.Locator.values()
                //TODO
        );
    }

    @Test(dataProvider = "getRepeated")
    public void repeated(OnixLocator locator) {
        onixUiAssert.
                checkMinimumOfElementsByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getRepeated() {
        return mergeArrays(
                SingleLearnVideo.Locators.values()
                //TODO
        );
    }
}

