package main_package.api.models;

public class Training {
    private int id;
    private User user;
    private Profile_c coach;
    private String latest_completed_week;
    private int age;
    private String training_age;
    private String gender;
    private String goal;
    private String frequency;
    private String facility;
    private String medical;
    private String file;
    private int number_of_weeks;
    private boolean user_request;
    private boolean coach_completed;
    private boolean message_update;
    private String date;

    public int getId() {
        return id;
    }

    public Training setId(int id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Training setUser(User user) {
        this.user = user;
        return this;
    }

    public Profile_c getCoach() {
        return coach;
    }

    public Training setCoach(Profile_c coach) {
        this.coach = coach;
        return this;
    }

    public String getLatest_completed_week() {
        return latest_completed_week;
    }

    public Training setLatest_completed_week(String latest_completed_week) {
        this.latest_completed_week = latest_completed_week;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Training setAge(int age) {
        this.age = age;
        return this;
    }

    public String getTraining_age() {
        return training_age;
    }

    public Training setTraining_age(String training_age) {
        this.training_age = training_age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Training setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getGoal() {
        return goal;
    }

    public Training setGoal(String goal) {
        this.goal = goal;
        return this;
    }

    public String getFrequency() {
        return frequency;
    }

    public Training setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    public String getFacility() {
        return facility;
    }

    public Training setFacility(String facility) {
        this.facility = facility;
        return this;
    }

    public String getMedical() {
        return medical;
    }

    public Training setMedical(String medical) {
        this.medical = medical;
        return this;
    }

    public String getFile() {
        return file;
    }

    public Training setFile(String file) {
        this.file = file;
        return this;
    }

    public int getNumber_of_weeks() {
        return number_of_weeks;
    }

    public Training setNumber_of_weeks(int number_of_weeks) {
        this.number_of_weeks = number_of_weeks;
        return this;
    }

    public boolean isUser_request() {
        return user_request;
    }

    public Training setUser_request(boolean user_request) {
        this.user_request = user_request;
        return this;
    }

    public boolean isCoach_completed() {
        return coach_completed;
    }

    public Training setCoach_completed(boolean coach_completed) {
        this.coach_completed = coach_completed;
        return this;
    }

    public boolean isMessage_update() {
        return message_update;
    }

    public Training setMessage_update(boolean message_update) {
        this.message_update = message_update;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Training setDate(String date) {
        this.date = date;
        return this;
    }
}
