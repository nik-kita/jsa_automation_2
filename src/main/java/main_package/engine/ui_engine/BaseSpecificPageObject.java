package main_package.engine.ui_engine;

import main_package.engine.BaseClass;
import main_package.engine.Fly;

public abstract class BaseSpecificPageObject extends BaseClass implements BasePart {
    protected OnixWebDriver driver;
    public BaseSpecificPageObject(OnixWebDriver driver) {
        this.driver = driver;
    }

    @Override
    public BaseClass make(Fly fly) {
        return null;
    }

    @Override
    public OnixWebDriver getDriver() {
        return driver;
    }

}
