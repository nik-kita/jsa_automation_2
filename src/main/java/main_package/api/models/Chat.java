package main_package.api.models;

public class Chat {
    private int id;
    private User user;
    private String date;
    private boolean client_update;
    private boolean coach_update;
    private boolean other_update;

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", user=" + user +
                ", date='" + date + '\'' +
                ", client_update=" + client_update +
                ", coach_update=" + coach_update +
                ", other_update=" + other_update +
                '}';
    }

    public int getId() {
        return id;
    }

    public Chat setId(int id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Chat setUser(User user) {
        this.user = user;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Chat setDate(String date) {
        this.date = date;
        return this;
    }

    public boolean isClient_update() {
        return client_update;
    }

    public Chat setClient_update(boolean client_update) {
        this.client_update = client_update;
        return this;
    }

    public boolean isCoach_update() {
        return coach_update;
    }

    public Chat setCoach_update(boolean coach_update) {
        this.coach_update = coach_update;
        return this;
    }

    public boolean isOther_update() {
        return other_update;
    }

    public Chat setOther_update(boolean other_update) {
        this.other_update = other_update;
        return this;
    }
}
