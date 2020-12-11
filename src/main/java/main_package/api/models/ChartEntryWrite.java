package main_package.api.models;

public class ChartEntryWrite {
    private int id;
    private int chart_entry;
    private String date;
    private int user;
    private int entry;

    @Override
    public String toString() {
        return "ChartEntryWrite{" +
                "id=" + id +
                ", chart_entry=" + chart_entry +
                ", date='" + date + '\'' +
                ", user=" + user +
                ", entry=" + entry +
                '}';
    }

    public int getId() {
        return id;
    }

    public ChartEntryWrite setId(int id) {
        this.id = id;
        return this;
    }

    public int getChart_entry() {
        return chart_entry;
    }

    public ChartEntryWrite setChart_entry(int chart_entry) {
        this.chart_entry = chart_entry;
        return this;
    }

    public String getDate() {
        return date;
    }

    public ChartEntryWrite setDate(String date) {
        this.date = date;
        return this;
    }

    public int getUser() {
        return user;
    }

    public ChartEntryWrite setUser(int user) {
        this.user = user;
        return this;
    }

    public int getEntry() {
        return entry;
    }

    public ChartEntryWrite setEntry(int entry) {
        this.entry = entry;
        return this;
    }
}
