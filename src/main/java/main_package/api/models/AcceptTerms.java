package main_package.api.models;

public class AcceptTerms {
    private int user_id;
    private String name;
    private boolean terms;
    private boolean daily_subscribe;
    private boolean marketing_subscribe;
    private String grant_type;
    private String client_id;
    private String client_secret;
    private String token;
    private String backend;

    public int getUser_id() {
        return user_id;
    }

    public AcceptTerms setUser_id(int user_id) {
        this.user_id = user_id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AcceptTerms setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isTerms() {
        return terms;
    }

    public AcceptTerms setTerms(boolean terms) {
        this.terms = terms;
        return this;
    }

    public boolean isDaily_subscribe() {
        return daily_subscribe;
    }

    public AcceptTerms setDaily_subscribe(boolean daily_subscribe) {
        this.daily_subscribe = daily_subscribe;
        return this;
    }

    public boolean isMarketing_subscribe() {
        return marketing_subscribe;
    }

    public AcceptTerms setMarketing_subscribe(boolean marketing_subscribe) {
        this.marketing_subscribe = marketing_subscribe;
        return this;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public AcceptTerms setGrant_type(String grant_type) {
        this.grant_type = grant_type;
        return this;
    }

    public String getClient_id() {
        return client_id;
    }

    public AcceptTerms setClient_id(String client_id) {
        this.client_id = client_id;
        return this;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public AcceptTerms setClient_secret(String client_secret) {
        this.client_secret = client_secret;
        return this;
    }

    public String getToken() {
        return token;
    }

    public AcceptTerms setToken(String token) {
        this.token = token;
        return this;
    }

    public String getBackend() {
        return backend;
    }

    @Override
    public String toString() {
        return "AcceptTerms{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", terms=" + terms +
                ", daily_subscribe=" + daily_subscribe +
                ", marketing_subscribe=" + marketing_subscribe +
                ", grant_type='" + grant_type + '\'' +
                ", client_id='" + client_id + '\'' +
                ", client_secret='" + client_secret + '\'' +
                ", token='" + token + '\'' +
                ", backend='" + backend + '\'' +
                '}';
    }

    public AcceptTerms setBackend(String backend) {
        this.backend = backend;
        return this;
    }
}
