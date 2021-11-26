package main_package.api.models;

public class TrainingStepsSyncItem {
    private int steps;
    private int manual_steps;
    private String proveder;
    private int id;
    private String date;

    public int getSteps() {
        return steps;
    }

    public TrainingStepsSyncItem setSteps(int steps) {
        this.steps = steps;
        return this;
    }

    public int getManual_steps() {
        return manual_steps;
    }

    public TrainingStepsSyncItem setManual_steps(int manual_steps) {
        this.manual_steps = manual_steps;
        return this;
    }

    public String getProveder() {
        return proveder;
    }

    public TrainingStepsSyncItem setProveder(String proveder) {
        this.proveder = proveder;
        return this;
    }

    public int getId() {
        return id;
    }

    public TrainingStepsSyncItem setId(int id) {
        this.id = id;
        return this;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "TrainingStepsSyncItem{" +
                "steps=" + steps +
                ", manual_steps=" + manual_steps +
                ", proveder='" + proveder + '\'' +
                ", id=" + id +
                ", date='" + date + '\'' +
                '}';
    }

    public TrainingStepsSyncItem setDate(String date) {
        this.date = date;
        return this;
    }
}
