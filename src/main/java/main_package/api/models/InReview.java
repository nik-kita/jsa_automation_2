package main_package.api.models;

public class InReview {
    private int id;
    private boolean in_review;

    public int getId() {
        return id;
    }

    public InReview setId(int id) {
        this.id = id;
        return this;
    }

    public boolean isIn_review() {
        return in_review;
    }

    public InReview setIn_review(boolean in_review) {
        this.in_review = in_review;
        return this;
    }

    @Override
    public String toString() {
        return "InReview{" +
                "id=" + id +
                ", in_review=" + in_review +
                '}';
    }
}
