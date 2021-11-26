package main_package.api.models;

public class TrainingExerciseSet {
    private int id;
    private String weight;
    private String reps;
    private String tempo;
    private String rest;
    private float rpe;
    private String prev_reps;
    private String prev_weight;
    private float prev_rpe;
    private boolean is_warmup;
    private boolean is_dropset;

    public int getId() {
        return id;
    }

    public TrainingExerciseSet setId(int id) {
        this.id = id;
        return this;
    }

    public String getWeight() {
        return weight;
    }

    public TrainingExerciseSet setWeight(String weight) {
        this.weight = weight;
        return this;
    }

    public String getReps() {
        return reps;
    }

    public TrainingExerciseSet setReps(String reps) {
        this.reps = reps;
        return this;
    }

    public String getTempo() {
        return tempo;
    }

    public TrainingExerciseSet setTempo(String tempo) {
        this.tempo = tempo;
        return this;
    }

    public String getRest() {
        return rest;
    }

    public TrainingExerciseSet setRest(String rest) {
        this.rest = rest;
        return this;
    }

    public float getRpe() {
        return rpe;
    }

    public TrainingExerciseSet setRpe(float rpe) {
        this.rpe = rpe;
        return this;
    }

    public String getPrev_reps() {
        return prev_reps;
    }

    public TrainingExerciseSet setPrev_reps(String prev_reps) {
        this.prev_reps = prev_reps;
        return this;
    }

    public String getPrev_weight() {
        return prev_weight;
    }

    public TrainingExerciseSet setPrev_weight(String prev_weight) {
        this.prev_weight = prev_weight;
        return this;
    }

    public float getPrev_rpe() {
        return prev_rpe;
    }

    public TrainingExerciseSet setPrev_rpe(float prev_rpe) {
        this.prev_rpe = prev_rpe;
        return this;
    }

    public boolean isIs_warmup() {
        return is_warmup;
    }

    public TrainingExerciseSet setIs_warmup(boolean is_warmup) {
        this.is_warmup = is_warmup;
        return this;
    }

    public boolean isIs_dropset() {
        return is_dropset;
    }

    public TrainingExerciseSet setIs_dropset(boolean is_dropset) {
        this.is_dropset = is_dropset;
        return this;
    }

    public int getT_p_exercise() {
        return t_p_exercise;
    }

    @Override
    public String toString() {
        return "TrainingExerciseSet{" +
                "id=" + id +
                ", weight='" + weight + '\'' +
                ", reps='" + reps + '\'' +
                ", tempo='" + tempo + '\'' +
                ", rest='" + rest + '\'' +
                ", rpe=" + rpe +
                ", prev_reps='" + prev_reps + '\'' +
                ", prev_weight='" + prev_weight + '\'' +
                ", prev_rpe=" + prev_rpe +
                ", is_warmup=" + is_warmup +
                ", is_dropset=" + is_dropset +
                ", t_p_exercise=" + t_p_exercise +
                '}';
    }

    public TrainingExerciseSet setT_p_exercise(int t_p_exercise) {
        this.t_p_exercise = t_p_exercise;
        return this;
    }

    private int t_p_exercise;
}
