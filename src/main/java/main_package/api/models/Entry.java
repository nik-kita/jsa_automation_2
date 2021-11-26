package main_package.api.models;

public class Entry {
    private int id;
    private User user;
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
    private int challenge;

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", user=" + user +
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
                ", challenge=" + challenge +
                '}';
    }

    public int getId() {
        return id;
    }

    public Entry setId(int id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Entry setUser(User user) {
        this.user = user;
        return this;
    }

    public String getStory() {
        return story;
    }

    public Entry setStory(String story) {
        this.story = story;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Entry setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getGoal() {
        return goal;
    }

    public Entry setGoal(String goal) {
        this.goal = goal;
        return this;
    }

    public int getTarget() {
        return target;
    }

    public Entry setTarget(int target) {
        this.target = target;
        return this;
    }

    public String getTarget_units() {
        return target_units;
    }

    public Entry setTarget_units(String target_units) {
        this.target_units = target_units;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Entry setAge(int age) {
        this.age = age;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Entry setCountry(String country) {
        this.country = country;
        return this;
    }

    public boolean isAgreed_to_terms() {
        return agreed_to_terms;
    }

    public Entry setAgreed_to_terms(boolean agreed_to_terms) {
        this.agreed_to_terms = agreed_to_terms;
        return this;
    }

    public boolean isPass_judging() {
        return pass_judging;
    }

    public Entry setPass_judging(boolean pass_judging) {
        this.pass_judging = pass_judging;
        return this;
    }

    public boolean isFail_judging() {
        return fail_judging;
    }

    public Entry setFail_judging(boolean fail_judging) {
        this.fail_judging = fail_judging;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Entry setDate(String date) {
        this.date = date;
        return this;
    }

    public int getChallenge() {
        return challenge;
    }

    public Entry setChallenge(int challenge) {
        this.challenge = challenge;
        return this;
    }
}
