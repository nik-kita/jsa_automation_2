package main_package.api.models;

public class TrainingLogDay {
    private int id;
    private TrainingLogDayWeeks training_log_day_weeks;
    private int training_log_day_weeks_id;
    private String name;
    private int week_number;
    private float total_weight_lifted;
    private String type;
    private String focus;
    private float rounds;
    private String experience;
    private float time_completed_in;
    private String goal;
    private String facility;
    private boolean completed;
    private boolean for_program_templates;
    private String notes;
    private String date;
    private int user;

    public int getId() {
        return id;
    }

    public TrainingLogDay setId(int id) {
        this.id = id;
        return this;
    }

    public TrainingLogDayWeeks getTraining_log_day_weeks() {
        return training_log_day_weeks;
    }

    public TrainingLogDay setTraining_log_day_weeks(TrainingLogDayWeeks training_log_day_weeks) {
        this.training_log_day_weeks = training_log_day_weeks;
        return this;
    }

    public int getTraining_log_day_weeks_id() {
        return training_log_day_weeks_id;
    }

    public TrainingLogDay setTraining_log_day_weeks_id(int training_log_day_weeks_id) {
        this.training_log_day_weeks_id = training_log_day_weeks_id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TrainingLogDay setName(String name) {
        this.name = name;
        return this;
    }

    public int getWeek_number() {
        return week_number;
    }

    public TrainingLogDay setWeek_number(int week_number) {
        this.week_number = week_number;
        return this;
    }

    public float getTotal_weight_lifted() {
        return total_weight_lifted;
    }

    public TrainingLogDay setTotal_weight_lifted(float total_weight_lifted) {
        this.total_weight_lifted = total_weight_lifted;
        return this;
    }

    public String getType() {
        return type;
    }

    public TrainingLogDay setType(String type) {
        this.type = type;
        return this;
    }

    public String getFocus() {
        return focus;
    }

    public TrainingLogDay setFocus(String focus) {
        this.focus = focus;
        return this;
    }

    public float getRounds() {
        return rounds;
    }

    public TrainingLogDay setRounds(float rounds) {
        this.rounds = rounds;
        return this;
    }

    public String getExperience() {
        return experience;
    }

    public TrainingLogDay setExperience(String experience) {
        this.experience = experience;
        return this;
    }

    public float getTime_completed_in() {
        return time_completed_in;
    }

    public TrainingLogDay setTime_completed_in(float time_completed_in) {
        this.time_completed_in = time_completed_in;
        return this;
    }

    public String getGoal() {
        return goal;
    }

    public TrainingLogDay setGoal(String goal) {
        this.goal = goal;
        return this;
    }

    public String getFacility() {
        return facility;
    }

    public TrainingLogDay setFacility(String facility) {
        this.facility = facility;
        return this;
    }

    public boolean isCompleted() {
        return completed;
    }

    public TrainingLogDay setCompleted(boolean completed) {
        this.completed = completed;
        return this;
    }

    public boolean isFor_program_templates() {
        return for_program_templates;
    }

    public TrainingLogDay setFor_program_templates(boolean for_program_templates) {
        this.for_program_templates = for_program_templates;
        return this;
    }

    public String getNotes() {
        return notes;
    }

    public TrainingLogDay setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public String getDate() {
        return date;
    }

    public TrainingLogDay setDate(String date) {
        this.date = date;
        return this;
    }

    public int getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "TrainingLogDay{" +
                "id=" + id +
                ", training_log_day_weeks=" + training_log_day_weeks +
                ", training_log_day_weeks_id=" + training_log_day_weeks_id +
                ", name='" + name + '\'' +
                ", week_number=" + week_number +
                ", total_weight_lifted=" + total_weight_lifted +
                ", type='" + type + '\'' +
                ", focus='" + focus + '\'' +
                ", rounds=" + rounds +
                ", experience='" + experience + '\'' +
                ", time_completed_in=" + time_completed_in +
                ", goal='" + goal + '\'' +
                ", facility='" + facility + '\'' +
                ", completed=" + completed +
                ", for_program_templates=" + for_program_templates +
                ", notes='" + notes + '\'' +
                ", date='" + date + '\'' +
                ", user=" + user +
                '}';
    }

    public TrainingLogDay setUser(int user) {
        this.user = user;
        return this;
    }
}
