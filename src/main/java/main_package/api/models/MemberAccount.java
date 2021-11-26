package main_package.api.models;

public class MemberAccount {
    private int id;
    private User user;
    private String membership_name;
    private String customer_id;
    private String sub_id;
    private String card_id;
    private String status;
    private String trial_end;
    private boolean at_period_end;
    private int period_end;
    private String membership_end_date;
    private String date;
    private String iap_expires_at;

    public int getId() {
        return id;
    }

    public MemberAccount setId(int id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public MemberAccount setUser(User user) {
        this.user = user;
        return this;
    }

    public String getMembership_name() {
        return membership_name;
    }

    public MemberAccount setMembership_name(String membership_name) {
        this.membership_name = membership_name;
        return this;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public MemberAccount setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
        return this;
    }

    public String getSub_id() {
        return sub_id;
    }

    public MemberAccount setSub_id(String sub_id) {
        this.sub_id = sub_id;
        return this;
    }

    public String getCard_id() {
        return card_id;
    }

    public MemberAccount setCard_id(String card_id) {
        this.card_id = card_id;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public MemberAccount setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getTrial_end() {
        return trial_end;
    }

    public MemberAccount setTrial_end(String trial_end) {
        this.trial_end = trial_end;
        return this;
    }

    public boolean isAt_period_end() {
        return at_period_end;
    }

    public MemberAccount setAt_period_end(boolean at_period_end) {
        this.at_period_end = at_period_end;
        return this;
    }

    public int getPeriod_end() {
        return period_end;
    }

    public MemberAccount setPeriod_end(int period_end) {
        this.period_end = period_end;
        return this;
    }

    public String getMembership_end_date() {
        return membership_end_date;
    }

    public MemberAccount setMembership_end_date(String membership_end_date) {
        this.membership_end_date = membership_end_date;
        return this;
    }

    public String getDate() {
        return date;
    }

    public MemberAccount setDate(String date) {
        this.date = date;
        return this;
    }

    public String getIap_expires_at() {
        return iap_expires_at;
    }

    @Override
    public String toString() {
        return "MemberAccount{" +
                "id=" + id +
                ", user=" + user +
                ", membership_name='" + membership_name + '\'' +
                ", customer_id='" + customer_id + '\'' +
                ", sub_id='" + sub_id + '\'' +
                ", card_id='" + card_id + '\'' +
                ", status='" + status + '\'' +
                ", trial_end='" + trial_end + '\'' +
                ", at_period_end=" + at_period_end +
                ", period_end=" + period_end +
                ", membership_end_date='" + membership_end_date + '\'' +
                ", date='" + date + '\'' +
                ", iap_expires_at='" + iap_expires_at + '\'' +
                '}';
    }

    public MemberAccount setIap_expires_at(String iap_expires_at) {
        this.iap_expires_at = iap_expires_at;
        return this;
    }
}
