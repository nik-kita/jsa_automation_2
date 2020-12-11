package main_package.api.models;

public class ExcludedIngredients {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "ExcludedIngredients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public ExcludedIngredients setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ExcludedIngredients setName(String name) {
        this.name = name;
        return this;
    }
}
