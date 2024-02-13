package app.devices;

import app.exception.HeightException;
import java.util.Random;

public class DataHandler {
    private static final int HEIGHT_MIN = 120;
    private static final int HEIGHT_MAX = 355;
    int Temperature;
    int Pressure;
    int Humidity;
    public String airData(int height){
        try {
            if(height < HEIGHT_MIN || height > HEIGHT_MAX){
                throw new HeightException("The device does not function at a height of " + height + "meters!");
            }
        } catch (HeightException e){
            return e.getMessage();
        }
        Random rand = new Random();
        Temperature = rand.nextInt(-30,30);
        Pressure = rand.nextInt(950,1050);
        Humidity = rand.nextInt(20,100);
        return "Temperature:" + Temperature + "C\n" +
                "Pressure:" + Pressure + "гПа\n" +
                "Humidity:" + Humidity + "%\n";
    }
}
