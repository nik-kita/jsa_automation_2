package main_package.api.models;

public class WeeklyGoal {
    private int id;
    private String goal;
    private boolean achieved;
    private String date;
    private int user;

    @Override
    public String toString() {
        return "WeeklyGoal{" +
                "id=" + id +
                ", goal='" + goal + '\'' +
                ", achieved=" + achieved +
                ", date='" + date + '\'' +
                ", user=" + user +
                '}';
    }

    public int getId() {
        return id;
    }

    public WeeklyGoal setId(int id) {
        this.id = id;
        return this;
    }

    public String getGoal() {
        return goal;
    }

    public WeeklyGoal setGoal(String goal) {
        this.goal = goal;
        return this;
    }

    public boolean isAchieved() {
        return achieved;
    }

    public WeeklyGoal setAchieved(boolean achieved) {
        this.achieved = achieved;
        return this;
    }

    public String getDate() {
        return date;
    }

    public WeeklyGoal setDate(String date) {
        this.date = date;
        return this;
    }

    public int getUser() {
        return user;
    }

    public WeeklyGoal setUser(int user) {
        this.user = user;
        return this;
    }
}
