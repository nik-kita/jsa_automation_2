package main_package.api.models;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class User {
    private int id;
    private String username;
    private String email;
    private String first_name;
    private String last_name;
    private String password;
    private int profile;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", profile=" + profile +
                '}';
    }

    public static User getValidApiUser() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/main/resources/credentials.properties"));
        } catch (IOException e) {
            System.err.println("It looks like you forgot to create 'src/resources/credentials.properties' file");
        }
        return new User().setUsername(properties.getProperty("apiUserName"))
                .setEmail(properties.getProperty(properties.getProperty("apiUserEmail")))
                .setPassword(properties.getProperty("apiPassword"))
                .setFirst_name(properties.getProperty("apiFirstName"))
                .setLast_name(properties.getProperty("apiLastName"));
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirst_name() {
        return first_name;
    }

    public User setFirst_name(String first_name) {
        this.first_name = first_name;
        return this;
    }

    public String getLast_name() {
        return last_name;
    }

    public User setLast_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    public int getProfile() {
        return profile;
    }

    public User setProfile(int profile) {
        this.profile = profile;
        return this;
    }
}
