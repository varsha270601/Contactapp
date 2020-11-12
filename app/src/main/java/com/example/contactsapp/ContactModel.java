package com.example.contactsapp;

public class ContactModel {
    String Name, Email, Phonenumber;

    public ContactModel(String Name, String Email, String Phonenumber) {
        this.Name = Name;
        this.Email = Email;
        this.Phonenumber = Phonenumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(String Phonenumber) {
        this.Phonenumber = Phonenumber;
    }

    public Object getphonenumber() {
    }
}


