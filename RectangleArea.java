import java.util.Scanner;

/**
 * Created by A.BEGOV on 20.3.2016 г..
 */
public class RectangleArea {
    public static void main(String[] args) {
        System.out.print("Please, enter side a and b:");
        Scanner console = new Scanner(System.in);

        int numA = console.nextInt();
        int numB = console.nextInt();
        int result = numA*numB;

        System.out.println(result);
    }
}
