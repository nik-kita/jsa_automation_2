package main_package.api.models;

public class CustomShoppingItem {
    private int shopping_list_id;
    private String name;

    public int getShopping_list_id() {
        return shopping_list_id;
    }

    public CustomShoppingItem setShopping_list_id(int shopping_list_id) {
        this.shopping_list_id = shopping_list_id;
        return this;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CustomShoppingItem{" +
                "shopping_list_id=" + shopping_list_id +
                ", name='" + name + '\'' +
                '}';
    }

    public CustomShoppingItem setName(String name) {
        this.name = name;
        return this;
    }
}
