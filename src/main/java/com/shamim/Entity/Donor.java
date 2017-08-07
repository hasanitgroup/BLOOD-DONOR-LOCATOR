package com.shamim.Entity;

public class Donor {

    private int donorId;
    private String name ;
    private String address ;
    private String location ;
    private String phone ;
    private String bloodGroup ;
    private boolean active ;

    public Donor(int donorId, String name, String address, String bloodGroup, String location , String phone ,boolean active) {
        this.donorId = donorId;
        this.name = name;
        this.address = address;
        this.bloodGroup = bloodGroup;
        this.location = location;
        this.phone = phone;
        this.bloodGroup = bloodGroup;
        this.active = active;
    }

    public Donor(){}


    public int getDonorId() {
        return donorId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public boolean isActive() {
        return active;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
