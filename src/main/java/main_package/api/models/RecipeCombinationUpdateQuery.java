package main_package.api.models;

public class RecipeCombinationUpdateQuery {
    private int combination_id;
    private float servings;

    @Override
    public String toString() {
        return "RecipeCombinationUpdateQuery{" +
                "combination_id=" + combination_id +
                ", servings=" + servings +
                '}';
    }

    public int getCombination_id() {
        return combination_id;
    }

    public RecipeCombinationUpdateQuery setCombination_id(int combination_id) {
        this.combination_id = combination_id;
        return this;
    }

    public float getServings() {
        return servings;
    }

    public RecipeCombinationUpdateQuery setServings(float servings) {
        this.servings = servings;
        return this;
    }
}
