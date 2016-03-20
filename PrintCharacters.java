/**
 * Created by A.BEGOV on 20.3.2016 г..
 */
public class PrintCharacters {
    public static void main(String[] args) {
        char letter = 'a';

        for (int i = 1; i < 26; i++) {

            System.out.print(letter + " ");
            letter += 1;
        }
    }

}

