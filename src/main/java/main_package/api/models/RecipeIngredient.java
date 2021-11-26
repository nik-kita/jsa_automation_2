package main_package.api.models;

public class RecipeIngredient {
    private int id;
    private String name;
    private String quantity;
    private String type;
    private String units;
    private int recipe;

    public int getId() {
        return id;
    }

    public RecipeIngredient setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RecipeIngredient setName(String name) {
        this.name = name;
        return this;
    }

    public String getQuantity() {
        return quantity;
    }

    public RecipeIngredient setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getType() {
        return type;
    }

    public RecipeIngredient setType(String type) {
        this.type = type;
        return this;
    }

    public String getUnits() {
        return units;
    }

    public RecipeIngredient setUnits(String units) {
        this.units = units;
        return this;
    }

    public int getRecipe() {
        return recipe;
    }

    @Override
    public String toString() {
        return "RecipeIngredient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity='" + quantity + '\'' +
                ", type='" + type + '\'' +
                ", units='" + units + '\'' +
                ", recipe=" + recipe +
                '}';
    }

    public RecipeIngredient setRecipe(int recipe) {
        this.recipe = recipe;
        return this;
    }
}
