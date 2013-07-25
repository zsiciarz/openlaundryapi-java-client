package net.siciarz.openlaundryapi.client;

import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Entry point to the application.
 * 
 */
public class App {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.info("Open Laundry API Java client");
        String deviceId = "666";
        if (args.length > 0) {
            deviceId = args[0];
        }
        try {
            URL apiUrl = new URL("http://openlaundryapi.org/api/device/"
                            + deviceId + "/");
            ObjectMapper mapper = new ObjectMapper();
            Device device = mapper.readValue(apiUrl, Device.class);
            System.out.println(device.getName());
            System.out.println(device.getStatus());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
