import java.io.IOException;
import java.util.Scanner;
/**
 * 22/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
         float A, B, C;
        double TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO, PI;
        PI = 3.14159;
        Scanner scanner = new Scanner(System.in);
        
        A = scanner.nextFloat();
        B = scanner.nextFloat();
        C = scanner.nextFloat();
        
        TRIANGULO = (A*C)/2;
        CIRCULO = (C*C)*PI;
        TRAPEZIO = ((A+B)/2)*C;
        QUADRADO = B*B;
        RETANGULO = A*B;
        
        System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f%n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n", QUADRADO);
        System.out.printf("RETANGULO: %.3f%n", RETANGULO);
    }
 
}