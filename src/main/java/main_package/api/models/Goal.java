package main_package.api.models;

public class Goal {
    private int id;
    private String goal;
    private String goal_category;
    private boolean check_ins;
    private String last_check_in;
    private String date;
    private int user;

    @Override
    public String toString() {
        return "Goal{" +
                "id=" + id +
                ", goal='" + goal + '\'' +
                ", goal_category='" + goal_category + '\'' +
                ", check_ins=" + check_ins +
                ", last_check_in='" + last_check_in + '\'' +
                ", date='" + date + '\'' +
                ", user=" + user +
                '}';
    }

    public int getId() {
        return id;
    }

    public Goal setId(int id) {
        this.id = id;
        return this;
    }

    public String getGoal() {
        return goal;
    }

    public Goal setGoal(String goal) {
        this.goal = goal;
        return this;
    }

    public String getGoal_category() {
        return goal_category;
    }

    public Goal setGoal_category(String goal_category) {
        this.goal_category = goal_category;
        return this;
    }

    public boolean isCheck_ins() {
        return check_ins;
    }

    public Goal setCheck_ins(boolean check_ins) {
        this.check_ins = check_ins;
        return this;
    }

    public String getLast_check_in() {
        return last_check_in;
    }

    public Goal setLast_check_in(String last_check_in) {
        this.last_check_in = last_check_in;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Goal setDate(String date) {
        this.date = date;
        return this;
    }

    public int getUser() {
        return user;
    }

    public Goal setUser(int user) {
        this.user = user;
        return this;
    }
}
