package main_package.engine.test_engine;

import main_package.engine.BaseClass;
import main_package.engine.log_engine.AfterAllReportRewriter;
import org.testng.annotations.Listeners;

@Listeners(org.uncommons.reportng.HTMLReporter.class)
public abstract class OnixTestRunner extends BaseClass {
    {
        Runtime.getRuntime().addShutdownHook(new AfterAllReportRewriter());
    }
    public Object[] mergeArrays(Object[]... arrays) {
        int length = 0;
        for (Object[] array : arrays) {
            length += array.length;
        }
        Object[] result = new Object[length];
        int pos = 0;
        for (Object[] array : arrays) {
            for (Object e : array) {
                result[pos] = e;
                pos++;
            }
        }
        return result;
    }
}
