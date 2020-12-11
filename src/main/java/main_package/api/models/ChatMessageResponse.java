package main_package.api.models;

public class ChatMessageResponse {
    private int id;
    private Profile_c profile_c;
    private Profile_u profile_u;
    private String comment;
    private String photo;
    private String date;
    private int chat;

    @Override
    public String toString() {
        return "ChatMessageResponse{" +
                "id=" + id +
                ", profile_c=" + profile_c +
                ", profile_u=" + profile_u +
                ", comment='" + comment + '\'' +
                ", photo='" + photo + '\'' +
                ", date='" + date + '\'' +
                ", chat=" + chat +
                '}';
    }

    public int getId() {
        return id;
    }

    public ChatMessageResponse setId(int id) {
        this.id = id;
        return this;
    }

    public Profile_c getProfile_c() {
        return profile_c;
    }

    public ChatMessageResponse setProfile_c(Profile_c profile_c) {
        this.profile_c = profile_c;
        return this;
    }

    public Profile_u getProfile_u() {
        return profile_u;
    }

    public ChatMessageResponse setProfile_u(Profile_u profile_u) {
        this.profile_u = profile_u;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public ChatMessageResponse setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public ChatMessageResponse setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getDate() {
        return date;
    }

    public ChatMessageResponse setDate(String date) {
        this.date = date;
        return this;
    }

    public int getChat() {
        return chat;
    }

    public ChatMessageResponse setChat(int chat) {
        this.chat = chat;
        return this;
    }
}
