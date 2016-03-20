import java.util.Scanner;

/**
 * Created by A.BEGOV on 20.3.2016 г..
 */
public class GetAverage {
    public static void main(String[] args) {
        System.out.print("Please, enter a number:");
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        System.out.println(average(a, b, c));
    }

    static double average(double a, double b, double c) {
        double avr = (a + b + c) / 3;
        return avr;
    }
}
