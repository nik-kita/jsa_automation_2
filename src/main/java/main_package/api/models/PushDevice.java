package main_package.api.models;

public class PushDevice {
    private int id;
    private String token;
    private int user;

    @Override
    public String toString() {
        return "PushDevice{" +
                "id=" + id +
                ", token='" + token + '\'' +
                ", user=" + user +
                '}';
    }

    public int getId() {
        return id;
    }

    public PushDevice setId(int id) {
        this.id = id;
        return this;
    }

    public String getToken() {
        return token;
    }

    public PushDevice setToken(String token) {
        this.token = token;
        return this;
    }

    public int getUser() {
        return user;
    }

    public PushDevice setUser(int user) {
        this.user = user;
        return this;
    }
}
