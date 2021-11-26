package main_package.api.models;

public class DailyMacroSyncItem {
    private int id;
    private float protein;
    private float calories;
    private String provider_calories;
    private String provider_protein;
    private int manual_calories;
    private int manual_protein;
    private String date;

    @Override
    public String toString() {
        return "DailyMacroSyncItem{" +
                "id=" + id +
                ", protein=" + protein +
                ", calories=" + calories +
                ", provider_calories='" + provider_calories + '\'' +
                ", provider_protein='" + provider_protein + '\'' +
                ", manual_calories=" + manual_calories +
                ", manual_protein=" + manual_protein +
                ", date='" + date + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public DailyMacroSyncItem setId(int id) {
        this.id = id;
        return this;
    }

    public float getProtein() {
        return protein;
    }

    public DailyMacroSyncItem setProtein(float protein) {
        this.protein = protein;
        return this;
    }

    public float getCalories() {
        return calories;
    }

    public DailyMacroSyncItem setCalories(float calories) {
        this.calories = calories;
        return this;
    }

    public String getProvider_calories() {
        return provider_calories;
    }

    public DailyMacroSyncItem setProvider_calories(String provider_calories) {
        this.provider_calories = provider_calories;
        return this;
    }

    public String getProvider_protein() {
        return provider_protein;
    }

    public DailyMacroSyncItem setProvider_protein(String provider_protein) {
        this.provider_protein = provider_protein;
        return this;
    }

    public int getManual_calories() {
        return manual_calories;
    }

    public DailyMacroSyncItem setManual_calories(int manual_calories) {
        this.manual_calories = manual_calories;
        return this;
    }

    public int getManual_protein() {
        return manual_protein;
    }

    public DailyMacroSyncItem setManual_protein(int manual_protein) {
        this.manual_protein = manual_protein;
        return this;
    }

    public String getDate() {
        return date;
    }

    public DailyMacroSyncItem setDate(String date) {
        this.date = date;
        return this;
    }
}
