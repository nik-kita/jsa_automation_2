package main_package.data;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class User {
    private String name;
    private String email;
    private String password;
    private String facebookEmail;
    private String facebookNumber;
    private String facebookPassword;

    public User(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public static User getValidUser() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/main/resources/credentials.properties"));
        } catch (IOException e) {
            System.err.println("It looks like you forgot to create 'src/resources/credentials.properties' file");
        }
        User user = new User(properties.getProperty("username"), properties.getProperty("password"));
        if(properties.containsKey("facebookEmail")) {
            user.setFacebookEmail(properties.getProperty("facebookEmail"));
        }if(properties.containsKey("facebookNumber")) {
            user.setFacebookNumber(properties.getProperty("facebookNumber"));
        }if(properties.containsKey("facebookPassword")) {
            user.setFacebookPassword(properties.getProperty("facebookPassword"));
        }

        return user;
    }

    public void setFacebookEmail(String email) {
        facebookEmail = email;
    }
    public void setFacebookNumber(String number) {
        facebookNumber = number;
    }
    public void setFacebookPassword(String password) {
        facebookPassword = password;
    }
    public String getFacebookEmail() {
        System.out.println(facebookEmail);
        return facebookEmail;
    }
    public String getFacebookPassword() {
        System.out.println(facebookPassword);
        return facebookPassword;
    }
    public String getFacebookNumber() {
        return facebookNumber;
    }
}
