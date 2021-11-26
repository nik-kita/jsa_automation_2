package main_package.api.models;

public class AlternativeExerciseResponse {
    private int id;
    private Module video;
    private SupersetGroup superset_group;
    private String alternative_name;
    private int order;
    private boolean is_warmup;
    private boolean auto_rest_timer;
    private String notes;
    private String type;

    public int getId() {
        return id;
    }

    public AlternativeExerciseResponse setId(int id) {
        this.id = id;
        return this;
    }

    public Module getVideo() {
        return video;
    }

    public AlternativeExerciseResponse setVideo(Module video) {
        this.video = video;
        return this;
    }

    public SupersetGroup getSuperset_group() {
        return superset_group;
    }

    public AlternativeExerciseResponse setSuperset_group(SupersetGroup superset_group) {
        this.superset_group = superset_group;
        return this;
    }

    public String getAlternative_name() {
        return alternative_name;
    }

    public AlternativeExerciseResponse setAlternative_name(String alternative_name) {
        this.alternative_name = alternative_name;
        return this;
    }

    public int getOrder() {
        return order;
    }

    public AlternativeExerciseResponse setOrder(int order) {
        this.order = order;
        return this;
    }

    public boolean isIs_warmup() {
        return is_warmup;
    }

    public AlternativeExerciseResponse setIs_warmup(boolean is_warmup) {
        this.is_warmup = is_warmup;
        return this;
    }

    public boolean isAuto_rest_timer() {
        return auto_rest_timer;
    }

    public AlternativeExerciseResponse setAuto_rest_timer(boolean auto_rest_timer) {
        this.auto_rest_timer = auto_rest_timer;
        return this;
    }

    public String getNotes() {
        return notes;
    }

    public AlternativeExerciseResponse setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public String getType() {
        return type;
    }

    public AlternativeExerciseResponse setType(String type) {
        this.type = type;
        return this;
    }

    public int getTraining_log_day() {
        return training_log_day;
    }

    @Override
    public String toString() {
        return "AlternativeExerciseResponse{" +
                "id=" + id +
                ", video=" + video +
                ", superset_group=" + superset_group +
                ", alternative_name='" + alternative_name + '\'' +
                ", order=" + order +
                ", is_warmup=" + is_warmup +
                ", auto_rest_timer=" + auto_rest_timer +
                ", notes='" + notes + '\'' +
                ", type='" + type + '\'' +
                ", training_log_day=" + training_log_day +
                '}';
    }

    public AlternativeExerciseResponse setTraining_log_day(int training_log_day) {
        this.training_log_day = training_log_day;
        return this;
    }

    private int training_log_day;

}
