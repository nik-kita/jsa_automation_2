package main_package.api.models;

public class CustomChartEntry {
    private int id;
    private float measurement;
    private String date;
    private int user;

    public int getId() {
        return id;
    }

    public CustomChartEntry setId(int id) {
        this.id = id;
        return this;
    }

    public float getMeasurement() {
        return measurement;
    }

    public CustomChartEntry setMeasurement(float measurement) {
        this.measurement = measurement;
        return this;
    }

    public String getDate() {
        return date;
    }

    public CustomChartEntry setDate(String date) {
        this.date = date;
        return this;
    }

    public int getUser() {
        return user;
    }

    public CustomChartEntry setUser(int user) {
        this.user = user;
        return this;
    }

    @Override
    public String toString() {
        return "CustomChartEntry{" +
                "id=" + id +
                ", measurement=" + measurement +
                ", date='" + date + '\'' +
                ", user=" + user +
                '}';
    }
}
