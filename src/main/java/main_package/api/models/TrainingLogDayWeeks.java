package main_package.api.models;

public class TrainingLogDayWeeks {
    private int id;
    private String latest_training_log_day;
    private int number_of_weeks;
    private boolean week_one;
    private boolean week_two;
    private boolean week_three;
    private boolean week_four;
    private boolean week_five;
    private boolean week_six;
    private boolean completed;
    private int user;

    public int getId() {
        return id;
    }

    public TrainingLogDayWeeks setId(int id) {
        this.id = id;
        return this;
    }

    public String getLatest_training_log_day() {
        return latest_training_log_day;
    }

    public TrainingLogDayWeeks setLatest_training_log_day(String latest_training_log_day) {
        this.latest_training_log_day = latest_training_log_day;
        return this;
    }

    public int getNumber_of_weeks() {
        return number_of_weeks;
    }

    public TrainingLogDayWeeks setNumber_of_weeks(int number_of_weeks) {
        this.number_of_weeks = number_of_weeks;
        return this;
    }

    public boolean isWeek_one() {
        return week_one;
    }

    public TrainingLogDayWeeks setWeek_one(boolean week_one) {
        this.week_one = week_one;
        return this;
    }

    public boolean isWeek_two() {
        return week_two;
    }

    public TrainingLogDayWeeks setWeek_two(boolean week_two) {
        this.week_two = week_two;
        return this;
    }

    public boolean isWeek_three() {
        return week_three;
    }

    public TrainingLogDayWeeks setWeek_three(boolean week_three) {
        this.week_three = week_three;
        return this;
    }

    public boolean isWeek_four() {
        return week_four;
    }

    public TrainingLogDayWeeks setWeek_four(boolean week_four) {
        this.week_four = week_four;
        return this;
    }

    public boolean isWeek_five() {
        return week_five;
    }

    public TrainingLogDayWeeks setWeek_five(boolean week_five) {
        this.week_five = week_five;
        return this;
    }

    public boolean isWeek_six() {
        return week_six;
    }

    public TrainingLogDayWeeks setWeek_six(boolean week_six) {
        this.week_six = week_six;
        return this;
    }

    public boolean isCompleted() {
        return completed;
    }

    public TrainingLogDayWeeks setCompleted(boolean completed) {
        this.completed = completed;
        return this;
    }

    public int getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "TrainingLogDayWeeks{" +
                "id=" + id +
                ", latest_training_log_day='" + latest_training_log_day + '\'' +
                ", number_of_weeks=" + number_of_weeks +
                ", week_one=" + week_one +
                ", week_two=" + week_two +
                ", week_three=" + week_three +
                ", week_four=" + week_four +
                ", week_five=" + week_five +
                ", week_six=" + week_six +
                ", completed=" + completed +
                ", user=" + user +
                '}';
    }

    public TrainingLogDayWeeks setUser(int user) {
        this.user = user;
        return this;
    }
}
