package main_package.api.models;

public class TrainingExerciseUpdate {
    private int id;
    private int superset_group;
    private String name;
    private String link;
    private boolean superset;
    private int order;
    private boolean is_warmup;
    private String notes;
    private String type;
    private boolean auto_rest_timer;
    private int training_day;

    public int getId() {
        return id;
    }

    public TrainingExerciseUpdate setId(int id) {
        this.id = id;
        return this;
    }

    public int getSuperset_group() {
        return superset_group;
    }

    public TrainingExerciseUpdate setSuperset_group(int superset_group) {
        this.superset_group = superset_group;
        return this;
    }

    public String getName() {
        return name;
    }

    public TrainingExerciseUpdate setName(String name) {
        this.name = name;
        return this;
    }

    public String getLink() {
        return link;
    }

    public TrainingExerciseUpdate setLink(String link) {
        this.link = link;
        return this;
    }

    public boolean isSuperset() {
        return superset;
    }

    public TrainingExerciseUpdate setSuperset(boolean superset) {
        this.superset = superset;
        return this;
    }

    public int getOrder() {
        return order;
    }

    public TrainingExerciseUpdate setOrder(int order) {
        this.order = order;
        return this;
    }

    public boolean isIs_warmup() {
        return is_warmup;
    }

    public TrainingExerciseUpdate setIs_warmup(boolean is_warmup) {
        this.is_warmup = is_warmup;
        return this;
    }

    public String getNotes() {
        return notes;
    }

    public TrainingExerciseUpdate setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public String getType() {
        return type;
    }

    public TrainingExerciseUpdate setType(String type) {
        this.type = type;
        return this;
    }

    public boolean isAuto_rest_timer() {
        return auto_rest_timer;
    }

    public TrainingExerciseUpdate setAuto_rest_timer(boolean auto_rest_timer) {
        this.auto_rest_timer = auto_rest_timer;
        return this;
    }

    public int getTraining_day() {
        return training_day;
    }

    public TrainingExerciseUpdate setTraining_day(int training_day) {
        this.training_day = training_day;
        return this;
    }
}
