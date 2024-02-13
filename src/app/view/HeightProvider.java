package app.view;
import java.util.Scanner;

public class HeightProvider {
    public int getHeight(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input device height:");
        return scanner.nextInt();
    }
}
