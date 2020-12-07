
package test_package.ui.unit.ui.__GUEST__.page_objects.main.my_podcast;


import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import main_package.ui.__GUEST__.page_objects.main.my_podcast.PodcastEpisode;


public class PodcastEpisodeTest extends OnixUiTestRunner {
    PodcastEpisode podcastEpisode;
    @BeforeClass
    public void openPodcastEpisode() {
        //TODO
        //podcastEpisode = openSite();
    }

    @Test(dataProvider = "getUnique")
    public void unique(OnixLocator locator) {
        onixUiAssert.
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUnique() {
        return mergeArrays(
                PodcastEpisode.Locator.values()
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
                PodcastEpisode.Locators.values()
                //TODO
        );
    }
}
