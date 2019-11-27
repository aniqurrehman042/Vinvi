package com.example.vinvi.models;

public class VisitingCard {

    private String name;
    private String designation;
    private String address;
    private String workEmail;
    private String personalEmail;
    private String homeNumber;
    private String officeNumber;
    private String mobileNumber;
    private int photoId;

    public VisitingCard(String name, String designation, String address, String workEmail, String personalEmail, String homeNumber, String officeNumber, String mobileNumber, int photoId) {
        this.name = name;
        this.designation = designation;
        this.address = address;
        this.workEmail = workEmail;
        this.personalEmail = personalEmail;
        this.homeNumber = homeNumber;
        this.officeNumber = officeNumber;
        this.mobileNumber = mobileNumber;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }
}
