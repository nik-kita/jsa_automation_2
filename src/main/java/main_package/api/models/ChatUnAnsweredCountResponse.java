package main_package.api.models;

public class ChatUnAnsweredCountResponse {
    private int unanswered_chats;

    @Override
    public String toString() {
        return "ChatUnAnsweredCountResponse{" +
                "unanswered_chats=" + unanswered_chats +
                ", unanswered_today=" + unanswered_today +
                '}';
    }

    public int getUnanswered_chats() {
        return unanswered_chats;
    }

    public ChatUnAnsweredCountResponse setUnanswered_chats(int unanswered_chats) {
        this.unanswered_chats = unanswered_chats;
        return this;
    }

    public int getUnanswered_today() {
        return unanswered_today;
    }

    public ChatUnAnsweredCountResponse setUnanswered_today(int unanswered_today) {
        this.unanswered_today = unanswered_today;
        return this;
    }

    private int unanswered_today;
}
