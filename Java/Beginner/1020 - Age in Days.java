import java.io.IOException;
import java.util.Scanner;
/**
 * 28/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int Input = scan.nextInt();
        System.out.println(Input/365+" ano(s)\n"+(Input%365)/30+" mes(es)\n"+(Input%365)%30+" dia(s)");
    }
 
}