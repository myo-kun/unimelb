import java.lang.Character;
import java.lang.Integer;
import java.lang.Double;

public class UsingWrappers {
    public static void main(String[] args) {
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.CURRENCY_SYMBOL);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.reverse(2017));
        System.out.println(Integer.rotateRight(-31, 3));
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.doubleToLongBits(22));

    }
}
