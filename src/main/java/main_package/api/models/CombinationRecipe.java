package main_package.api.models;

public class CombinationRecipe {
    private int id;
    private Recipe recipe;
    private float servings;
    private int combination;

    @Override
    public String toString() {
        return "CombinationRecipe{" +
                "id=" + id +
                ", recipe=" + recipe +
                ", servings=" + servings +
                ", combination=" + combination +
                '}';
    }

    public int getId() {
        return id;
    }

    public CombinationRecipe setId(int id) {
        this.id = id;
        return this;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public CombinationRecipe setRecipe(Recipe recipe) {
        this.recipe = recipe;
        return this;
    }

    public float getServings() {
        return servings;
    }

    public CombinationRecipe setServings(float servings) {
        this.servings = servings;
        return this;
    }

    public int getCombination() {
        return combination;
    }

    public CombinationRecipe setCombination(int combination) {
        this.combination = combination;
        return this;
    }
}
