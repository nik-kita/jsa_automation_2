package main_package.api.models;

public class ModuleSearch {
    private int id;
    private String name;
    private String equipment;
    private String tags;
    private String experience_level;

    public int getId() {
        return id;
    }

    public ModuleSearch setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ModuleSearch setName(String name) {
        this.name = name;
        return this;
    }

    public String getEquipment() {
        return equipment;
    }

    public ModuleSearch setEquipment(String equipment) {
        this.equipment = equipment;
        return this;
    }

    public String getTags() {
        return tags;
    }

    public ModuleSearch setTags(String tags) {
        this.tags = tags;
        return this;
    }

    public String getExperience_level() {
        return experience_level;
    }

    @Override
    public String toString() {
        return "ModuleSearch{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", equipment='" + equipment + '\'' +
                ", tags='" + tags + '\'' +
                ", experience_level='" + experience_level + '\'' +
                '}';
    }

    public ModuleSearch setExperience_level(String experience_level) {
        this.experience_level = experience_level;
        return this;
    }
}
