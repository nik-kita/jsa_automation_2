package main_package.api.models;

public class Module {
    private int id;
    private SubFilter sub_filter;
    private Equipment exercise_equipment;
    private String name;
    private String video;
    private String vimeo_url;
    private String equipment;
    private String tags;
    private int order;
    private boolean available_on_trial;
    private boolean available_for_program;
    private String date;
    private String experience_level;
    private String difficulty;//TODO this should be enum [Easy, Moderate, Hard]

    @Override
    public String toString() {
        return "Module{" +
                "id=" + id +
                ", sub_filter=" + sub_filter +
                ", exercise_equipment=" + exercise_equipment +
                ", name='" + name + '\'' +
                ", video='" + video + '\'' +
                ", vimeo_url='" + vimeo_url + '\'' +
                ", equipment='" + equipment + '\'' +
                ", tags='" + tags + '\'' +
                ", order=" + order +
                ", available_on_trial=" + available_on_trial +
                ", available_for_program=" + available_for_program +
                ", date='" + date + '\'' +
                ", experience_level='" + experience_level + '\'' +
                ", difficulty='" + difficulty + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public Module setId(int id) {
        this.id = id;
        return this;
    }

    public SubFilter getSub_filter() {
        return sub_filter;
    }

    public Module setSub_filter(SubFilter sub_filter) {
        this.sub_filter = sub_filter;
        return this;
    }

    public Equipment getExercise_equipment() {
        return exercise_equipment;
    }

    public Module setExercise_equipment(Equipment exercise_equipment) {
        this.exercise_equipment = exercise_equipment;
        return this;
    }

    public String getName() {
        return name;
    }

    public Module setName(String name) {
        this.name = name;
        return this;
    }

    public String getVideo() {
        return video;
    }

    public Module setVideo(String video) {
        this.video = video;
        return this;
    }

    public String getVimeo_url() {
        return vimeo_url;
    }

    public Module setVimeo_url(String vimeo_url) {
        this.vimeo_url = vimeo_url;
        return this;
    }

    public String getEquipment() {
        return equipment;
    }

    public Module setEquipment(String equipment) {
        this.equipment = equipment;
        return this;
    }

    public String getTags() {
        return tags;
    }

    public Module setTags(String tags) {
        this.tags = tags;
        return this;
    }

    public int getOrder() {
        return order;
    }

    public Module setOrder(int order) {
        this.order = order;
        return this;
    }

    public boolean isAvailable_on_trial() {
        return available_on_trial;
    }

    public Module setAvailable_on_trial(boolean available_on_trial) {
        this.available_on_trial = available_on_trial;
        return this;
    }

    public boolean isAvailable_for_program() {
        return available_for_program;
    }

    public Module setAvailable_for_program(boolean available_for_program) {
        this.available_for_program = available_for_program;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Module setDate(String date) {
        this.date = date;
        return this;
    }

    public String getExperience_level() {
        return experience_level;
    }

    public Module setExperience_level(String experience_level) {
        this.experience_level = experience_level;
        return this;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public Module setDifficulty(String difficulty) {
        this.difficulty = difficulty;
        return this;
    }
}
