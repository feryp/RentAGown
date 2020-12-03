package com.example.rentagown.Model;

public class ChangeAddress {
    String labelAddress;
    String name;
    String noHandphone;
    String detailAddress;

    public ChangeAddress(String labelAddress, String name, String noHandphone, String detailAddress) {
        this.labelAddress = labelAddress;
        this.name = name;
        this.noHandphone = noHandphone;
        this.detailAddress = detailAddress;
    }

    public String getLabelAddress() {
        return labelAddress;
    }

    public void setLabelAddress(String labelAddress) {
        this.labelAddress = labelAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoHandphone() {
        return noHandphone;
    }

    public void setNoHandphone(String noHandphone) {
        this.noHandphone = noHandphone;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }
}
