package main_package.api.models;

public class TrainingLogDayWeeksCopy {
    private int training_log_day_weeks_id;
    private boolean use_previous_set;

    public int getTraining_log_day_weeks_id() {
        return training_log_day_weeks_id;
    }

    public TrainingLogDayWeeksCopy setTraining_log_day_weeks_id(int training_log_day_weeks_id) {
        this.training_log_day_weeks_id = training_log_day_weeks_id;
        return this;
    }

    public boolean isUse_previous_set() {
        return use_previous_set;
    }

    @Override
    public String toString() {
        return "TrainingLogDayWeeksCopy{" +
                "training_log_day_weeks_id=" + training_log_day_weeks_id +
                ", use_previous_set=" + use_previous_set +
                '}';
    }

    public TrainingLogDayWeeksCopy setUse_previous_set(boolean use_previous_set) {
        this.use_previous_set = use_previous_set;
        return this;
    }
}
