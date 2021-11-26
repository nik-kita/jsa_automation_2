package main_package.api.models;

public class RecipeRate {
    private int recipe_id;
    private float given_rating;

    public int getRecipe_id() {
        return recipe_id;
    }

    public RecipeRate setRecipe_id(int recipe_id) {
        this.recipe_id = recipe_id;
        return this;
    }

    public float getGiven_rating() {
        return given_rating;
    }

    @Override
    public String toString() {
        return "RecipeRate{" +
                "recipe_id=" + recipe_id +
                ", given_rating=" + given_rating +
                '}';
    }

    public RecipeRate setGiven_rating(float given_rating) {
        this.given_rating = given_rating;
        return this;
    }
}
