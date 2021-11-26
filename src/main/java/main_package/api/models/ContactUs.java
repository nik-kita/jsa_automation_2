package main_package.api.models;

public class ContactUs {
    private String name;
    private String email;
    private String message;
    private String status;

    @Override
    public String toString() {
        return "ContactUs{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public ContactUs setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ContactUs setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ContactUs setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ContactUs setStatus(String status) {
        this.status = status;
        return this;
    }
}
