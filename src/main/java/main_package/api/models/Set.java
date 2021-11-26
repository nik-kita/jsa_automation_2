package main_package.api.models;

public class Set {
    private int id;
    private String reps;
    private String rest;
    private String weight;
    private float rpe;
    private String prev_reps;
    private String prev_weight;
    private float prev_rpe;
    private boolean is_warmup;
    private boolean is_dropset;
    private int exercise;

    public int getId() {
        return id;
    }

    public Set setId(int id) {
        this.id = id;
        return this;
    }

    public String getReps() {
        return reps;
    }

    public Set setReps(String reps) {
        this.reps = reps;
        return this;
    }

    public String getRest() {
        return rest;
    }

    public Set setRest(String rest) {
        this.rest = rest;
        return this;
    }

    public String getWeight() {
        return weight;
    }

    public Set setWeight(String weight) {
        this.weight = weight;
        return this;
    }

    public float getRpe() {
        return rpe;
    }

    public Set setRpe(float rpe) {
        this.rpe = rpe;
        return this;
    }

    public String getPrev_reps() {
        return prev_reps;
    }

    public Set setPrev_reps(String prev_reps) {
        this.prev_reps = prev_reps;
        return this;
    }

    public String getPrev_weight() {
        return prev_weight;
    }

    public Set setPrev_weight(String prev_weight) {
        this.prev_weight = prev_weight;
        return this;
    }

    public float getPrev_rpe() {
        return prev_rpe;
    }

    public Set setPrev_rpe(float prev_rpe) {
        this.prev_rpe = prev_rpe;
        return this;
    }

    public boolean isIs_warmup() {
        return is_warmup;
    }

    public Set setIs_warmup(boolean is_warmup) {
        this.is_warmup = is_warmup;
        return this;
    }

    public boolean isIs_dropset() {
        return is_dropset;
    }

    public Set setIs_dropset(boolean is_dropset) {
        this.is_dropset = is_dropset;
        return this;
    }

    public int getExercise() {
        return exercise;
    }

    @Override
    public String toString() {
        return "Set{" +
                "id=" + id +
                ", reps='" + reps + '\'' +
                ", rest='" + rest + '\'' +
                ", weight='" + weight + '\'' +
                ", rpe=" + rpe +
                ", prev_reps='" + prev_reps + '\'' +
                ", prev_weight='" + prev_weight + '\'' +
                ", prev_rpe=" + prev_rpe +
                ", is_warmup=" + is_warmup +
                ", is_dropset=" + is_dropset +
                ", exercise=" + exercise +
                '}';
    }

    public Set setExercise(int exercise) {
        this.exercise = exercise;
        return this;
    }
}
