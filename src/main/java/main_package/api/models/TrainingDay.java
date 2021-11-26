package main_package.api.models;

public class TrainingDay {
    private int id;
    private String type;
    private float rounds;
    private float time_completed_in;
    private String name;
    private boolean saved;
    private boolean completed;
    private String notes;
    private String user_change_log;
    private int order;
    private String completed_date;
    private int training_programme;
    private int raining_week;

    public int getId() {
        return id;
    }

    public TrainingDay setId(int id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public TrainingDay setType(String type) {
        this.type = type;
        return this;
    }

    public float getRounds() {
        return rounds;
    }

    public TrainingDay setRounds(float rounds) {
        this.rounds = rounds;
        return this;
    }

    public float getTime_completed_in() {
        return time_completed_in;
    }

    public TrainingDay setTime_completed_in(float time_completed_in) {
        this.time_completed_in = time_completed_in;
        return this;
    }

    public String getName() {
        return name;
    }

    public TrainingDay setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isSaved() {
        return saved;
    }

    public TrainingDay setSaved(boolean saved) {
        this.saved = saved;
        return this;
    }

    public boolean isCompleted() {
        return completed;
    }

    public TrainingDay setCompleted(boolean completed) {
        this.completed = completed;
        return this;
    }

    public String getNotes() {
        return notes;
    }

    public TrainingDay setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public String getUser_change_log() {
        return user_change_log;
    }

    public TrainingDay setUser_change_log(String user_change_log) {
        this.user_change_log = user_change_log;
        return this;
    }

    public int getOrder() {
        return order;
    }

    public TrainingDay setOrder(int order) {
        this.order = order;
        return this;
    }

    public String getCompleted_date() {
        return completed_date;
    }

    public TrainingDay setCompleted_date(String completed_date) {
        this.completed_date = completed_date;
        return this;
    }

    public int getTraining_programme() {
        return training_programme;
    }

    public TrainingDay setTraining_programme(int training_programme) {
        this.training_programme = training_programme;
        return this;
    }

    public int getRaining_week() {
        return raining_week;
    }

    @Override
    public String toString() {
        return "TrainingDay{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", rounds=" + rounds +
                ", time_completed_in=" + time_completed_in +
                ", name='" + name + '\'' +
                ", saved=" + saved +
                ", completed=" + completed +
                ", notes='" + notes + '\'' +
                ", user_change_log='" + user_change_log + '\'' +
                ", order=" + order +
                ", completed_date='" + completed_date + '\'' +
                ", training_programme=" + training_programme +
                ", raining_week=" + raining_week +
                '}';
    }

    public TrainingDay setRaining_week(int raining_week) {
        this.raining_week = raining_week;
        return this;
    }
}
