import java.io.IOException;
import java.util.Scanner;
/**
 * 14/01/2025
 * @author Ricardo Gabriel Gomes
 */    
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        double Input = scan.nextDouble();

        if(Input <= 25 && Input >= 0){System.out.println("Intervalo [0,25]");}
        if(Input <= 50 && Input > 25){System.out.println("Intervalo (25,50]");}
        if(Input <= 75 && Input > 50){System.out.println("Intervalo (50,75]");}
        if(Input <= 100 && Input > 75){System.out.println("Intervalo (75,100]");}
        if(Input < 0 || Input > 100){System.out.println("Fora de intervalo");}
 
    }
 
}