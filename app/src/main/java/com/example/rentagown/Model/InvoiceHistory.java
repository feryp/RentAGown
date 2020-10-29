package com.example.rentagown.Model;

public class InvoiceHistory {
    String idInvoice;
    String statusInvoice;
    String timeInvoice;
    String dateInvoice;
    String priceInvoice;

    public InvoiceHistory(String idInvoice, String statusInvoice, String timeInvoice, String dateInvoice, String priceInvoice) {
        this.idInvoice = idInvoice;
        this.statusInvoice = statusInvoice;
        this.timeInvoice = timeInvoice;
        this.dateInvoice = dateInvoice;
        this.priceInvoice = priceInvoice;
    }

    public String getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(String idInvoice) {
        this.idInvoice = idInvoice;
    }

    public String getStatusInvoice() {
        return statusInvoice;
    }

    public void setStatusInvoice(String statusInvoice) {
        this.statusInvoice = statusInvoice;
    }

    public String getTimeInvoice() {
        return timeInvoice;
    }

    public void setTimeInvoice(String timeInvoice) {
        this.timeInvoice = timeInvoice;
    }

    public String getDateInvoice() {
        return dateInvoice;
    }

    public void setDateInvoice(String dateInvoice) {
        this.dateInvoice = dateInvoice;
    }

    public String getPriceInvoice() {
        return priceInvoice;
    }

    public void setPriceInvoice(String priceInvoice) {
        this.priceInvoice = priceInvoice;
    }


}
