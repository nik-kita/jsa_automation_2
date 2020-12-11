package main_package.api.models;

public class RecipeSearchResponse {
    private int id;
    private String name;
    private String photo;
    private float protein;
    private float calories;

    @Override
    public String toString() {
        return "RecipeSearchResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", protein=" + protein +
                ", calories=" + calories +
                '}';
    }

    public int getId() {
        return id;
    }

    public RecipeSearchResponse setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RecipeSearchResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public RecipeSearchResponse setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public float getProtein() {
        return protein;
    }

    public RecipeSearchResponse setProtein(float protein) {
        this.protein = protein;
        return this;
    }

    public float getCalories() {
        return calories;
    }

    public RecipeSearchResponse setCalories(float calories) {
        this.calories = calories;
        return this;
    }
}
