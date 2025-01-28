import java.io.IOException;
import java.util.Scanner;
/**
 * 28/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        String Input = scan.nextLine();
        String[] splitString;
        splitString = Input.split(" ");
        int[] n = new int[2];
        
        n[0] = Integer.parseInt(splitString[0]);
        n[1] = Integer.parseInt(splitString[1]);
        
        if(n[0]>1 && n[0]<20 && n[0]<n[1] && n[1]<100000) {
            for(int i = 1; i<=n[1]; i++) {
                System.out.print(i+((i%n[0]==0)?"\n":" "));
            }
        }
    }
}