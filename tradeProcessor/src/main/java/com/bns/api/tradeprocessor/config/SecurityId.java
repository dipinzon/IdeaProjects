package com.bns.api.tradeprocessor.config;

public class SecurityId {
    String ric;
    String isin;
    String cusip;
    String sedol;
    String ticker;
    String name;

    // Constructors, getters, and setters

    public SecurityId() {
        // Default constructor
    }

    public SecurityId(String securityId) {
        this.name = securityId;
    }

    // Other constructors and methods

    public String getRic() {
        return ric;
    }

    public void setRic(String ric) {
        this.ric = ric;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public String getSedol() {
        return sedol;
    }

    public void setSedol(String sedol) {
        this.sedol = sedol;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}