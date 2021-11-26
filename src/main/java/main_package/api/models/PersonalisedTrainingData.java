package main_package.api.models;

public class PersonalisedTrainingData {
    private int id;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "PersonalisedTrainingData{" +
                "id=" + id +
                '}';
    }

    public PersonalisedTrainingData setId(int id) {
        this.id = id;
        return this;
    }
}
