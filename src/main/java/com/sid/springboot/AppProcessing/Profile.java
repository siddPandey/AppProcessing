package com.sid.springboot.AppProcessing;


public class Profile {
    private String name;
    private String address;

    public Profile(){}

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
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
}
