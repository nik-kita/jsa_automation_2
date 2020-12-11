package main_package.api.models;

public class FavModules {
    private int id;
    private int user;
    private int module;

    @Override
    public String toString() {
        return "FavModules{" +
                "id=" + id +
                ", user=" + user +
                ", module=" + module +
                '}';
    }

    public int getId() {
        return id;
    }

    public FavModules setId(int id) {
        this.id = id;
        return this;
    }

    public int getUser() {
        return user;
    }

    public FavModules setUser(int user) {
        this.user = user;
        return this;
    }

    public int getModule() {
        return module;
    }

    public FavModules setModule(int module) {
        this.module = module;
        return this;
    }
}
