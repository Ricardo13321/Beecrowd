import java.io.IOException;

/**
 * 23/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int i = 1, j = 60;
        while(j >= 0) {
            System.out.println("I="+i+" J="+j);
            j -= 5;
            i += 3;
        }
    }
 
}