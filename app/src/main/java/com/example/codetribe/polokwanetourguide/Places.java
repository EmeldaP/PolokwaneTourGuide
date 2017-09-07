package com.example.codetribe.polokwanetourguide;

import android.content.Intent;

import java.io.Serializable;

/**
 * Created by codetribe on 2017/08/10.
 */

public class Places implements Serializable {


        private String name,address,phone_number;

        private int telephone ,icon;

    public Places() {

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

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}


