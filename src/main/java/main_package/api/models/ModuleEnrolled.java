package main_package.api.models;

public class ModuleEnrolled {
    private int id;
    private int score;
    private String date;
    private int user;
    private int module;

    @Override
    public String toString() {
        return "ModuleEnrolled{" +
                "id=" + id +
                ", score=" + score +
                ", date='" + date + '\'' +
                ", user=" + user +
                ", module=" + module +
                '}';
    }

    public int getId() {
        return id;
    }

    public ModuleEnrolled setId(int id) {
        this.id = id;
        return this;
    }

    public int getScore() {
        return score;
    }

    public ModuleEnrolled setScore(int score) {
        this.score = score;
        return this;
    }

    public String getDate() {
        return date;
    }

    public ModuleEnrolled setDate(String date) {
        this.date = date;
        return this;
    }

    public int getUser() {
        return user;
    }

    public ModuleEnrolled setUser(int user) {
        this.user = user;
        return this;
    }

    public int getModule() {
        return module;
    }

    public ModuleEnrolled setModule(int module) {
        this.module = module;
        return this;
    }
}
