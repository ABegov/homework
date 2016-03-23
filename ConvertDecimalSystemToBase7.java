import java.util.Scanner;

/**
 * Created by A.BEGOV on 22.3.2016 г..
 */
public class ConvertDecimalSystemToBase7 {
    public static void main(String[] args) {

        System.out.print("Please, enter a number:");
        Scanner console = new Scanner(System.in);

        int number = console.nextInt();

        String base7Number = Integer.toString(number,7);
        System.out.println(base7Number);
    }
}
