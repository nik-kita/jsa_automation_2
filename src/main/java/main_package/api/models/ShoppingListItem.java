package main_package.api.models;

public class ShoppingListItem {
    private int id;
    private RecipeIngredient recipe_ingredient;
    private ShoppingList shopping_list;
    private int recipe_ingredient_id;

    public int getId() {
        return id;
    }

    public ShoppingListItem setId(int id) {
        this.id = id;
        return this;
    }

    public RecipeIngredient getRecipe_ingredient() {
        return recipe_ingredient;
    }

    public ShoppingListItem setRecipe_ingredient(RecipeIngredient recipe_ingredient) {
        this.recipe_ingredient = recipe_ingredient;
        return this;
    }

    public ShoppingList getShopping_list() {
        return shopping_list;
    }

    public ShoppingListItem setShopping_list(ShoppingList shopping_list) {
        this.shopping_list = shopping_list;
        return this;
    }

    public int getRecipe_ingredient_id() {
        return recipe_ingredient_id;
    }

    public ShoppingListItem setRecipe_ingredient_id(int recipe_ingredient_id) {
        this.recipe_ingredient_id = recipe_ingredient_id;
        return this;
    }

    public int getShopping_list_id() {
        return shopping_list_id;
    }

    public ShoppingListItem setShopping_list_id(int shopping_list_id) {
        this.shopping_list_id = shopping_list_id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ShoppingListItem setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isChecked_off() {
        return checked_off;
    }

    public ShoppingListItem setChecked_off(boolean checked_off) {
        this.checked_off = checked_off;
        return this;
    }

    private int shopping_list_id;
    private String name;
    private boolean checked_off;
}
