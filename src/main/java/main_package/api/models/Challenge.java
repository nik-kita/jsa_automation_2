package main_package.api.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Challenge {
    private int id;
    private String name;
    private String start;
    private String end;
    private boolean close_enrollment;
    private boolean finished;
    private boolean first_month_notification;

    public boolean isFirst_month_notification() {
        return first_month_notification;
    }

    public Challenge setFirst_month_notification(boolean first_month_notification) {
        this.first_month_notification = first_month_notification;
        return this;
    }

    public boolean isSecond_month_notification() {
        return second_month_notification;
    }

    public Challenge setSecond_month_notification(boolean second_month_notification) {
        this.second_month_notification = second_month_notification;
        return this;
    }

    private boolean second_month_notification;

    public static Map<Integer, Challenge> getMap(List<Challenge> challenges) {
        Map<Integer, Challenge> result = new HashMap<>();
        for(Challenge c : challenges) {
            result.put(c.getId(), c);
        }
        return result;
    }

    public int getId() {
        return id;
    }

    public Challenge setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Challenge setName(String name) {
        this.name = name;
        return this;
    }

    public String getStart() {
        return start;
    }

    public Challenge setStart(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public Challenge setEnd(String end) {
        this.end = end;
        return this;
    }

    public boolean isClose_enrollment() {
        return close_enrollment;
    }

    public Challenge setClose_enrollment(boolean close_enrollment) {
        this.close_enrollment = close_enrollment;
        return this;
    }

    public boolean isFinished() {
        return finished;
    }

    public Challenge setFinished(boolean finished) {
        this.finished = finished;
        return this;
    }

    @Override
    public String toString() {
        return "Challenge{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", close_enrollment=" + close_enrollment +
                ", finished=" + finished +
                '}';
    }
}
