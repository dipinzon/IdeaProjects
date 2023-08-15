package com.bns.api.tradeprocessor.model;

/**
 * FIX message object.
 * 17 - execId
 * 48 - securityId
 * 22 - securityIdSource
 * 1 - account
 * 32 - lastShares (positive int)
 * 6 - avgPx (positive double)
 * 8 - side (BUY, SELL)
 */

public class Message {

    public Message() {
        // Default constructor
    }

    public String getString(int tag) {
        return String.valueOf(tag);
    }

    public Double getDouble(int tag) {
        return (double) tag;
    }

    public Integer getInt(int tag) {
        return tag;
    }
}
