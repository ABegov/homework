import java.util.Scanner;

/**
 * Created by A.BEGOV on 20.3.2016 г..
 */
public class TriangleArea {
    public static void main(String[] args) {

        System.out.print("Please, numbers:");
        Scanner console = new Scanner(System.in);

        int x1 = console.nextInt();
        int y1 = console.nextInt();

        int x2 = console.nextInt();
        int y2 = console.nextInt();

        int x3 = console.nextInt();
        int y3 = console.nextInt();

        int area = (x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2;

        System.out.println(Math.round(area));
    }
}
