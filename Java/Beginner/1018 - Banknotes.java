import java.io.IOException;
import java.util.Scanner;
/**
 * 27/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int Input = scan.nextInt();
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        
        System.out.println(Input);
        for (int nota : notas) {
            int qtdnotas = Input/nota;
            Input = Input%nota;
            System.out.println(qtdnotas+" nota(s) de R$ "+nota+",00");
        }
 
    }
}