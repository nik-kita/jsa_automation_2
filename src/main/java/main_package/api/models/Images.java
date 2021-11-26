package main_package.api.models;

public class Images {
    private int id;
    private String photo;
    private String date;
    private int user;

    @Override
    public String toString() {
        return "Images{" +
                "id=" + id +
                ", photo='" + photo + '\'' +
                ", date='" + date + '\'' +
                ", user=" + user +
                '}';
    }

    public int getId() {
        return id;
    }

    public Images setId(int id) {
        this.id = id;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public Images setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Images setDate(String date) {
        this.date = date;
        return this;
    }

    public int getUser() {
        return user;
    }

    public Images setUser(int user) {
        this.user = user;
        return this;
    }
}
