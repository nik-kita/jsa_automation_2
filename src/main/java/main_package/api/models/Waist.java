package main_package.api.models;

public class Waist {
    private int id;
    private float measurement;
    private String date;
    private int user;

    @Override
    public String toString() {
        return "Waist{" +
                "id=" + id +
                ", measurement=" + measurement +
                ", date='" + date + '\'' +
                ", user=" + user +
                '}';
    }

    public int getId() {
        return id;
    }

    public Waist setId(int id) {
        this.id = id;
        return this;
    }

    public float getMeasurement() {
        return measurement;
    }

    public Waist setMeasurement(float measurement) {
        this.measurement = measurement;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Waist setDate(String date) {
        this.date = date;
        return this;
    }

    public int getUser() {
        return user;
    }

    public Waist setUser(int user) {
        this.user = user;
        return this;
    }
}
