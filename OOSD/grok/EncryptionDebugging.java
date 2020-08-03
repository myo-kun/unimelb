import java.util.Scanner;

public class EncryptionDebugging {
    public static void main(String[] args) {

        String text = "You should really watch Game of Thrones";

        text = text.toLowerCase();
        text = text.replaceAll("[^a-zA-Z]", "");

        int length = text.length();

        char first = text.charAt(0);
        char last = text.charAt(length-1);
        char middle = text.charAt(length/2);

        text = text.replace(first, (char)('z' - (first - 'a')));
        text = text.replace(middle, (char)('z' - (middle - 'a')));
        text = text.replace(last, (char)('z' - (last - 'a')));

        System.out.println(text);
    }
}