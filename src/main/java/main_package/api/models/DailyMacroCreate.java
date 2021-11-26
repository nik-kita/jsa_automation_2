package main_package.api.models;

public class DailyMacroCreate {
    private int id;
    private String time_zone_offset;
    private float protein;
    private float carbs;
    private float fat;
    private float calories;
    private String date;
    private String provider_calories;
    private String provider_protein;
    private float manual_calories;
    private float manual_protein;
    private int user;

    @Override
    public String toString() {
        return "DailyMacroCreate{" +
                "id=" + id +
                ", time_zone_offset='" + time_zone_offset + '\'' +
                ", protein=" + protein +
                ", carbs=" + carbs +
                ", fat=" + fat +
                ", calories=" + calories +
                ", date='" + date + '\'' +
                ", provider_calories='" + provider_calories + '\'' +
                ", provider_protein='" + provider_protein + '\'' +
                ", manual_calories=" + manual_calories +
                ", manual_protein=" + manual_protein +
                ", user=" + user +
                '}';
    }

    public int getId() {
        return id;
    }

    public DailyMacroCreate setId(int id) {
        this.id = id;
        return this;
    }

    public String getTime_zone_offset() {
        return time_zone_offset;
    }

    public DailyMacroCreate setTime_zone_offset(String time_zone_offset) {
        this.time_zone_offset = time_zone_offset;
        return this;
    }

    public float getProtein() {
        return protein;
    }

    public DailyMacroCreate setProtein(float protein) {
        this.protein = protein;
        return this;
    }

    public float getCarbs() {
        return carbs;
    }

    public DailyMacroCreate setCarbs(float carbs) {
        this.carbs = carbs;
        return this;
    }

    public float getFat() {
        return fat;
    }

    public DailyMacroCreate setFat(float fat) {
        this.fat = fat;
        return this;
    }

    public float getCalories() {
        return calories;
    }

    public DailyMacroCreate setCalories(float calories) {
        this.calories = calories;
        return this;
    }

    public String getDate() {
        return date;
    }

    public DailyMacroCreate setDate(String date) {
        this.date = date;
        return this;
    }

    public String getProvider_calories() {
        return provider_calories;
    }

    public DailyMacroCreate setProvider_calories(String provider_calories) {
        this.provider_calories = provider_calories;
        return this;
    }

    public String getProvider_protein() {
        return provider_protein;
    }

    public DailyMacroCreate setProvider_protein(String provider_protein) {
        this.provider_protein = provider_protein;
        return this;
    }

    public float getManual_calories() {
        return manual_calories;
    }

    public DailyMacroCreate setManual_calories(float manual_calories) {
        this.manual_calories = manual_calories;
        return this;
    }

    public float getManual_protein() {
        return manual_protein;
    }

    public DailyMacroCreate setManual_protein(float manual_protein) {
        this.manual_protein = manual_protein;
        return this;
    }

    public int getUser() {
        return user;
    }

    public DailyMacroCreate setUser(int user) {
        this.user = user;
        return this;
    }
}
