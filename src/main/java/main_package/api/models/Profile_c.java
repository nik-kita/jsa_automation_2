package main_package.api.models;

public class Profile_c {
    private int id;
    private User user;
    private String image;

    @Override
    public String toString() {
        return "Profile_c{" +
                "id=" + id +
                ", user=" + user +
                ", image='" + image + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public Profile_c setId(int id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Profile_c setUser(User user) {
        this.user = user;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Profile_c setImage(String image) {
        this.image = image;
        return this;
    }
}
