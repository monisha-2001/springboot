package com.example.restdemo.demo;

public class Vendor {
    private int vendorId;
    private String vendorName;
    private String vendorAddress;
    private int vendorPhoneNumber;

    public Vendor(){

    }

    public Vendor(int vendorId, String vendorName, String vendorAddress, int vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public int getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(int vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
}
