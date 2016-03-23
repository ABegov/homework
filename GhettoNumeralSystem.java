import com.sun.org.apache.xpath.internal.SourceTree;

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

        for (int j = 0; j <= 9; j++) {

            switch (digits[j]){

                case 0:
                    System.out.print("Gee");
                    break;
                case 1:
                    System.out.print("Bro");
                    break;
                case 2:
                    System.out.print("Zuz");
                    break;
                case 3:
                    System.out.print("Ma");
                    break;
                case 4:
                    System.out.print("Duh");
                    break;
                case 5:
                    System.out.print("Yo");
                    break;
                case 6:
                    System.out.print("Dis");
                    break;
                case 7:
                    System.out.print("Hood");
                    break;
                case 8:
                    System.out.print("Jam");
                    break;
                case 9:
                    System.out.print("Mack");
                break;
            }

        }

    }

}

