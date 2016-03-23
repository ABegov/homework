import java.util.Scanner;

/**
 * Created by A.BEGOV on 22.3.2016 г..
 */
public interface ConvertFromBase7ToDecimal {
    public static void main(String[] args) {

        System.out.println("Please, enter a number:");
        Scanner console = new Scanner(System.in);

        String base7Number = console.next();

        int number = Integer.valueOf(base7Number,7);

        System.out.println(number);
    }
}
