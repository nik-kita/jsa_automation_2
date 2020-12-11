package main_package.api.models;

public class TrainingExercise {
    private int id;
    private SupersetGroup superset_group;
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

    public TrainingExercise setId(int id) {
        this.id = id;
        return this;
    }

    public SupersetGroup getSuperset_group() {
        return superset_group;
    }

    public TrainingExercise setSuperset_group(SupersetGroup superset_group) {
        this.superset_group = superset_group;
        return this;
    }

    public String getName() {
        return name;
    }

    public TrainingExercise setName(String name) {
        this.name = name;
        return this;
    }

    public String getLink() {
        return link;
    }

    public TrainingExercise setLink(String link) {
        this.link = link;
        return this;
    }

    public boolean isSuperset() {
        return superset;
    }

    public TrainingExercise setSuperset(boolean superset) {
        this.superset = superset;
        return this;
    }

    public int getOrder() {
        return order;
    }

    public TrainingExercise setOrder(int order) {
        this.order = order;
        return this;
    }

    public boolean isIs_warmup() {
        return is_warmup;
    }

    public TrainingExercise setIs_warmup(boolean is_warmup) {
        this.is_warmup = is_warmup;
        return this;
    }

    public String getNotes() {
        return notes;
    }

    public TrainingExercise setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public String getType() {
        return type;
    }

    public TrainingExercise setType(String type) {
        this.type = type;
        return this;
    }

    public boolean isAuto_rest_timer() {
        return auto_rest_timer;
    }

    public TrainingExercise setAuto_rest_timer(boolean auto_rest_timer) {
        this.auto_rest_timer = auto_rest_timer;
        return this;
    }

    public int getTraining_day() {
        return training_day;
    }

    @Override
    public String toString() {
        return "TrainingExercise{" +
                "id=" + id +
                ", superset_group=" + superset_group +
                ", name='" + name + '\'' +
                ", link='" + link + '\'' +
                ", superset=" + superset +
                ", order=" + order +
                ", is_warmup=" + is_warmup +
                ", notes='" + notes + '\'' +
                ", type='" + type + '\'' +
                ", auto_rest_timer=" + auto_rest_timer +
                ", training_day=" + training_day +
                '}';
    }

    public TrainingExercise setTraining_day(int training_day) {
        this.training_day = training_day;
        return this;
    }
}
