package main_package.api.models;

public class User_2 {
    private String first_name;

    public String getFirst_name() {
        return first_name;
    }

    @Override
    public String toString() {
        return "User_2{" +
                "first_name='" + first_name + '\'' +
                '}';
    }

    public User_2 setFirst_name(String first_name) {
        this.first_name = first_name;
        return this;
    }
}
