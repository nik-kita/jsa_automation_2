package main_package.api.models;

public class FavModulesResponse {
    private int id;
    private Module module;
    private int user;

    @Override
    public String toString() {
        return "FavModulesResponse{" +
                "id=" + id +
                ", module=" + module +
                ", user=" + user +
                '}';
    }

    public int getId() {
        return id;
    }

    public FavModulesResponse setId(int id) {
        this.id = id;
        return this;
    }

    public Module getModule() {
        return module;
    }

    public FavModulesResponse setModule(Module module) {
        this.module = module;
        return this;
    }

    public int getUser() {
        return user;
    }

    public FavModulesResponse setUser(int user) {
        this.user = user;
        return this;
    }
}
