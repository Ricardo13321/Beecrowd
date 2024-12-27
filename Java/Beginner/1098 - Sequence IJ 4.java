import java.io.IOException;
 
/**
 * 25/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       float i = -1;
        while(++i<11) {
            for(float j=0;j<3;j++) {
                System.out.println("I="+((i%5==0)?String.format("%.0f",i/5):String.format("%.1f",i/5))+" J="+(((i%5==0)?String.format("%.0f",j+1+i/5):String.format("%.1f",j+1+i/5))));
            }
        }
 
    }
}