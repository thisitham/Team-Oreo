package com.dhruva.shopping;

public class Feed
{
    private String name;
    private String Inquiry;
    private String Contact;
    private String Inquire;

    public Feed(){}

    public Feed(String name, String inquiry, String contact, String inquire)
    {
        this.name = name;
        this.Inquiry = inquiry;
        this.Contact = contact;
        this.Inquire = inquire;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInquiry() {
        return Inquiry;
    }

    public void setInquiry(String inquiry) {
        Inquiry = inquiry;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getInquire() {
        return Inquire;
    }

    public void setInquire(String inquire) {
        Inquire = inquire;
    }
}
