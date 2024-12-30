package com.bns.api.tradeprocessor.dto;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
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

    private static final Logger log = LogManager.getLogger(Message.class);

    //17=EXEC127|48=AAPL|22=RIC|1=ACC123|32=100|6=150.25|8=BUY

 private void parseFixMessage(String fixMessage) {
        String[] fields = fixMessage.split("\\|");
        for (String field : fields) {
            String[] parts = field.split("=");
            if (parts.length == 2) {
                try {
                    int tag = Integer.parseInt(parts[0]);
                    String value = parts[1];
                    tagValueMap.put(tag, value);
                } catch (NumberFormatException e) {
                    System.err.println("Error parsing tag: " + parts[0] + ", Value: " + parts[1]);
                    ///Adding log4j (for example)
                    log.info("Error parsing tag: " + parts[0] + ", Value: " + parts[1]);
                }
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
