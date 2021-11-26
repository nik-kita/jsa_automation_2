package main_package.api.models;

public class DailyMacroEntry {
    private int id;
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
        return "DailyMacroEntry{" +
                "id=" + id +
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

    public DailyMacroEntry setId(int id) {
        this.id = id;
        return this;
    }

    public float getProtein() {
        return protein;
    }

    public DailyMacroEntry setProtein(float protein) {
        this.protein = protein;
        return this;
    }

    public float getCarbs() {
        return carbs;
    }

    public DailyMacroEntry setCarbs(float carbs) {
        this.carbs = carbs;
        return this;
    }

    public float getFat() {
        return fat;
    }

    public DailyMacroEntry setFat(float fat) {
        this.fat = fat;
        return this;
    }

    public float getCalories() {
        return calories;
    }

    public DailyMacroEntry setCalories(float calories) {
        this.calories = calories;
        return this;
    }

    public String getDate() {
        return date;
    }

    public DailyMacroEntry setDate(String date) {
        this.date = date;
        return this;
    }

    public String getProvider_calories() {
        return provider_calories;
    }

    public DailyMacroEntry setProvider_calories(String provider_calories) {
        this.provider_calories = provider_calories;
        return this;
    }

    public String getProvider_protein() {
        return provider_protein;
    }

    public DailyMacroEntry setProvider_protein(String provider_protein) {
        this.provider_protein = provider_protein;
        return this;
    }

    public float getManual_calories() {
        return manual_calories;
    }

    public DailyMacroEntry setManual_calories(float manual_calories) {
        this.manual_calories = manual_calories;
        return this;
    }

    public float getManual_protein() {
        return manual_protein;
    }

    public DailyMacroEntry setManual_protein(float manual_protein) {
        this.manual_protein = manual_protein;
        return this;
    }

    public int getUser() {
        return user;
    }

    public DailyMacroEntry setUser(int user) {
        this.user = user;
        return this;
    }
}
