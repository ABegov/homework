import java.util.Scanner;


/**
 * Created by A.BEGOV on 21.3.2016 г..
 */
public class CalculateExpression {
    public static void main(String[] args) {

        System.out.print("Please, enter a number:");
        Scanner console = new Scanner(System.in);

        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

       //((a2 + b2) / (a2 – b2))(a + b + c) / √c

        double result1 = Math.pow(((a*a + b*b)/ (a*a - b*b )),(a+b+c)/ Math.sqrt(c));

        //(a2 + b2 - c3)(a – b)
        double result2 = Math.pow((a*a + b*b - c*c*c), (a-b));

        double avrNums =  (a + b + c) / 3;

        double avrFormulas = (result1+result2)/2;

        double diff = Math.abs(avrNums-avrFormulas);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", result1,result2,diff);


    }

}
