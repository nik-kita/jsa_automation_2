package main_package.api.models;

public class TrainingDayHistory {
    private int id;
    private TrainingDay training_day;
    private String date;
    private int user;

    public int getId() {
        return id;
    }

    public TrainingDayHistory setId(int id) {
        this.id = id;
        return this;
    }

    public TrainingDay getTraining_day() {
        return training_day;
    }

    public TrainingDayHistory setTraining_day(TrainingDay training_day) {
        this.training_day = training_day;
        return this;
    }

    public String getDate() {
        return date;
    }

    public TrainingDayHistory setDate(String date) {
        this.date = date;
        return this;
    }

    public int getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "TrainingDayHistory{" +
                "id=" + id +
                ", training_day=" + training_day +
                ", date='" + date + '\'' +
                ", user=" + user +
                '}';
    }

    public TrainingDayHistory setUser(int user) {
        this.user = user;
        return this;
    }
}
