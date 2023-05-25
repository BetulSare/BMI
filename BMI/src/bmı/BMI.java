
package bmı;
import java.util.Scanner;
public class BMI {

   
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter your height in meters(m) : ");
        double height=scan.nextDouble();
        System.out.print("Please enter your weight : ");
        double weight=scan.nextDouble();
        
        double bmı=weight/(Math.pow(height, 2));
        System.out.printf("Your bmı is: %f ",bmı);

    }
    
}
