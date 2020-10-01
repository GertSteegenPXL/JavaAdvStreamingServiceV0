package be.pxl.ja.streamingservice.model;


import java.awt.*;
import java.util.ArrayList;

public class Account {
    private String email;
    private String password;
    private PaymentInfo paymentInfo;
    private StreamingPlan streamingPlan;
    private ArrayList<Profile> profiles;

    public Account(String email, String password) {
        profiles = new ArrayList<Profile>();
        profiles.add(new Profile("profile1"));
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public void setStreamingPlan(StreamingPlan streamingPlan) {
        this.streamingPlan = streamingPlan;
    }

    public Boolean verifyPassword(String password){
        return password.equals(this.password);
    }

    public void addProfile(Profile profile){

    }

    public Profile getFirstProfile() {
        return profiles.get(1);
    }
}
