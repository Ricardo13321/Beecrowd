import java.io.IOException;
import java.util.Scanner;
/**
 * 13/01/2025
 * @author Ricardo Gabriel Gomes
 */      
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        String Input = scan.nextLine();
        String[] InputSplit = Input.split(" ");
        int[] Values = new int[4];
        for(int i = 0; i<Values.length; i++) {
            Values[i] = Integer.parseInt(InputSplit[i]);
        }
        //0 = A, 1 = B, 2 = C, 3 = D 
        if(Values[1] > Values[2] && Values[3] > Values[0] && Values[2]+Values[3] > Values[0]+Values[1] && Values[2] > 0 && Values[3] > 0 && Values[0]%2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
 
    }
 
}