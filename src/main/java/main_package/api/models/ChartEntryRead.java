package main_package.api.models;

public class ChartEntryRead {
    private int id;
    private String chart_entry;
    private String date;
    private int user;
    private int entry;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ChartEntryRead{" +
                "id=" + id +
                ", chart_entry='" + chart_entry + '\'' +
                ", date='" + date + '\'' +
                ", user=" + user +
                ", entry=" + entry +
                '}';
    }

    public ChartEntryRead setId(int id) {
        this.id = id;
        return this;
    }

    public String getChart_entry() {
        return chart_entry;
    }

    public ChartEntryRead setChart_entry(String chart_entry) {
        this.chart_entry = chart_entry;
        return this;
    }

    public String getDate() {
        return date;
    }

    public ChartEntryRead setDate(String date) {
        this.date = date;
        return this;
    }

    public int getUser() {
        return user;
    }

    public ChartEntryRead setUser(int user) {
        this.user = user;
        return this;
    }

    public int getEntry() {
        return entry;
    }

    public ChartEntryRead setEntry(int entry) {
        this.entry = entry;
        return this;
    }
}
