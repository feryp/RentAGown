package com.example.rentagown.Model;

public class Bank {
    private int idBank;
    private int logoBank;
    private String nameBank;
    private String accountNameBank;
    private String accountNumberBank;

    public Bank(int idBank, int logoBank, String nameBank, String accountNameBank, String accountNumberBank) {
        this.idBank = idBank;
        this.logoBank = logoBank;
        this.nameBank = nameBank;
        this.accountNameBank = accountNameBank;
        this.accountNumberBank = accountNumberBank;
    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public int getLogoBank() {
        return logoBank;
    }

    public void setLogoBank(int logoBank) {
        this.logoBank = logoBank;
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public String getAccountNameBank() {
        return accountNameBank;
    }

    public void setAccountNameBank(String accountNameBank) {
        this.accountNameBank = accountNameBank;
    }

    public String getAccountNumberBank() {
        return accountNumberBank;
    }

    public void setAccountNumberBank(String accountNumberBank) {
        this.accountNumberBank = accountNumberBank;
    }
}
