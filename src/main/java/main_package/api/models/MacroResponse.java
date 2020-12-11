package main_package.api.models;

public class MacroResponse {
    private int protein;
    private int calories;

    @Override
    public String toString() {
        return "MacroResponse{" +
                "protein=" + protein +
                ", calories=" + calories +
                '}';
    }

    public int getProtein() {
        return protein;
    }

    public MacroResponse setProtein(int protein) {
        this.protein = protein;
        return this;
    }

    public int getCalories() {
        return calories;
    }

    public MacroResponse setCalories(int calories) {
        this.calories = calories;
        return this;
    }
}
