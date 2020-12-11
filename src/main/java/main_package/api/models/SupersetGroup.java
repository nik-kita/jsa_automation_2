package main_package.api.models;

public class SupersetGroup {
    private int id;
    private String color;
    private int training_dat;
    private int training_log_day;

    public int getId() {
        return id;
    }

    public SupersetGroup setId(int id) {
        this.id = id;
        return this;
    }

    public String getColor() {
        return color;
    }

    public SupersetGroup setColor(String color) {
        this.color = color;
        return this;
    }

    public int getTraining_dat() {
        return training_dat;
    }

    public SupersetGroup setTraining_dat(int training_dat) {
        this.training_dat = training_dat;
        return this;
    }

    public int getTraining_log_day() {
        return training_log_day;
    }

    @Override
    public String toString() {
        return "SupersetGroup{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", training_dat=" + training_dat +
                ", training_log_day=" + training_log_day +
                '}';
    }

    public SupersetGroup setTraining_log_day(int training_log_day) {
        this.training_log_day = training_log_day;
        return this;
    }
}
