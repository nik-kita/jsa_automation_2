package main_package.engine.ui_engine;

import main_package.engine.BaseInterface;
import main_package.engine.Fly;
import main_package.engine.log_engine.OnixLog;

public interface BasePart extends BaseInterface, Fly, Check {
    OnixWebDriver getDriver();
    OnixLog getLog();
}
