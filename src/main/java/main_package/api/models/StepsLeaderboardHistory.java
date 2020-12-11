package main_package.api.models;

public class StepsLeaderboardHistory {
    private int id;
    private int steps;
    private String date;
    private String provider;
    private int manual_steps;
    private int profile;

    public int getId() {
        return id;
    }

    public StepsLeaderboardHistory setId(int id) {
        this.id = id;
        return this;
    }

    public int getSteps() {
        return steps;
    }

    public StepsLeaderboardHistory setSteps(int steps) {
        this.steps = steps;
        return this;
    }

    public String getDate() {
        return date;
    }

    public StepsLeaderboardHistory setDate(String date) {
        this.date = date;
        return this;
    }

    public String getProvider() {
        return provider;
    }

    public StepsLeaderboardHistory setProvider(String provider) {
        this.provider = provider;
        return this;
    }

    public int getManual_steps() {
        return manual_steps;
    }

    public StepsLeaderboardHistory setManual_steps(int manual_steps) {
        this.manual_steps = manual_steps;
        return this;
    }

    public int getProfile() {
        return profile;
    }

    @Override
    public String toString() {
        return "StepsLeaderboardHistory{" +
                "id=" + id +
                ", steps=" + steps +
                ", date='" + date + '\'' +
                ", provider='" + provider + '\'' +
                ", manual_steps=" + manual_steps +
                ", profile=" + profile +
                '}';
    }

    public StepsLeaderboardHistory setProfile(int profile) {
        this.profile = profile;
        return this;
    }
}
