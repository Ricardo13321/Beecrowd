import java.util.Scanner;
/**
 * 09/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        double A, B, C, MEDIA;
        Scanner scan = new Scanner(System.in);
        
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        
        MEDIA = Math.round((((A*2)+(B*3)+(C*5))/(2+3+5))*10.00)/10.00;
        
        System.out.printf("MEDIA = %.1f%n", MEDIA);
    }
}