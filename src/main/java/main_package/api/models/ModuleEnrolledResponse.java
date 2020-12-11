package main_package.api.models;

public class ModuleEnrolledResponse {
    private boolean completed;

    @Override
    public String toString() {
        return "ModuleEnrolledResponse{" +
                "completed=" + completed +
                '}';
    }

    public boolean isCompleted() {
        return completed;
    }

    public ModuleEnrolledResponse setCompleted(boolean completed) {
        this.completed = completed;
        return this;
    }
}
