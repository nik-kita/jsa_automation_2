package main_package.api.models;

public class ResentModulesResponse {
    private Module module;
    private boolean completed;

    @Override
    public String toString() {
        return "ResentModulesResponse{" +
                "module=" + module +
                ", completed=" + completed +
                '}';
    }

    public Module getModule() {
        return module;
    }

    public ResentModulesResponse setModule(Module module) {
        this.module = module;
        return this;
    }

    public boolean isCompleted() {
        return completed;
    }

    public ResentModulesResponse setCompleted(boolean completed) {
        this.completed = completed;
        return this;
    }
}
