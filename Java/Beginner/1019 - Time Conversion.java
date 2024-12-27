import java.io.IOException;
import java.util.Scanner;
/**
 * 22/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int Input = scan.nextInt();
        System.out.println((Input/60)/60+":"+(Input/60)%60+":"+Input%60);
    }
 
}