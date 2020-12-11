package main_package.api.models;

public class TrainingDayCreate {
    private int id;
    private int training_programme;
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
    private int training_week;

    public int getId() {
        return id;
    }

    public TrainingDayCreate setId(int id) {
        this.id = id;
        return this;
    }

    public int getTraining_programme() {
        return training_programme;
    }

    public TrainingDayCreate setTraining_programme(int training_programme) {
        this.training_programme = training_programme;
        return this;
    }

    public String getType() {
        return type;
    }

    public TrainingDayCreate setType(String type) {
        this.type = type;
        return this;
    }

    public float getRounds() {
        return rounds;
    }

    public TrainingDayCreate setRounds(float rounds) {
        this.rounds = rounds;
        return this;
    }

    public float getTime_completed_in() {
        return time_completed_in;
    }

    public TrainingDayCreate setTime_completed_in(float time_completed_in) {
        this.time_completed_in = time_completed_in;
        return this;
    }

    public String getName() {
        return name;
    }

    public TrainingDayCreate setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isSaved() {
        return saved;
    }

    public TrainingDayCreate setSaved(boolean saved) {
        this.saved = saved;
        return this;
    }

    public boolean isCompleted() {
        return completed;
    }

    public TrainingDayCreate setCompleted(boolean completed) {
        this.completed = completed;
        return this;
    }

    public String getNotes() {
        return notes;
    }

    public TrainingDayCreate setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public String getUser_change_log() {
        return user_change_log;
    }

    public TrainingDayCreate setUser_change_log(String user_change_log) {
        this.user_change_log = user_change_log;
        return this;
    }

    public int getOrder() {
        return order;
    }

    public TrainingDayCreate setOrder(int order) {
        this.order = order;
        return this;
    }

    public String getCompleted_date() {
        return completed_date;
    }

    public TrainingDayCreate setCompleted_date(String completed_date) {
        this.completed_date = completed_date;
        return this;
    }

    public int getTraining_week() {
        return training_week;
    }

    @Override
    public String toString() {
        return "TrainingDayCreate{" +
                "id=" + id +
                ", training_programme=" + training_programme +
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
                ", training_week=" + training_week +
                '}';
    }

    public TrainingDayCreate setTraining_week(int training_week) {
        this.training_week = training_week;
        return this;
    }
}
