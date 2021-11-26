package main_package.api.models;

public class SaveGeneratedCombination {
    private String name;

    @Override
    public String toString() {
        return "SaveGeneratedCombination{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", protein=" + protein +
                ", recipe_ids='" + recipe_ids + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public SaveGeneratedCombination setName(String name) {
        this.name = name;
        return this;
    }

    public float getCalories() {
        return calories;
    }

    public SaveGeneratedCombination setCalories(float calories) {
        this.calories = calories;
        return this;
    }

    public float getProtein() {
        return protein;
    }

    public SaveGeneratedCombination setProtein(float protein) {
        this.protein = protein;
        return this;
    }

    public String getRecipe_ids() {
        return recipe_ids;
    }

    public SaveGeneratedCombination setRecipe_ids(String recipe_ids) {
        this.recipe_ids = recipe_ids;
        return this;
    }

    private float calories;
    private float protein;
    private String recipe_ids;
}
