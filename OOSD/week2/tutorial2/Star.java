import java.util.Scanner;
public class Star  {
    public static void main(String[] args) {

        final char SPACE_CHAR = ' ';
        final char HASH_CHAR = '#';

        int size, i, j, space = 1;
        System.out.print("Enter the size: ");
        Scanner s = new Scanner(System.in);
        size = s.nextInt()/2 + 1;
        space = size - 1;

        // Top half
        for (j = 1; j<= size; j++) {
            for (i = 1; i<= space; i++) {
                System.out.print(SPACE_CHAR);
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print(HASH_CHAR);
            }
            System.out.println("");
        }

        // Bottom half
        space = 1;
        for (j = 1; j<= size - 1; j++) {
            for (i = 1; i<= space; i++) {
                System.out.print(SPACE_CHAR);
            }
            space++;
            for (i = 1; i<= 2 * (size - j) - 1; i++) {
                System.out.print(HASH_CHAR);
            }
            System.out.println("");
        }
    }
}