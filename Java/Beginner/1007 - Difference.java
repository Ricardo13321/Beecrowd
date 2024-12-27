import java.util.Scanner;
/**
 * 09/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        int A, B, C, D, DIFFERENCE;
        Scanner scan = new Scanner(System.in);
        
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();
        
        DIFFERENCE = A*B-C*D;
        
        System.out.println("DIFERENCA = "+DIFFERENCE);
    }
}