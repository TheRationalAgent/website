package com.rationalagent.website;


import javax.validation.constraints.NotEmpty;


public class Email {

    @NotEmpty
    @javax.validation.constraints.Email
    private String senderAddress;
    @NotEmpty
    private String message;

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Email{" +
                "senderAddress='" + senderAddress + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
