package main_package.api.models;

public class SubFilter {
    private int id;
    private String name;
    private String date;
    private int order;
    private boolean required_to_complete;
    private int main;

    @Override
    public String toString() {
        return "SubFilter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", order=" + order +
                ", required_to_complete=" + required_to_complete +
                ", main=" + main +
                '}';
    }

    public int getId() {
        return id;
    }

    public SubFilter setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SubFilter setName(String name) {
        this.name = name;
        return this;
    }

    public String getDate() {
        return date;
    }

    public SubFilter setDate(String date) {
        this.date = date;
        return this;
    }

    public int getOrder() {
        return order;
    }

    public SubFilter setOrder(int order) {
        this.order = order;
        return this;
    }

    public boolean isRequired_to_complete() {
        return required_to_complete;
    }

    public SubFilter setRequired_to_complete(boolean required_to_complete) {
        this.required_to_complete = required_to_complete;
        return this;
    }

    public int getMain() {
        return main;
    }

    public SubFilter setMain(int main) {
        this.main = main;
        return this;
    }
}
