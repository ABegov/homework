import java.util.Scanner;

/**
 * Created by A.BEGOV on 20.3.2016 г..
 */
public class SumNumbers {
    public static void main(String[] args) {

        System.out.print("Please, enter a number:");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int result = 0;

        for (int i = 0; i <= number; i++) {
            result += i;

        }
        System.out.println(result);
    }
}
