package main_package.api.models;

public class Equipment {
    private int id;
    private Category category;
    private String image;
    private String title;
    private String description;
    private Object options;//TODO what is this?
    private float price;
    private Object links;//TODO what is these?

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", category=" + category +
                ", image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", options=" + options +
                ", price=" + price +
                ", links=" + links +
                '}';
    }

    public int getId() {
        return id;
    }

    public Equipment setId(int id) {
        this.id = id;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public Equipment setCategory(Category category) {
        this.category = category;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Equipment setImage(String image) {
        this.image = image;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Equipment setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Equipment setDescription(String description) {
        this.description = description;
        return this;
    }

    public Object getOptions() {
        return options;
    }

    public Equipment setOptions(Object options) {
        this.options = options;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public Equipment setPrice(float price) {
        this.price = price;
        return this;
    }

    public Object getLinks() {
        return links;
    }

    public Equipment setLinks(Object links) {
        this.links = links;
        return this;
    }
}
