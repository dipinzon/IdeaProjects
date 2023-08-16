package com.bns.api.tradeprocessor.dto;

public class TradeMessage {
    public enum IdSource { ISIN, CUSIP, SEDOL, RIC }
    String tradeId;
    String account;
    String securityId;
    IdSource idSource;
    String isin;
    String sedol;
    String cusip;
    String ric;
    String ticker;
    Integer qty;
    Double price;

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setSecurityId(String securityId) {
        this.securityId = securityId;
    }

    public void setIdSource(IdSource idSource) {
        this.idSource = idSource;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public void setSedol(String sedol) {
        this.sedol = sedol;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public void setRic(String ric) {
        this.ric = ric;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTradeId() {
        return tradeId;
    }

    public String getAccount() {
        return account;
    }

    public String getSecurityId() {
        return securityId;
    }

    public IdSource getIdSource() {
        return idSource;
    }

    public String getIsin() {
        return isin;
    }

    public String getSedol() {
        return sedol;
    }

    public String getCusip() {
        return cusip;
    }

    public String getRic() {
        return ric;
    }

    public String getTicker() {
        return ticker;
    }

    public Integer getQty() {
        return qty;
    }

    public Double getPrice() {
        return price;
    }
}

