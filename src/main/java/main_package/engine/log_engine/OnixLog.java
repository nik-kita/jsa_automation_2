package main_package.engine.log_engine;

import org.slf4j.Logger;
import org.slf4j.Marker;

public class OnixLog implements Logger {
    String newStart = "";
    String newFinish = "";
    String before = "";
    String after = "";

    String startTraceDiv = "<h5 " + Tag.styleBuild(CssInTag.Display.INLINE_BLOCK, CssInTag.Color.GREY) + ">";
    String finishTraceDiv = "</h5>";
    String startDebugDiv = "<h4 " + Tag.styleBuild(CssInTag.Display.INLINE_BLOCK, CssInTag.Color.BLUE) + ">";
    String finishDebugDiv = "</h4>";
    String startInfoDiv = "<h4 " + Tag.styleBuild(CssInTag.Display.INLINE_BLOCK, CssInTag.Color.GREEN) + ">";
    String finishInfoDiv = "</h4>";
    String startWarnDiv = "<h4 " + Tag.styleBuild(CssInTag.Display.INLINE_BLOCK, CssInTag.Color.ORANGE) + ">";
    String finishWarnDiv = "</h4>";
    String startErrorDiv = "<h4 " + Tag.styleBuild(CssInTag.Display.INLINE_BLOCK, CssInTag.Color.RED) + ">";
    String finishErrorDiv = "</h4>";


    private final Logger logger;


    public OnixLog(Logger logger) {
        this.logger = logger;
    }

    public String getName() {
        return logger.getName();
    }


    public boolean isTraceEnabled() {
        return logger.isTraceEnabled();
    }

    public void trace(String s) {
        String start = startTraceDiv;
        String finish = finishTraceDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.trace(start + s + finish);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void trace(String s, Object o) {
        String start = startTraceDiv;
        String finish = finishTraceDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.trace(start + s + finish, o);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void trace(String s, Object o, Object o1) {
        String start = startTraceDiv;
        String finish = finishTraceDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.trace(start + s + finish, o, o1);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void trace(String s, Object... objects) {
        String start = startTraceDiv;
        String finish = finishTraceDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.trace(start + s + finish, objects);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void trace(String s, Throwable throwable) {
        String start = startTraceDiv;
        String finish = finishTraceDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.trace(start + s + finish, throwable);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public boolean isTraceEnabled(Marker marker) {
        return logger.isTraceEnabled(marker);
    }

    public void trace(Marker marker, String s) {
        String start = startTraceDiv;
        String finish = finishTraceDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.trace(marker, start + s + finish);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void trace(Marker marker, String s, Object o) {
        String start = startTraceDiv;
        String finish = finishTraceDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.trace(marker, start + s + finish, o);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void trace(Marker marker, String s, Object o, Object o1) {
        String start = startTraceDiv;
        String finish = finishTraceDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.trace(marker, start + s + finish, o, o1);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void trace(Marker marker, String s, Object... objects) {
        String start = startTraceDiv;
        String finish = finishTraceDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.trace(marker, start + s + finish, objects);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void trace(Marker marker, String s, Throwable throwable) {
        String start = startTraceDiv;
        String finish = finishTraceDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.trace(marker, start + s + finish, throwable);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void debug(String s) {
        String start = startDebugDiv;
        String finish = finishDebugDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.debug(start + s + finish);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void debug(String s, Object o) {
        String start = startDebugDiv;
        String finish = finishDebugDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.debug(start + s + finish, o);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void debug(String s, Object o, Object o1) {
        String start = startDebugDiv;
        String finish = finishDebugDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.debug(start + s + finish, o, o1);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void debug(String s, Object... objects) {
        String start = startDebugDiv;
        String finish = finishDebugDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.debug(start + s + finish, objects);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void debug(String s, Throwable throwable) {
        String start = startDebugDiv;
        String finish = finishDebugDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.debug(start + s + finish, throwable);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public boolean isDebugEnabled(Marker marker) {
        return logger.isDebugEnabled(marker);
    }

    public void debug(Marker marker, String s) {
        String start = startDebugDiv;
        String finish = finishDebugDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.debug(marker, start + s + finish);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void debug(Marker marker, String s, Object o) {
        String start = startDebugDiv;
        String finish = finishDebugDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.debug(marker, start + s + finish, o);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void debug(Marker marker, String s, Object o, Object o1) {
        String start = startDebugDiv;
        String finish = finishDebugDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.debug(marker, start + s + finish, o, o1);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void debug(Marker marker, String s, Object... objects) {
        String start = startDebugDiv;
        String finish = finishDebugDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.debug(marker, start + s + finish, objects);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void debug(Marker marker, String s, Throwable throwable) {
        String start = startDebugDiv;
        String finish = finishDebugDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.debug(marker, start + s + finish, throwable);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }

    public boolean isInfoEnabled() {
        return logger.isInfoEnabled();
    }

    public void info(String s) {
        String start = startInfoDiv;
        String finish = finishInfoDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.info(start + s + finish);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void info(String s, Object o) {
        String start = startInfoDiv;
        String finish = finishInfoDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.info(start + s + finish, o);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void info(String s, Object o, Object o1) {
        String start = startInfoDiv;
        String finish = finishInfoDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.info(start + s + finish, o, o1);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void info(String s, Object... objects) {
        String start = startInfoDiv;
        String finish = finishInfoDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.info(start + s + finish, objects);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void info(String s, Throwable throwable) {
        String start = startInfoDiv;
        String finish = finishInfoDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.info(start + s + finish, throwable);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public boolean isInfoEnabled(Marker marker) {
        return logger.isInfoEnabled(marker);
    }

    public void info(Marker marker, String s) {
        String start = startInfoDiv;
        String finish = finishInfoDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.info(marker, start + s + finish);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void info(Marker marker, String s, Object o) {
        String start = startInfoDiv;
        String finish = finishInfoDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.info(marker, start + s + finish, o);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void info(Marker marker, String s, Object o, Object o1) {
        String start = startInfoDiv;
        String finish = finishInfoDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.info(marker, start + s + finish, o, o1);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void info(Marker marker, String s, Object... objects) {
        String start = startInfoDiv;
        String finish = finishInfoDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.info(marker, start + s + finish, objects);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void info(Marker marker, String s, Throwable throwable) {
        String start = startInfoDiv;
        String finish = finishInfoDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.info(marker, start + s + finish, throwable);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public boolean isWarnEnabled() {
        return logger.isWarnEnabled();
    }

    public void warn(String s) {
        String start = startWarnDiv;
        String finish = finishWarnDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.warn(start + s + finish);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void warn(String s, Object o) {
        String start = startWarnDiv;
        String finish = finishWarnDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.warn(start + s + finish, o);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void warn(String s, Object o, Object o1) {
        String start = startWarnDiv;
        String finish = finishWarnDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.warn(start + s + finish, o, o1);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void warn(String s, Object... objects) {
        String start = startWarnDiv;
        String finish = finishWarnDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.warn(start + s + finish, objects);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void warn(String s, Throwable throwable) {
        String start = startWarnDiv;
        String finish = finishWarnDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.warn(start + s + finish, throwable);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public boolean isWarnEnabled(Marker marker) {
        return logger.isWarnEnabled(marker);
    }

    public void warn(Marker marker, String s) {
        String start = startWarnDiv;
        String finish = finishWarnDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.warn(marker, start + s + finish);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void warn(Marker marker, String s, Object o) {
        String start = startWarnDiv;
        String finish = finishWarnDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.warn(marker, start + s + finish, o);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void warn(Marker marker, String s, Object o, Object o1) {
        String start = startWarnDiv;
        String finish = finishWarnDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.warn(marker, start + s + finish, o, o1);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void warn(Marker marker, String s, Object... objects) {
        String start = startWarnDiv;
        String finish = finishWarnDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.warn(marker, start + s + finish, objects);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void warn(Marker marker, String s, Throwable throwable) {
        String start = startWarnDiv;
        String finish = finishWarnDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.warn(marker, start + s + finish, throwable);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }


    public boolean isErrorEnabled() {
        return logger.isErrorEnabled();
    }

    public void error(String s) {
        String start = startErrorDiv;
        String finish = finishErrorDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.error(start + s + finish);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void error(String s, Object o) {
        String start = startErrorDiv;
        String finish = finishErrorDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.error(start + s + finish, o);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void error(String s, Object o, Object o1) {
        String start = startErrorDiv;
        String finish = finishErrorDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.error(start + s + finish, o, o1);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void error(String s, Object... objects) {
        String start = startErrorDiv;
        String finish = finishErrorDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.error(start + s + finish, objects);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void error(String s, Throwable throwable) {
        String start = startErrorDiv;
        String finish = finishErrorDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.error(start + s + finish, throwable);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public boolean isErrorEnabled(Marker marker) {
        return logger.isErrorEnabled(marker);
    }

    public void error(Marker marker, String s) {
        String start = startErrorDiv;
        String finish = finishErrorDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.error(marker, start + s + finish);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void error(Marker marker, String s, Object o) {
        String start = startErrorDiv;
        String finish = finishErrorDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.error(marker, start + s + finish, o);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void error(Marker marker, String s, Object o, Object o1) {
        String start = startErrorDiv;
        String finish = finishErrorDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.error(marker, start + s + finish, o, o1);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void error(Marker marker, String s, Object... objects) {
        String start = startErrorDiv;
        String finish = finishErrorDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.error(marker, start + s + finish, objects);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public void error(Marker marker, String s, Throwable throwable) {
        String start = startErrorDiv;
        String finish = finishErrorDiv;
        if (!newStart.equals("")) {
            start = newStart;
            finish = newFinish;
        }
        if (!before.equals("")) {
            start = before + start;
        }
        if (!after.equals("")) {
            finish = finish + after;
        }
        logger.error(marker, start + s + finish, throwable);
        newStart = "";
        newFinish = "";
        before = "";
        after = "";
    }

    public OnixLog setOnceStartFinish(String start, String finish) {
        newStart = start;
        newFinish = finish;
        return this;
    }


    public OnixLog setOnceBefore(String before) {
        this.before = before;
        return this;
    }

    public OnixLog setOnceAfter(String after) {
        this.after = after;
        return this;
    }


}
