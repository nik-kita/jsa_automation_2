package main_package.api.models;

public class MomentumScore {
    private int id;
    private int year;
    private int week_number;
    private float score;
    private int user;

    public int getId() {
        return id;
    }

    public MomentumScore setId(int id) {
        this.id = id;
        return this;
    }

    public int getYear() {
        return year;
    }

    public MomentumScore setYear(int year) {
        this.year = year;
        return this;
    }

    public int getWeek_number() {
        return week_number;
    }

    public MomentumScore setWeek_number(int week_number) {
        this.week_number = week_number;
        return this;
    }

    public float getScore() {
        return score;
    }

    public MomentumScore setScore(float score) {
        this.score = score;
        return this;
    }

    public int getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "MomentumScore{" +
                "id=" + id +
                ", year=" + year +
                ", week_number=" + week_number +
                ", score=" + score +
                ", user=" + user +
                '}';
    }

    public MomentumScore setUser(int user) {
        this.user = user;
        return this;
    }
}
