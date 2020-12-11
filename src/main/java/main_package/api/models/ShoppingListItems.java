package main_package.api.models;

public class ShoppingListItems {
    private ShoppingListItem shopping_list_items;

    public ShoppingListItem getShopping_list_items() {
        return shopping_list_items;
    }

    @Override
    public String toString() {
        return "ShoppingListItems{" +
                "shopping_list_items=" + shopping_list_items +
                '}';
    }

    public ShoppingListItems setShopping_list_items(ShoppingListItem shopping_list_items) {
        this.shopping_list_items = shopping_list_items;
        return this;
    }
}
