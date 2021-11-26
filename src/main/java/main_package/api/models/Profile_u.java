package main_package.api.models;

public class Profile_u {
    private int id;
    private User user;
    private String image;
    private String gender;
    private String exercise_experience;
    private float height;
    private float weight;
    private int age;
    private int workouts_per_week;
    private int sleep_per_day;
    private float activity_level;
    private String workouts_facility;
    private String general_goal;
    private int meals_number;
    private String food_preference;

    @Override
    public String toString() {
        return "Profile_u{" +
                "id=" + id +
                ", user=" + user +
                ", image='" + image + '\'' +
                ", gender='" + gender + '\'' +
                ", exercise_experience='" + exercise_experience + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                ", workouts_per_week=" + workouts_per_week +
                ", sleep_per_day=" + sleep_per_day +
                ", activity_level=" + activity_level +
                ", workouts_facility='" + workouts_facility + '\'' +
                ", general_goal='" + general_goal + '\'' +
                ", meals_number=" + meals_number +
                ", food_preference='" + food_preference + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public Profile_u setId(int id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Profile_u setUser(User user) {
        this.user = user;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Profile_u setImage(String image) {
        this.image = image;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Profile_u setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getExercise_experience() {
        return exercise_experience;
    }

    public Profile_u setExercise_experience(String exercise_experience) {
        this.exercise_experience = exercise_experience;
        return this;
    }

    public float getHeight() {
        return height;
    }

    public Profile_u setHeight(float height) {
        this.height = height;
        return this;
    }

    public float getWeight() {
        return weight;
    }

    public Profile_u setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Profile_u setAge(int age) {
        this.age = age;
        return this;
    }

    public int getWorkouts_per_week() {
        return workouts_per_week;
    }

    public Profile_u setWorkouts_per_week(int workouts_per_week) {
        this.workouts_per_week = workouts_per_week;
        return this;
    }

    public int getSleep_per_day() {
        return sleep_per_day;
    }

    public Profile_u setSleep_per_day(int sleep_per_day) {
        this.sleep_per_day = sleep_per_day;
        return this;
    }

    public float getActivity_level() {
        return activity_level;
    }

    public Profile_u setActivity_level(float activity_level) {
        this.activity_level = activity_level;
        return this;
    }

    public String getWorkouts_facility() {
        return workouts_facility;
    }

    public Profile_u setWorkouts_facility(String workouts_facility) {
        this.workouts_facility = workouts_facility;
        return this;
    }

    public String getGeneral_goal() {
        return general_goal;
    }

    public Profile_u setGeneral_goal(String general_goal) {
        this.general_goal = general_goal;
        return this;
    }

    public int getMeals_number() {
        return meals_number;
    }

    public Profile_u setMeals_number(int meals_number) {
        this.meals_number = meals_number;
        return this;
    }

    public String getFood_preference() {
        return food_preference;
    }

    public Profile_u setFood_preference(String food_preference) {
        this.food_preference = food_preference;
        return this;
    }
}
