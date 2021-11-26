package main_package.api.models;

public class Recipe {
    private int id;
    private String name;
    private String username;
    private String type_meal;
    private String description;
    private float servings;
    private String ingredients;
    private String method;
    private String photo;
    private float protein;
    private float carbs;
    private float fat;
    private float rating;
    private int votes;
    private float average;
    private float calories;
    private String prep_time;
    private String cook_time;
    private String difficulty;
    private String suitable_for;
    private boolean approved;
    private String date;
    private int user;

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", type_meal='" + type_meal + '\'' +
                ", description='" + description + '\'' +
                ", servings=" + servings +
                ", ingredients='" + ingredients + '\'' +
                ", method='" + method + '\'' +
                ", photo='" + photo + '\'' +
                ", protein=" + protein +
                ", carbs=" + carbs +
                ", fat=" + fat +
                ", rating=" + rating +
                ", votes=" + votes +
                ", average=" + average +
                ", calories=" + calories +
                ", prep_time='" + prep_time + '\'' +
                ", cook_time='" + cook_time + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", suitable_for='" + suitable_for + '\'' +
                ", approved=" + approved +
                ", date='" + date + '\'' +
                ", user=" + user +
                '}';
    }

    public int getId() {
        return id;
    }

    public Recipe setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Recipe setName(String name) {
        this.name = name;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Recipe setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getType_meal() {
        return type_meal;
    }

    public Recipe setType_meal(String type_meal) {
        this.type_meal = type_meal;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Recipe setDescription(String description) {
        this.description = description;
        return this;
    }

    public float getServings() {
        return servings;
    }

    public Recipe setServings(float servings) {
        this.servings = servings;
        return this;
    }

    public String getIngredients() {
        return ingredients;
    }

    public Recipe setIngredients(String ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public Recipe setMethod(String method) {
        this.method = method;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public Recipe setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public float getProtein() {
        return protein;
    }

    public Recipe setProtein(float protein) {
        this.protein = protein;
        return this;
    }

    public float getCarbs() {
        return carbs;
    }

    public Recipe setCarbs(float carbs) {
        this.carbs = carbs;
        return this;
    }

    public float getFat() {
        return fat;
    }

    public Recipe setFat(float fat) {
        this.fat = fat;
        return this;
    }

    public float getRating() {
        return rating;
    }

    public Recipe setRating(float rating) {
        this.rating = rating;
        return this;
    }

    public int getVotes() {
        return votes;
    }

    public Recipe setVotes(int votes) {
        this.votes = votes;
        return this;
    }

    public float getAverage() {
        return average;
    }

    public Recipe setAverage(float average) {
        this.average = average;
        return this;
    }

    public float getCalories() {
        return calories;
    }

    public Recipe setCalories(float calories) {
        this.calories = calories;
        return this;
    }

    public String getPrep_time() {
        return prep_time;
    }

    public Recipe setPrep_time(String prep_time) {
        this.prep_time = prep_time;
        return this;
    }

    public String getCook_time() {
        return cook_time;
    }

    public Recipe setCook_time(String cook_time) {
        this.cook_time = cook_time;
        return this;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public Recipe setDifficulty(String difficulty) {
        this.difficulty = difficulty;
        return this;
    }

    public String getSuitable_for() {
        return suitable_for;
    }

    public Recipe setSuitable_for(String suitable_for) {
        this.suitable_for = suitable_for;
        return this;
    }

    public boolean isApproved() {
        return approved;
    }

    public Recipe setApproved(boolean approved) {
        this.approved = approved;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Recipe setDate(String date) {
        this.date = date;
        return this;
    }

    public int getUser() {
        return user;
    }

    public Recipe setUser(int user) {
        this.user = user;
        return this;
    }
}
