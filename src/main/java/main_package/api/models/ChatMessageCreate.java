package main_package.api.models;

public class ChatMessageCreate {
    private int id;
    private boolean is_staff;
    private String comment;
    private String photo;
    private String date;
    private int chat;
    private int profile_u;
    private int profile_c;

    @Override
    public String toString() {
        return "ChatMessageCreate{" +
                "id=" + id +
                ", is_staff=" + is_staff +
                ", comment='" + comment + '\'' +
                ", photo='" + photo + '\'' +
                ", date='" + date + '\'' +
                ", chat=" + chat +
                ", profile_u=" + profile_u +
                ", profile_c=" + profile_c +
                '}';
    }

    public int getId() {
        return id;
    }

    public ChatMessageCreate setId(int id) {
        this.id = id;
        return this;
    }

    public boolean isIs_staff() {
        return is_staff;
    }

    public ChatMessageCreate setIs_staff(boolean is_staff) {
        this.is_staff = is_staff;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public ChatMessageCreate setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public ChatMessageCreate setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getDate() {
        return date;
    }

    public ChatMessageCreate setDate(String date) {
        this.date = date;
        return this;
    }

    public int getChat() {
        return chat;
    }

    public ChatMessageCreate setChat(int chat) {
        this.chat = chat;
        return this;
    }

    public int getProfile_u() {
        return profile_u;
    }

    public ChatMessageCreate setProfile_u(int profile_u) {
        this.profile_u = profile_u;
        return this;
    }

    public int getProfile_c() {
        return profile_c;
    }

    public ChatMessageCreate setProfile_c(int profile_c) {
        this.profile_c = profile_c;
        return this;
    }
}
