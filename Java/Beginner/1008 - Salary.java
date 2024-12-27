import java.util.Scanner;
/**
 * 06/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int number, WorkedHours;
        float ReceivedPerHours, Salary;
        
        number = scan.nextInt();
        WorkedHours = scan.nextInt();
        ReceivedPerHours = scan.nextFloat();
        
        Salary = ReceivedPerHours * WorkedHours;
        System.out.println("NUMBER = "+number);
        System.out.printf("SALARY = U$ %.2f%n", Salary);
    }
}