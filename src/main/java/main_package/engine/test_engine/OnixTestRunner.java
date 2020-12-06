package main_package.engine.test_engine;

import main_package.engine.BaseClass;

public abstract class OnixTestRunner extends BaseClass {
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
