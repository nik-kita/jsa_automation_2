package main_package.api.models;

public class TrainingLogDayCopy {
    private int training_log_day_id;
    private boolean use_previous_set;

    public int getTraining_log_day_id() {
        return training_log_day_id;
    }

    public TrainingLogDayCopy setTraining_log_day_id(int training_log_day_id) {
        this.training_log_day_id = training_log_day_id;
        return this;
    }

    public boolean isUse_previous_set() {
        return use_previous_set;
    }

    @Override
    public String toString() {
        return "TrainingLogDayCopy{" +
                "training_log_day_id=" + training_log_day_id +
                ", use_previous_set=" + use_previous_set +
                '}';
    }

    public TrainingLogDayCopy setUse_previous_set(boolean use_previous_set) {
        this.use_previous_set = use_previous_set;
        return this;
    }
}
