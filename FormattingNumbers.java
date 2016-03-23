

import java.util.Scanner;

/**
 * Created by A.BEGOV on 20.3.2016 г..
 */
public class FormattingNumbers {
    public static void main(String[] args) {


        System.out.print("Please, enter a number:");
        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        float b = console.nextFloat();
        float c = console.nextFloat();

        String hex = Integer.toHexString(a);

        String bi = Integer.toBinaryString(a);


        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", hex, Integer.parseInt(bi), b, c);

    }

}
