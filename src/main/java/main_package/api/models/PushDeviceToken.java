package main_package.api.models;

public class PushDeviceToken {
    private String token;

    public String getToken() {
        return token;
    }

    public PushDeviceToken setToken(String token) {
        this.token = token;
        return this;
    }

    @Override
    public String toString() {
        return "PushDeviceToken{" +
                "token='" + token + '\'' +
                '}';
    }
}
