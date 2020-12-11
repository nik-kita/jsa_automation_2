package main_package.api.models;

public class CombinationRetrieveResponse {
    Combination days;
    CombinationRecipe meals;

    @Override
    public String toString() {
        return "CombinationRetrieveResponse{" +
                "days=" + days +
                ", meals=" + meals +
                '}';
    }

    public Combination getDays() {
        return days;
    }

    public CombinationRetrieveResponse setDays(Combination days) {
        this.days = days;
        return this;
    }

    public CombinationRecipe getMeals() {
        return meals;
    }

    public CombinationRetrieveResponse setMeals(CombinationRecipe meals) {
        this.meals = meals;
        return this;
    }
}
