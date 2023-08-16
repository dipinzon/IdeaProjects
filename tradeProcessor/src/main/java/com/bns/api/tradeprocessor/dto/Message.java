package com.bns.api.tradeprocessor.dto;

import java.util.HashMap;
import java.util.Map;

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

    private Map<Integer, String> tagValueMap = new HashMap<>();

    public Message(String fixMessage) {
        parseFixMessage(fixMessage);
    }

    private void parseFixMessage(String fixMessage) {
        String[] fields = fixMessage.split("\\|");
        for (String field : fields) {
            String[] parts = field.split("=");
            if (parts.length == 2) {
                int tag = Integer.parseInt(parts[0]);
                String value = parts[1];
                tagValueMap.put(tag, value);
            }
        }
    }

    public String getString(int tag) {
        return tagValueMap.get(tag);
    }

    public Double getDouble(int tag) {
        String value = tagValueMap.get(tag);
        return (value != null) ? Double.parseDouble(value) : null;
    }

    public Integer getInt(int tag) {
        String value = tagValueMap.get(tag);
        return (value != null) ? Integer.parseInt(value) : null;
    }

    public boolean isValid() {
        return tagValueMap.containsKey(17) && tagValueMap.containsKey(48);
    }
}
