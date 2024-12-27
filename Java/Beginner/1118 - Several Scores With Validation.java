import java.util.Scanner;
/**
 * 25/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class BeecrowdBeginner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] Score = new double[2];
        int X = 1;
        
        while(X != 2) {
            for(int i = 0; i < 2;) {
                Score[i] = scan.nextDouble();
                if(Score[i] < 0 || Score[i] > 10) {
                    System.out.println("nota invalida");
                } else {
                    i++;
                }
            }
            
            System.out.printf("media = %.2f%n", (Score[0]+Score[1])/2);
            
            boolean _loc1_ = true;
            while(_loc1_) {
                System.out.println("novo calculo (1-sim 2-nao)");
                int _loc2_ = scan.nextInt();
                if(_loc2_ == 1) {
                    X = _loc2_;
                    _loc1_ = false;
                } else if (_loc2_ == 2) {
                    X = _loc2_;
                    _loc1_ = false;
                }
            }
        }
    }
}
