package main_package.engine;

import main_package.engine.log_engine.OnixLog;
import org.slf4j.LoggerFactory;

public abstract class BaseClass implements Fly {
    OnixLog log;
    public BaseClass() {
        log = new OnixLog(LoggerFactory.getLogger(this.getClass()));
    }
}
