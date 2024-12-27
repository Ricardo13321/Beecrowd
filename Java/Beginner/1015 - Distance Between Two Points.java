import java.util.Scanner;
/**
 * 25/12/2024
 * @author Ricardo Gabriel Gomes
 */
public class BeecrowdBeginner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] X = new double[2], Y = new double[2];
        double Distance;
        String Input;
        
        for(int i = 0; i < 2; i++) {
            try {
                Input = scan.nextLine();
                String[] _loc_ = Input.split(" ");
                X[i] = Double.parseDouble(_loc_[0]);
                Y[i] = Double.parseDouble(_loc_[1]);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        Distance = Math.sqrt(Math.pow(X[1]-X[0], 2)+Math.pow(Y[1]-Y[0], 2));
        System.out.printf("%.4f%n",Distance);
    }
}
