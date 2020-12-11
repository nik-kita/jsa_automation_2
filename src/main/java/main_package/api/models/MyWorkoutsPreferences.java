package main_package.api.models;

public class MyWorkoutsPreferences {
    private int id;
    private String experience;
    private String focus;
    private String goal;
    private String facility;
    private int user;

    public int getId() {
        return id;
    }

    public MyWorkoutsPreferences setId(int id) {
        this.id = id;
        return this;
    }

    public String getExperience() {
        return experience;
    }

    public MyWorkoutsPreferences setExperience(String experience) {
        this.experience = experience;
        return this;
    }

    public String getFocus() {
        return focus;
    }

    public MyWorkoutsPreferences setFocus(String focus) {
        this.focus = focus;
        return this;
    }

    public String getGoal() {
        return goal;
    }

    public MyWorkoutsPreferences setGoal(String goal) {
        this.goal = goal;
        return this;
    }

    public String getFacility() {
        return facility;
    }

    public MyWorkoutsPreferences setFacility(String facility) {
        this.facility = facility;
        return this;
    }

    public int getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "MyWorkoutsPreferences{" +
                "id=" + id +
                ", experience='" + experience + '\'' +
                ", focus='" + focus + '\'' +
                ", goal='" + goal + '\'' +
                ", facility='" + facility + '\'' +
                ", user=" + user +
                '}';
    }

    public MyWorkoutsPreferences setUser(int user) {
        this.user = user;
        return this;
    }
}
