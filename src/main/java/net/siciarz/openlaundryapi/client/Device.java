package net.siciarz.openlaundryapi.client;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * A representation of a washing machine.
 * 
 */
public class Device {
    @JsonProperty("device_id")
    private String deviceId;
    private String name;
    private DeviceStatus status;
    private String program;
    @JsonProperty("time_started")
    private String timeStarted;
    @JsonProperty("time_remaining")
    private String timeRemaining;
    private int progress;

    public Device() {
        this("<empty>", "<empty>");
    }

    public Device(String deviceId, String name) {
        this.deviceId = deviceId;
        this.name = name;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeviceStatus getStatus() {
        return status;
    }

    public void setStatus(DeviceStatus status) {
        this.status = status;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getTimeStarted() {
        return timeStarted;
    }

    public void setTimeStarted(String timeStarted) {
        this.timeStarted = timeStarted;
    }

    public String getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(String timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
}
