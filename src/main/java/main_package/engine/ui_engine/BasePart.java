package main_package.engine.ui_engine;

import main_package.engine.BaseClass;
import main_package.engine.BaseInterface;
import main_package.engine.log_engine.OnixLog;

public interface BasePart extends BaseInterface {
    OnixWebDriver getDriver();
    OnixLog getLog();
    BaseClass make();
    BaseClass check();

}
