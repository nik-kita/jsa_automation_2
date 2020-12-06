package main_package.engine.ui_engine;

import main_package.data.S;
import org.openqa.selenium.By;

public interface OnixLocator {
    By getPath();
    String name();
    S[] specialActions();
}
