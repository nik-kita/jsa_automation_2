package main_package.api.models;

public class MacroCalculator {
    private int id;
    private String goal;
    private String units;
    private String gender;
    private int age;
    private float weight;
    private float height;
    private String activity_level;
    private float protein;
    private float carbs;
    private float fat;
    private float calories;
    private int user;

    @Override
    public String toString() {
        return "MacroCalculator{" +
                "id=" + id +
                ", goal='" + goal + '\'' +
                ", units='" + units + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", activity_level='" + activity_level + '\'' +
                ", protein=" + protein +
                ", carbs=" + carbs +
                ", fat=" + fat +
                ", calories=" + calories +
                ", user=" + user +
                '}';
    }

    public int getId() {
        return id;
    }

    public MacroCalculator setId(int id) {
        this.id = id;
        return this;
    }

    public String getGoal() {
        return goal;
    }

    public MacroCalculator setGoal(String goal) {
        this.goal = goal;
        return this;
    }

    public String getUnits() {
        return units;
    }

    public MacroCalculator setUnits(String units) {
        this.units = units;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public MacroCalculator setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public int getAge() {
        return age;
    }

    public MacroCalculator setAge(int age) {
        this.age = age;
        return this;
    }

    public float getWeight() {
        return weight;
    }

    public MacroCalculator setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public float getHeight() {
        return height;
    }

    public MacroCalculator setHeight(float height) {
        this.height = height;
        return this;
    }

    public String getActivity_level() {
        return activity_level;
    }

    public MacroCalculator setActivity_level(String activity_level) {
        this.activity_level = activity_level;
        return this;
    }

    public float getProtein() {
        return protein;
    }

    public MacroCalculator setProtein(float protein) {
        this.protein = protein;
        return this;
    }

    public float getCarbs() {
        return carbs;
    }

    public MacroCalculator setCarbs(float carbs) {
        this.carbs = carbs;
        return this;
    }

    public float getFat() {
        return fat;
    }

    public MacroCalculator setFat(float fat) {
        this.fat = fat;
        return this;
    }

    public float getCalories() {
        return calories;
    }

    public MacroCalculator setCalories(float calories) {
        this.calories = calories;
        return this;
    }

    public int getUser() {
        return user;
    }

    public MacroCalculator setUser(int user) {
        this.user = user;
        return this;
    }
}
