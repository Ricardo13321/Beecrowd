import java.io.IOException;
import java.util.Scanner;
/**
 * 09/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int SOMA = A+B;
        System.out.println("SOMA = "+SOMA);
    }
}