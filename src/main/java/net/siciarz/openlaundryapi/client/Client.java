package net.siciarz.openlaundryapi.client;

import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The API wrapper class.
 * 
 */
public class Client {
    Logger logger;
    private static final String URL_PREFIX = "http://openlaundryapi.org/api/";

    public Client() {
        logger = LoggerFactory.getLogger(Client.class);
    }

    public Device getDevice(String deviceId) {
        try {
            final URL apiUrl = new URL(URL_PREFIX + "device/" + deviceId + "/");
            logger.debug("Sending GET request to " + apiUrl);
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(apiUrl, Device.class);
        } catch (Exception e) {
            logger.error("Client error", e);
            return null;
        }
    }
}
