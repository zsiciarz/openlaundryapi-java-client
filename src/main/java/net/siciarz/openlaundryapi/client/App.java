package net.siciarz.openlaundryapi.client;

import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Entry point to the application.
 * 
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Open Laundry API Java client");
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
