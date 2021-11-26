package main_package.api.models;

public class Profile {
    private int id;
    private User_2 user;
    private String image;

    public int getId() {
        return id;
    }

    public Profile setId(int id) {
        this.id = id;
        return this;
    }

    public User_2 getUser() {
        return user;
    }

    public Profile setUser(User_2 user) {
        this.user = user;
        return this;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", user=" + user +
                ", image='" + image + '\'' +
                '}';
    }

    public Profile setImage(String image) {
        this.image = image;
        return this;
    }
}
