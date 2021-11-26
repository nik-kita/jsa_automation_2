package main_package.api.models;

public class RecipeRateResponse {
    private float average;

    public float getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "RecipeRateResponse{" +
                "average=" + average +
                '}';
    }

    public RecipeRateResponse setAverage(float average) {
        this.average = average;
        return this;
    }
}
