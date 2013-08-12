package net.siciarz.openlaundryapi.client;

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
        Client apiClient = new Client();
        Device device = apiClient.getDevice(deviceId);
        if (device != null) {
            System.out.println(device.getName());
            System.out.println(device.getStatus());
        }
    }
}
