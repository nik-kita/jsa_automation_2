package main_package.api.models;

public class Weight {
    private int id;
    private float measurement;
    private String date;
    private int user;

    @Override
    public String toString() {
        return "Weight{" +
                "id=" + id +
                ", measurement=" + measurement +
                ", date='" + date + '\'' +
                ", user=" + user +
                '}';
    }

    public int getId() {
        return id;
    }

    public Weight setId(int id) {
        this.id = id;
        return this;
    }

    public float getMeasurement() {
        return measurement;
    }

    public Weight setMeasurement(float measurement) {
        this.measurement = measurement;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Weight setDate(String date) {
        this.date = date;
        return this;
    }

    public int getUser() {
        return user;
    }

    public Weight setUser(int user) {
        this.user = user;
        return this;
    }
}
