package com.praveen.shethe.AdministratorSupport.model.customer;

import com.praveen.shethe.AdministratorSupport.model.AbstractEntity;

/**
 * Created by Praveenkumar on 8/20/2020.
 */
public class Customer extends AbstractEntity {

    private String name;

    private String middleName;

    private String lastName;

    private String mobileNo;

    private String address;

    private String landmark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }
}
