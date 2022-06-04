package com.example.my_first_project.Search_Pin;

public class Model {

    String center_id;
    String name;
    String address;
    String state_name;
    String district_name;
    String pincode;
    String available_capacity;
    String fee_type;
    String vaccine;
    String date;
    //set and get methods along with variables which has to be shown in recycler view
    public Model(String center_id, String name, String address, String state_name, String district_name, String pincode, String available_capacity, String fee_type, String vaccine, String date) {
        this.center_id = center_id;
        this.name = name;
        this.address = address;
        this.state_name = state_name;
        this.district_name = district_name;
        this.pincode = pincode;
        this.available_capacity = available_capacity;
        this.fee_type = fee_type;
        this.vaccine = vaccine;
        this.date = date;
    }

    public String getCenter_id() {
        return center_id;
    }

    public void setCenter_id(String center_id) {
        this.center_id = center_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getAvailable_capacity() {
        return available_capacity;
    }

    public void setAvailable_capacity(String available_capacity) {
        this.available_capacity = available_capacity;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

