package main_package.api.models;

public class TrainingComment {
    private int id;
    private int training;
    private Profile_u user;
    private Profile_c coach;
    private String comment;
    private String photo;
    private String date;

    public int getId() {
        return id;
    }

    public TrainingComment setId(int id) {
        this.id = id;
        return this;
    }

    public int getTraining() {
        return training;
    }

    public TrainingComment setTraining(int training) {
        this.training = training;
        return this;
    }

    public Profile_u getUser() {
        return user;
    }

    public TrainingComment setUser(Profile_u user) {
        this.user = user;
        return this;
    }

    public Profile_c getCoach() {
        return coach;
    }

    public TrainingComment setCoach(Profile_c coach) {
        this.coach = coach;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public TrainingComment setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public TrainingComment setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    @Override
    public String toString() {
        return "TrainingComment{" +
                "id=" + id +
                ", training=" + training +
                ", user=" + user +
                ", coach=" + coach +
                ", comment='" + comment + '\'' +
                ", photo='" + photo + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public String getDate() {
        return date;
    }

    public TrainingComment setDate(String date) {
        this.date = date;
        return this;
    }
}
