package main_package.api.models;

public class PinnedChart {
    private int id;
    private boolean waist;
    private boolean hip;
    private boolean arm;
    private boolean km;
    private boolean bench;
    private boolean deadlift;
    private boolean squat;
    private boolean thigh;
    private boolean chest;
    private boolean calf;

    @Override
    public String toString() {
        return "PinnedChart{" +
                "id=" + id +
                ", waist=" + waist +
                ", hip=" + hip +
                ", arm=" + arm +
                ", km=" + km +
                ", bench=" + bench +
                ", deadlift=" + deadlift +
                ", squat=" + squat +
                ", thigh=" + thigh +
                ", chest=" + chest +
                ", calf=" + calf +
                ", user=" + user +
                ", custom_chart=" + custom_chart +
                '}';
    }

    public int getId() {
        return id;
    }

    public PinnedChart setId(int id) {
        this.id = id;
        return this;
    }

    public boolean isWaist() {
        return waist;
    }

    public PinnedChart setWaist(boolean waist) {
        this.waist = waist;
        return this;
    }

    public boolean isHip() {
        return hip;
    }

    public PinnedChart setHip(boolean hip) {
        this.hip = hip;
        return this;
    }

    public boolean isArm() {
        return arm;
    }

    public PinnedChart setArm(boolean arm) {
        this.arm = arm;
        return this;
    }

    public boolean isKm() {
        return km;
    }

    public PinnedChart setKm(boolean km) {
        this.km = km;
        return this;
    }

    public boolean isBench() {
        return bench;
    }

    public PinnedChart setBench(boolean bench) {
        this.bench = bench;
        return this;
    }

    public boolean isDeadlift() {
        return deadlift;
    }

    public PinnedChart setDeadlift(boolean deadlift) {
        this.deadlift = deadlift;
        return this;
    }

    public boolean isSquat() {
        return squat;
    }

    public PinnedChart setSquat(boolean squat) {
        this.squat = squat;
        return this;
    }

    public boolean isThigh() {
        return thigh;
    }

    public PinnedChart setThigh(boolean thigh) {
        this.thigh = thigh;
        return this;
    }

    public boolean isChest() {
        return chest;
    }

    public PinnedChart setChest(boolean chest) {
        this.chest = chest;
        return this;
    }

    public boolean isCalf() {
        return calf;
    }

    public PinnedChart setCalf(boolean calf) {
        this.calf = calf;
        return this;
    }

    public int getUser() {
        return user;
    }

    public PinnedChart setUser(int user) {
        this.user = user;
        return this;
    }

    public int getCustom_chart() {
        return custom_chart;
    }

    public PinnedChart setCustom_chart(int custom_chart) {
        this.custom_chart = custom_chart;
        return this;
    }

    private int user;
    private int custom_chart;
}
