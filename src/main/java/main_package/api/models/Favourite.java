package main_package.api.models;

public class Favourite {
    private int id;
    private Recipe recipe;
    private int recipe_id;
    private String notes;
    private int user;

    public int getId() {
        return id;
    }

    public Favourite setId(int id) {
        this.id = id;
        return this;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public Favourite setRecipe(Recipe recipe) {
        this.recipe = recipe;
        return this;
    }

    public int getRecipe_id() {
        return recipe_id;
    }

    public Favourite setRecipe_id(int recipe_id) {
        this.recipe_id = recipe_id;
        return this;
    }

    public String getNotes() {
        return notes;
    }

    public Favourite setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public int getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Favourite{" +
                "id=" + id +
                ", recipe=" + recipe +
                ", recipe_id=" + recipe_id +
                ", notes='" + notes + '\'' +
                ", user=" + user +
                '}';
    }

    public Favourite setUser(int user) {
        this.user = user;
        return this;
    }
}
