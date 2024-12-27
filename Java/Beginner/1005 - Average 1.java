import java.util.Scanner;
/**
 * 09/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        double A, B, MEDIA;
        Scanner scan = new Scanner(System.in);
       
        A = scan.nextDouble();
        B = scan.nextDouble();
        
        MEDIA = ((A*3.5)+(B*7.5))/(3.5+7.5);
        
        System.out.printf("MEDIA = %.5f%n",MEDIA);
    }
}