package main_package.api.models;

public class StepsLeaderboard {
    private int id;
    private Profile profile;
    private int steps;
    private String date;
    private String provider;
    private int manual_steps;

    public int getId() {
        return id;
    }

    public StepsLeaderboard setId(int id) {
        this.id = id;
        return this;
    }

    public Profile getProfile() {
        return profile;
    }

    public StepsLeaderboard setProfile(Profile profile) {
        this.profile = profile;
        return this;
    }

    public int getSteps() {
        return steps;
    }

    public StepsLeaderboard setSteps(int steps) {
        this.steps = steps;
        return this;
    }

    public String getDate() {
        return date;
    }

    public StepsLeaderboard setDate(String date) {
        this.date = date;
        return this;
    }

    public String getProvider() {
        return provider;
    }

    public StepsLeaderboard setProvider(String provider) {
        this.provider = provider;
        return this;
    }

    public int getManual_steps() {
        return manual_steps;
    }

    @Override
    public String toString() {
        return "StepsLeaderboard{" +
                "id=" + id +
                ", profile=" + profile +
                ", steps=" + steps +
                ", date='" + date + '\'' +
                ", provider='" + provider + '\'' +
                ", manual_steps=" + manual_steps +
                '}';
    }

    public StepsLeaderboard setManual_steps(int manual_steps) {
        this.manual_steps = manual_steps;
        return this;
    }
}
