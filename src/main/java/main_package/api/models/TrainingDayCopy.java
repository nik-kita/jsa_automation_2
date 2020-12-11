package main_package.api.models;

public class TrainingDayCopy {
    private boolean client_clone;
    private boolean use_previous_set;
    private int training_id;
    private int dat_id;
    private int order;

    public boolean isClient_clone() {
        return client_clone;
    }

    public TrainingDayCopy setClient_clone(boolean client_clone) {
        this.client_clone = client_clone;
        return this;
    }

    public boolean isUse_previous_set() {
        return use_previous_set;
    }

    public TrainingDayCopy setUse_previous_set(boolean use_previous_set) {
        this.use_previous_set = use_previous_set;
        return this;
    }

    public int getTraining_id() {
        return training_id;
    }

    public TrainingDayCopy setTraining_id(int training_id) {
        this.training_id = training_id;
        return this;
    }

    public int getDat_id() {
        return dat_id;
    }

    public TrainingDayCopy setDat_id(int dat_id) {
        this.dat_id = dat_id;
        return this;
    }

    public int getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "TrainingDayCopy{" +
                "client_clone=" + client_clone +
                ", use_previous_set=" + use_previous_set +
                ", training_id=" + training_id +
                ", dat_id=" + dat_id +
                ", order=" + order +
                '}';
    }

    public TrainingDayCopy setOrder(int order) {
        this.order = order;
        return this;
    }
}
