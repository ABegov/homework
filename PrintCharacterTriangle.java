import java.util.Scanner;

/**
 * Created by A.BEGOV on 20.3.2016 г..
 */
public class PrintCharacterTriangle {
    public static void main(String[] args) {

        System.out.print("Please, enter a number:");
        Scanner console = new Scanner(System.in);

        int number = console.nextInt();

        for (int line = 0; line < number; line++) {

            for (char row = 'a'; row <= 'a' + line; row++) {

                System.out.print(row + " ");
            }

            System.out.println();
        }

        for (int line = number - 1; line > 0; line--) {

            for (char row = 'a'; row < 'a' + line; row++) {

                System.out.print(row + " ");
            }

            System.out.println();
        }
    }
}

