import java.util.Scanner;
/**
 * 06/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        String ItemOne, ItemTwo;
        int Unit, Code;
        Double Price, TotalPrice;
        String[] arrOfStr;
        Scanner scanner = new Scanner(System.in);
        
        ItemOne = scanner.nextLine();
        
        arrOfStr  = ItemOne.split(" ");
        
        Code = Integer.parseInt(arrOfStr[0]);
        Unit = Integer.parseInt(arrOfStr[1]);
        Price = Double.parseDouble(arrOfStr[2]);
        
        TotalPrice = Unit*Price;
        
        ItemTwo = scanner.nextLine();
        arrOfStr  = ItemTwo.split(" ");
        
        Code = Integer.parseInt(arrOfStr[0]);
        Unit = Integer.parseInt(arrOfStr[1]);
        Price = Double.parseDouble(arrOfStr[2]);
        
        TotalPrice += Unit*Price;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",TotalPrice); 
    }
}