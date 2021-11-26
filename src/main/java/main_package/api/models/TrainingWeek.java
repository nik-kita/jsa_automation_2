package main_package.api.models;

public class TrainingWeek {
    private int id;
    private int number;
    private boolean completed;
    private String date_started;
    private String date_completed;
    private int training;

    public int getId() {
        return id;
    }

    public TrainingWeek setId(int id) {
        this.id = id;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public TrainingWeek setNumber(int number) {
        this.number = number;
        return this;
    }

    public boolean isCompleted() {
        return completed;
    }

    public TrainingWeek setCompleted(boolean completed) {
        this.completed = completed;
        return this;
    }

    public String getDate_started() {
        return date_started;
    }

    public TrainingWeek setDate_started(String date_started) {
        this.date_started = date_started;
        return this;
    }

    public String getDate_completed() {
        return date_completed;
    }

    public TrainingWeek setDate_completed(String date_completed) {
        this.date_completed = date_completed;
        return this;
    }

    public int getTraining() {
        return training;
    }

    @Override
    public String toString() {
        return "TrainingWeek{" +
                "id=" + id +
                ", number=" + number +
                ", completed=" + completed +
                ", date_started='" + date_started + '\'' +
                ", date_completed='" + date_completed + '\'' +
                ", training=" + training +
                '}';
    }

    public TrainingWeek setTraining(int training) {
        this.training = training;
        return this;
    }
}
