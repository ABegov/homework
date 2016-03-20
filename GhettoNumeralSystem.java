import java.util.Scanner;

/**
 * Created by A.BEGOV on 20.3.2016 г..
 */
public class GhettoNumeralSystem {
    public static void main(String[] args) {

        System.out.print("Please, enter a number:");
        Scanner console = new Scanner(System.in);
        String number = console.next();

        char[] partOfNumber = number.toCharArray();
        int[] digits = new int[partOfNumber.length];

        for (int i = 0; i < partOfNumber.length; i++) {
            digits[i] = partOfNumber[i] - 48;
        }
        String[] words = new String[]{"Gee", "Bro", "Zuz", "Ma", "Duh", "Yo", "Dis", "Hood", "Jam", "Mack"};

        for (int j = 0; j <= 10; j++) {

        }

    }

}

