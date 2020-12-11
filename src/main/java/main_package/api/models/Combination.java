package main_package.api.models;

public class Combination {
    private int id;
    private String name;
    private float calories;
    private float protein;
    private int profile_u;

    @Override
    public String toString() {
        return "Combination{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", protein=" + protein +
                ", profile_u=" + profile_u +
                '}';
    }

    public int getId() {
        return id;
    }

    public Combination setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Combination setName(String name) {
        this.name = name;
        return this;
    }

    public float getCalories() {
        return calories;
    }

    public Combination setCalories(float calories) {
        this.calories = calories;
        return this;
    }

    public float getProtein() {
        return protein;
    }

    public Combination setProtein(float protein) {
        this.protein = protein;
        return this;
    }

    public int getProfile_u() {
        return profile_u;
    }

    public Combination setProfile_u(int profile_u) {
        this.profile_u = profile_u;
        return this;
    }
}
