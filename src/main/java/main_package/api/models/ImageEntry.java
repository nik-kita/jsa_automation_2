package main_package.api.models;

public class ImageEntry {
    private int id;
    private String image_entry;
    private int week_number;
    private String body_position;
    private String date;
    private int user;
    private int entry;

    @Override
    public String toString() {
        return "ImageEntry{" +
                "id=" + id +
                ", image_entry='" + image_entry + '\'' +
                ", week_number=" + week_number +
                ", body_position='" + body_position + '\'' +
                ", date='" + date + '\'' +
                ", user=" + user +
                ", entry=" + entry +
                '}';
    }

    public int getId() {
        return id;
    }

    public ImageEntry setId(int id) {
        this.id = id;
        return this;
    }

    public String getImage_entry() {
        return image_entry;
    }

    public ImageEntry setImage_entry(String image_entry) {
        this.image_entry = image_entry;
        return this;
    }

    public int getWeek_number() {
        return week_number;
    }

    public ImageEntry setWeek_number(int week_number) {
        this.week_number = week_number;
        return this;
    }

    public String getBody_position() {
        return body_position;
    }

    public ImageEntry setBody_position(String body_position) {
        this.body_position = body_position;
        return this;
    }

    public String getDate() {
        return date;
    }

    public ImageEntry setDate(String date) {
        this.date = date;
        return this;
    }

    public int getUser() {
        return user;
    }

    public ImageEntry setUser(int user) {
        this.user = user;
        return this;
    }

    public int getEntry() {
        return entry;
    }

    public ImageEntry setEntry(int entry) {
        this.entry = entry;
        return this;
    }
}
