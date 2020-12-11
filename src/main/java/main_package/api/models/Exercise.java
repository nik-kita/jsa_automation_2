package main_package.api.models;

public class Exercise {
    private int id;
    private Module video;
    private int video_id;
    private SupersetGroup superset_group;
    private String alternative_name;
    private int order;
    private boolean is_warmup;
    private boolean auto_rest_timer;
    private String notes;
    private String type;
    private int training_log_day;

    public int getId() {
        return id;
    }

    public Exercise setId(int id) {
        this.id = id;
        return this;
    }

    public Module getVideo() {
        return video;
    }

    public Exercise setVideo(Module video) {
        this.video = video;
        return this;
    }

    public int getVideo_id() {
        return video_id;
    }

    public Exercise setVideo_id(int video_id) {
        this.video_id = video_id;
        return this;
    }

    public SupersetGroup getSuperset_group() {
        return superset_group;
    }

    public Exercise setSuperset_group(SupersetGroup superset_group) {
        this.superset_group = superset_group;
        return this;
    }

    public String getAlternative_name() {
        return alternative_name;
    }

    public Exercise setAlternative_name(String alternative_name) {
        this.alternative_name = alternative_name;
        return this;
    }

    public int getOrder() {
        return order;
    }

    public Exercise setOrder(int order) {
        this.order = order;
        return this;
    }

    public boolean isIs_warmup() {
        return is_warmup;
    }

    public Exercise setIs_warmup(boolean is_warmup) {
        this.is_warmup = is_warmup;
        return this;
    }

    public boolean isAuto_rest_timer() {
        return auto_rest_timer;
    }

    public Exercise setAuto_rest_timer(boolean auto_rest_timer) {
        this.auto_rest_timer = auto_rest_timer;
        return this;
    }

    public String getNotes() {
        return notes;
    }

    public Exercise setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public String getType() {
        return type;
    }

    public Exercise setType(String type) {
        this.type = type;
        return this;
    }

    public int getTraining_log_day() {
        return training_log_day;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", video=" + video +
                ", video_id=" + video_id +
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

    public Exercise setTraining_log_day(int training_log_day) {
        this.training_log_day = training_log_day;
        return this;
    }
}
