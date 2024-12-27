import java.io.IOException;
import java.util.Scanner;
/**
 * 09/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        int numberOne, numberTwo, PROD;
        Scanner scanner = new Scanner(System.in);
    
        numberOne = scanner.nextInt();
        numberTwo = scanner.nextInt();
    
        PROD = numberOne*numberTwo;
        
        System.out.println("PROD = "+PROD);
    
    }
}