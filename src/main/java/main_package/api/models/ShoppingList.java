package main_package.api.models;

public class ShoppingList {
    private int id;
    private String name;
    private int user;

    public int getId() {
        return id;
    }

    public ShoppingList setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ShoppingList setName(String name) {
        this.name = name;
        return this;
    }

    public int getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "ShoppingList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user=" + user +
                '}';
    }

    public ShoppingList setUser(int user) {
        this.user = user;
        return this;
    }
}
