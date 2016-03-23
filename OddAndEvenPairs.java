import java.util.Scanner;
import java.util.*;

/**
 * Created by A.BEGOV on 22.3.2016 г..
 */
public class OddAndEvenPairs {
    public static void main(String[] args) {

        System.out.println("Please, enter digits:");
        Scanner console = new Scanner(System.in);

        String nums = console.nextLine();

        String[] inputs = nums.split(" ");


        int[] numbers = new int[inputs.length];
        for(int i = 0;i < inputs.length;i++){

           numbers[i] = Integer.parseInt(inputs[i]);
        }

        if (numbers.length % 2 == 0) {

            for (int i = 0 ; i < numbers.length; i+=2) {

                if (numbers[i] % 2 == 0 && numbers[i+1]%2==0) {

                    System.out.printf("%1$d, %2$d -> both are even ", numbers[i], numbers[i+1]);
                    System.out.println();
                }
                else if (numbers[i] % 2 != 0 && numbers[i+1]%2 !=0){
                    System.out.printf("%1$d, %2$d -> both are odd ", numbers[i], numbers[i+1]);
                    System.out.println();
                }
                else {
                    System.out.printf("%1$d, %2$d -> different ", numbers[i], numbers[i+1]);
                }
            }
        } else {
            System.out.println("Invalid length");
        }

    }
}
