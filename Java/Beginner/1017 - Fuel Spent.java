import java.io.IOException;
import java.util.Scanner;

/**
 * 25/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int  Time, AverageSpeed, FuelSpent = 12;
        double Fuel;
        Time = scan.nextInt();
        AverageSpeed = scan.nextInt();
        Fuel = (double)(Time*AverageSpeed)/12;
        System.out.printf("%.3f%n", Fuel);
    }
}