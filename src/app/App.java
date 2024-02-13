package app;

import app.devices.DataHandler;
import app.view.HeightProvider;

public class App {
    public static void main(String[] args) {
        HeightProvider heightProvider = new HeightProvider();
        int height = heightProvider.getHeight();
        DataHandler dataHandler = new DataHandler();
        System.out.println(dataHandler.airData(height));
    }
}