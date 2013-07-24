package net.siciarz.openlaundryapi.client;


/**
 * Entry point to the application.
 * 
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Open Laundry API Java client");
        Device device = new Device("666", "My device");
        System.out.println(device.getName());
    }
}
