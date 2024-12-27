import java.util.Scanner;
/**
 * 22/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        int X;
        float Y;
        Scanner scanner = new Scanner(System.in);
        
        X = scanner.nextInt();
        Y = scanner.nextFloat();
        System.out.printf("%.3f km/l%n", X/Y);
    }
}