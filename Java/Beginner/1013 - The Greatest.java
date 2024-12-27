import java.io.IOException;
import java.util.Scanner;
/**
 * 22/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
         int A, B, C, MaiorAB;
        MaiorAB = 0;
        Scanner scanner = new Scanner(System.in);
        
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        if(A>B && A>C) {
            MaiorAB = A;
        } else if (B>C) {
            MaiorAB = B;
        } else {
            MaiorAB = C;
        }
        System.out.println(MaiorAB+" eh o maior");
    }
 
}