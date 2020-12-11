package main_package.api.models;

public class DailyMacroSync {
    private String time_zone_offset;
    private DailyMacroSyncItem macros;

    @Override
    public String toString() {
        return "DailyMacroSync{" +
                "time_zone_offset='" + time_zone_offset + '\'' +
                ", macros=" + macros +
                '}';
    }

    public String getTime_zone_offset() {
        return time_zone_offset;
    }

    public DailyMacroSync setTime_zone_offset(String time_zone_offset) {
        this.time_zone_offset = time_zone_offset;
        return this;
    }

    public DailyMacroSyncItem getMacros() {
        return macros;
    }

    public DailyMacroSync setMacros(DailyMacroSyncItem macros) {
        this.macros = macros;
        return this;
    }
}
