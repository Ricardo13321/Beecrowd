import java.util.Scanner;
/**
 * 22/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Double R, pi, sum;
        pi = 3.14159;
        Scanner scanner = new Scanner(System.in);
        
        R = scanner.nextDouble();
        sum = (4/3.0)*pi*(R*R*R);
        System.out.printf("VOLUME = %.3f%n",sum);
    }
}