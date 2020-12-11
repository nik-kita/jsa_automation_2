package main_package.api.models;

public class CustomChart {
    private int id;
    private String units;
    private String name;
    private String url_name;
    private int user;

    @Override
    public String toString() {
        return "CustomChart{" +
                "id=" + id +
                ", units='" + units + '\'' +
                ", name='" + name + '\'' +
                ", url_name='" + url_name + '\'' +
                ", user=" + user +
                '}';
    }

    public int getId() {
        return id;
    }

    public CustomChart setId(int id) {
        this.id = id;
        return this;
    }

    public String getUnits() {
        return units;
    }

    public CustomChart setUnits(String units) {
        this.units = units;
        return this;
    }

    public String getName() {
        return name;
    }

    public CustomChart setName(String name) {
        this.name = name;
        return this;
    }

    public String getUrl_name() {
        return url_name;
    }

    public CustomChart setUrl_name(String url_name) {
        this.url_name = url_name;
        return this;
    }

    public int getUser() {
        return user;
    }

    public CustomChart setUser(int user) {
        this.user = user;
        return this;
    }
}
