package com.mycompany.beecrowdbeginner;

import java.util.Scanner;
/**
 * 06/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class BeecrowdBeginner {
    
    public static void main(String[] args) {
        int A, B, X;
        
        Scanner scanner = new Scanner(System.in);
        
        A = scanner.nextInt();
        B = scanner.nextInt();
        X = A+B;
        System.out.println("X = "+X);
    }
}
