package main_package.api.models;

public class CombinationIdQuery {
    private int combination_id;

    @Override
    public String toString() {
        return "CombinationIdQuery{" +
                "combination_id=" + combination_id +
                '}';
    }

    public int getCombination_id() {
        return combination_id;
    }

    public CombinationIdQuery setCombination_id(int combination_id) {
        this.combination_id = combination_id;
        return this;
    }
}
