package net.siciarz.openlaundryapi.client;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DeviceTest {

    @Test
    public void testGetDeviceId() {
        Device device = new Device();
        assertEquals(device.getDeviceId(), "<empty>");
    }

    @Test
    public void testGetName() {
        Device device = new Device();
        assertEquals(device.getName(), "<empty>");
    }

}
