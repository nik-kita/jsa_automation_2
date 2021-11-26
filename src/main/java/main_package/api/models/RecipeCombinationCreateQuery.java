package main_package.api.models;

public class RecipeCombinationCreateQuery {
    private int combination_id;
    private int recipe_id;

    @Override
    public String toString() {
        return "RecipeCombinationCreateQuery{" +
                "combination_id=" + combination_id +
                ", recipe_id=" + recipe_id +
                '}';
    }

    public int getCombination_id() {
        return combination_id;
    }

    public RecipeCombinationCreateQuery setCombination_id(int combination_id) {
        this.combination_id = combination_id;
        return this;
    }

    public int getRecipe_id() {
        return recipe_id;
    }

    public RecipeCombinationCreateQuery setRecipe_id(int recipe_id) {
        this.recipe_id = recipe_id;
        return this;
    }
}
