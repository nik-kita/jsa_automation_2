package main_package.engine;

import main_package.data.LogLevel;
import main_package.engine.log_engine.OnixLog;
import org.slf4j.LoggerFactory;

public abstract class BaseClass {
    public OnixLog log;
    public BaseClass() {
        log = new OnixLog(LoggerFactory.getLogger(this.getClass()));
    }
    public abstract BaseClass make(Fly fly);
    public OnixLog getLog() {
        return log;
    }
}
