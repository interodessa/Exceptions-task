package app.devices;

import app.exception.HeightException;

public class DataHandler {
    private static final int HEIGHT_MIN = 120;
    private static final int HEIGHT_MAX = 355;
    public String airData(int height){
        try {
            if(height < HEIGHT_MIN || height > HEIGHT_MAX){
                throw new HeightException("The device does not function at a height of " + height + "meters!");
            }
        } catch (HeightException e){
            return e.getMessage();
        }
        return "Temperature:\n" +
                "Pressure:\n" +
                "Humidity:\n";
    }
}
