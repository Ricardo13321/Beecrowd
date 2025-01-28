import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int _loc0_ = scan.nextInt();

        for(int i = 0; i <= _loc0_; i++) {
            try {
                String[] _loc1_ = scan.nextLine().split(" ");
                Calc(Integer.parseInt(_loc1_[0]), Integer.parseInt(_loc1_[2]), _loc1_[3], Integer.parseInt(_loc1_[4]), Integer.parseInt(_loc1_[6]));
            } catch (Exception e) {
                //System.out.println("Oxi: "+e);
            }
        }
 
    }
    
    public static void Calc(int N1, int D1,String Op, int N2, int D2) {
        int Num1 = ("+".equals(Op))? N1*D2+N2*D1:("-".equals(Op))?N1*D2 - N2*D1:("/".equals(Op))? N1*D2:N1*N2;
        int Dem1 = ("+".equals(Op))? D1*D2:("-".equals(Op))? D1*D2: ("/".equals(Op))? N2*D1:D1*D2;
        int Num2 = Num1;
        int Dem2 = Dem1;
        
        int i = 2;
        while(i <= Math.abs(Num2) && i <= Math.abs(Dem2)) {
            if(Num2%i == 0 && Dem2%i == 0) {
                Num2 = Num2/i;
                Dem2 = Dem2/i;
            }else {
                i++;
            }
        }
        System.out.println(Num1+"/"+Dem1+" = "+Num2+"/"+Dem2);
    }
 
}