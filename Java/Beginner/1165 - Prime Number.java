import java.io.IOException;
import java.util.Scanner;
/**
 * 22/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int N, i;
        int[] Array = new int[100];
        Scanner scanner = new Scanner(System.in);
        
        N = scanner.nextInt();
        if (1<= N && N <= 100) {
            i = 0;
            while(i < N) {
                Array[i] = scanner.nextInt();
                i++;
            }
            i = 0;
            while(i < N) {
                if(Array[i] == 2) {
                    System.out.println(Array[i]+" eh primo");
                } else {
                   for(int C=2; C<Array[i];C++) {
                        //System.out.println(Array[i]+"%"+C+" eh primo. "+Array[i]%C);
                        if(Array[i]%C == 0) {
                            System.out.println(Array[i]+" nao eh primo");
                            break;
                        } else if (C+1 == Array[i]){
                            System.out.println(Array[i]+" eh primo");
                        }
                    } 
                }
                i++;
            }
        }
    }
}