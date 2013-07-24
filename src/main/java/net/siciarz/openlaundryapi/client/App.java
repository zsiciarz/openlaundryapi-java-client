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
        URL apiUrl;
        try {
            apiUrl = new URL("http://openlaundryapi.org/api/device/666/");
            ObjectMapper mapper = new ObjectMapper();
            Device device = mapper.readValue(apiUrl, Device.class);
            System.out.println(device.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
