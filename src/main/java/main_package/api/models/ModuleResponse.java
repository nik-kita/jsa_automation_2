package main_package.api.models;

public class ModuleResponse {
    private boolean favourite;
    private boolean module_enrolled;
    private Module module;

    @Override
    public String toString() {
        return "ModuleResponse{" +
                "favourite=" + favourite +
                ", module_enrolled=" + module_enrolled +
                ", module=" + module +
                '}';
    }

    public boolean isFavourite() {
        return favourite;
    }

    public ModuleResponse setFavourite(boolean favourite) {
        this.favourite = favourite;
        return this;
    }

    public boolean isModule_enrolled() {
        return module_enrolled;
    }

    public ModuleResponse setModule_enrolled(boolean module_enrolled) {
        this.module_enrolled = module_enrolled;
        return this;
    }

    public Module getModule() {
        return module;
    }

    public ModuleResponse setModule(Module module) {
        this.module = module;
        return this;
    }
}
