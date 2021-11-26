package main_package.api.models;

public class Arm {
    private int id;
    private float measurement;
    private String date;
    private int user;

    @Override
    public String toString() {
        return "Arm{" +
                "id=" + id +
                ", measurement=" + measurement +
                ", date='" + date + '\'' +
                ", user=" + user +
                '}';
    }

    public int getId() {
        return id;
    }

    public Arm setId(int id) {
        this.id = id;
        return this;
    }

    public float getMeasurement() {
        return measurement;
    }

    public Arm setMeasurement(float measurement) {
        this.measurement = measurement;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Arm setDate(String date) {
        this.date = date;
        return this;
    }

    public int getUser() {
        return user;
    }

    public Arm setUser(int user) {
        this.user = user;
        return this;
    }
}
