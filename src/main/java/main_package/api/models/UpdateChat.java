package main_package.api.models;

public class UpdateChat {
    private boolean client_update;
    private boolean other_update;

    @Override
    public String toString() {
        return "UpdateChat{" +
                "client_update=" + client_update +
                ", other_update=" + other_update +
                ", coach_update=" + coach_update +
                '}';
    }

    public boolean isClient_update() {
        return client_update;
    }

    public UpdateChat setClient_update(boolean client_update) {
        this.client_update = client_update;
        return this;
    }

    public boolean isOther_update() {
        return other_update;
    }

    public UpdateChat setOther_update(boolean other_update) {
        this.other_update = other_update;
        return this;
    }

    public boolean isCoach_update() {
        return coach_update;
    }

    public UpdateChat setCoach_update(boolean coach_update) {
        this.coach_update = coach_update;
        return this;
    }

    private boolean coach_update;
}
