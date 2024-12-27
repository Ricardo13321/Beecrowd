import java.util.Scanner;
/**
 * 06/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        double SalaryFlat, Sold, Salary;
        String Name;
        Scanner scanner = new Scanner(System.in);
        
        Name = scanner.nextLine();
        SalaryFlat = scanner.nextDouble();
        Sold = scanner.nextDouble();
        
        System.out.printf("TOTAL = R$ %.2f%n",SalaryFlat+(Sold*0.15));  
    }
}