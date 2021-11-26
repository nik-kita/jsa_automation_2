package main_package.api.models;

public class StepsLeaderboardCreate {
    private int id;
    private Profile_u profile;
    private String time_zone_offset;
    private String date;
    private int steps;
    private String provider;
    private int manual_steps;

    public int getId() {
        return id;
    }

    public StepsLeaderboardCreate setId(int id) {
        this.id = id;
        return this;
    }

    public Profile_u getProfile() {
        return profile;
    }

    public StepsLeaderboardCreate setProfile(Profile_u profile) {
        this.profile = profile;
        return this;
    }

    public String getTime_zone_offset() {
        return time_zone_offset;
    }

    public StepsLeaderboardCreate setTime_zone_offset(String time_zone_offset) {
        this.time_zone_offset = time_zone_offset;
        return this;
    }

    public String getDate() {
        return date;
    }

    public StepsLeaderboardCreate setDate(String date) {
        this.date = date;
        return this;
    }

    public int getSteps() {
        return steps;
    }

    public StepsLeaderboardCreate setSteps(int steps) {
        this.steps = steps;
        return this;
    }

    public String getProvider() {
        return provider;
    }

    public StepsLeaderboardCreate setProvider(String provider) {
        this.provider = provider;
        return this;
    }

    public int getManual_steps() {
        return manual_steps;
    }

    @Override
    public String toString() {
        return "StepsLeaderboardCreate{" +
                "id=" + id +
                ", profile=" + profile +
                ", time_zone_offset='" + time_zone_offset + '\'' +
                ", date='" + date + '\'' +
                ", steps=" + steps +
                ", provider='" + provider + '\'' +
                ", manual_steps=" + manual_steps +
                '}';
    }

    public StepsLeaderboardCreate setManual_steps(int manual_steps) {
        this.manual_steps = manual_steps;
        return this;
    }
}
