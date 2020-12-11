package main_package.api.models;

public class TrainingStepsSync {
    private TrainingStepsSyncItem steps;
    private String time_zone_offset;

    public TrainingStepsSyncItem getSteps() {
        return steps;
    }

    public TrainingStepsSync setSteps(TrainingStepsSyncItem steps) {
        this.steps = steps;
        return this;
    }

    public String getTime_zone_offset() {
        return time_zone_offset;
    }

    @Override
    public String toString() {
        return "TrainingStepsSync{" +
                "steps=" + steps +
                ", time_zone_offset='" + time_zone_offset + '\'' +
                '}';
    }

    public TrainingStepsSync setTime_zone_offset(String time_zone_offset) {
        this.time_zone_offset = time_zone_offset;
        return this;
    }
}
