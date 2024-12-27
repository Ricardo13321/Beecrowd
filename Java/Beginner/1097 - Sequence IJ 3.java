import java.io.IOException;
 
/**
 * 25/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       int j = 7, i = 1;
        while( i < 10) {
            for(int a = 0; a < 3; a++) {
                System.out.println("I="+i+" J="+j);
                j--;
            }
            j += 5;
            i += 2;
        }
 
    }
 
}