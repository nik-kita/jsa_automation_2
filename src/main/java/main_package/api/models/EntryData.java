package main_package.api.models;

public class EntryData {
    private int id;
    private User user;
    private String email;
    private int challenge;
    private String first_name;
    private String last_name;
    private String story;
    private String gender;
    private String goal;
    private int target;
    private String target_units;
    private int age;
    private String country;
    private boolean agreed_to_terms;
    private boolean pass_judging;
    private boolean fail_judging;
    private String date;

    @Override
    public String toString() {
        return "EntryData{" +
                "id=" + id +
                ", user=" + user +
                ", email='" + email + '\'' +
                ", challenge=" + challenge +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", story='" + story + '\'' +
                ", gender='" + gender + '\'' +
                ", goal='" + goal + '\'' +
                ", target=" + target +
                ", target_units='" + target_units + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", agreed_to_terms=" + agreed_to_terms +
                ", pass_judging=" + pass_judging +
                ", fail_judging=" + fail_judging +
                ", date='" + date + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public EntryData setId(int id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public EntryData setUser(User user) {
        this.user = user;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public EntryData setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getChallenge() {
        return challenge;
    }

    public EntryData setChallenge(int challenge) {
        this.challenge = challenge;
        return this;
    }

    public String getFirst_name() {
        return first_name;
    }

    public EntryData setFirst_name(String first_name) {
        this.first_name = first_name;
        return this;
    }

    public String getLast_name() {
        return last_name;
    }

    public EntryData setLast_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    public String getStory() {
        return story;
    }

    public EntryData setStory(String story) {
        this.story = story;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public EntryData setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getGoal() {
        return goal;
    }

    public EntryData setGoal(String goal) {
        this.goal = goal;
        return this;
    }

    public int getTarget() {
        return target;
    }

    public EntryData setTarget(int target) {
        this.target = target;
        return this;
    }

    public String getTarget_units() {
        return target_units;
    }

    public EntryData setTarget_units(String target_units) {
        this.target_units = target_units;
        return this;
    }

    public int getAge() {
        return age;
    }

    public EntryData setAge(int age) {
        this.age = age;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public EntryData setCountry(String country) {
        this.country = country;
        return this;
    }

    public boolean isAgreed_to_terms() {
        return agreed_to_terms;
    }

    public EntryData setAgreed_to_terms(boolean agreed_to_terms) {
        this.agreed_to_terms = agreed_to_terms;
        return this;
    }

    public boolean isPass_judging() {
        return pass_judging;
    }

    public EntryData setPass_judging(boolean pass_judging) {
        this.pass_judging = pass_judging;
        return this;
    }

    public boolean isFail_judging() {
        return fail_judging;
    }

    public EntryData setFail_judging(boolean fail_judging) {
        this.fail_judging = fail_judging;
        return this;
    }

    public String getDate() {
        return date;
    }

    public EntryData setDate(String date) {
        this.date = date;
        return this;
    }
}
