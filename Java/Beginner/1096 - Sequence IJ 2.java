import java.io.IOException;
/**
 * 25/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        int i = 1;
        for(int j = 7; j >= 5; j--) {
            System.out.println("I="+i+" J="+j);
            if(j == 5 && i < 9) {
                i += 2;
                j += 3;
            }
        }
    }
 
}