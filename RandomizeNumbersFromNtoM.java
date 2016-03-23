import java.util.Scanner;

/**
 * Created by A.BEGOV on 22.3.2016 г..
 */
public class RandomizeNumbersFromNtoM {
    public static void main(String[] args) {
        System.out.println("Please, enter min number and max number:");
        Scanner console = new Scanner(System.in);

        int minNum = console.nextInt();
        int maxNum = console.nextInt();

        int randomNum = minNum + (int)(Math.random() * ((maxNum - minNum) + 1));

        System.out.println(randomNum);
    }
}
