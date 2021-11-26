package main_package.api.models;

public class CombinationCreateResponse {
    private int id;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "CombinationCreateResponse{" +
                "id=" + id +
                '}';
    }

    public CombinationCreateResponse setId(int id) {
        this.id = id;
        return this;
    }
}
