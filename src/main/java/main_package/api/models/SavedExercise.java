package main_package.api.models;

public class SavedExercise {
    private int id;
    private String name;
    private String body_part;
    private String link;

    public int getId() {
        return id;
    }

    public SavedExercise setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SavedExercise setName(String name) {
        this.name = name;
        return this;
    }

    public String getBody_part() {
        return body_part;
    }

    public SavedExercise setBody_part(String body_part) {
        this.body_part = body_part;
        return this;
    }

    public String getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "SavedExercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", body_part='" + body_part + '\'' +
                ", link='" + link + '\'' +
                '}';
    }

    public SavedExercise setLink(String link) {
        this.link = link;
        return this;
    }
}
