package main_package.api.models;

public class CombinationCreate {
    private String name;
    private float calories;
    private float protein;

    @Override
    public String toString() {
        return "CombinationCreate{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", protein=" + protein +
                '}';
    }

    public String getName() {
        return name;
    }

    public CombinationCreate setName(String name) {
        this.name = name;
        return this;
    }

    public float getCalories() {
        return calories;
    }

    public CombinationCreate setCalories(float calories) {
        this.calories = calories;
        return this;
    }

    public float getProtein() {
        return protein;
    }

    public CombinationCreate setProtein(float protein) {
        this.protein = protein;
        return this;
    }
}
