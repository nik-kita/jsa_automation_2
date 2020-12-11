package main_package.api.models;

public class StepGoal {
    private int id;
    private int count;
    private String date_set;
    private int user;

    public int getId() {
        return id;
    }

    public StepGoal setId(int id) {
        this.id = id;
        return this;
    }

    public int getCount() {
        return count;
    }

    public StepGoal setCount(int count) {
        this.count = count;
        return this;
    }

    public String getDate_set() {
        return date_set;
    }

    public StepGoal setDate_set(String date_set) {
        this.date_set = date_set;
        return this;
    }

    public int getUser() {
        return user;
    }

    public StepGoal setUser(int user) {
        this.user = user;
        return this;
    }
}
