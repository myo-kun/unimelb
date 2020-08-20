public class DoWhileExample {
    public static void main(String[] args) {
        int sum = 0, n = 1;
        do {
            sum += n;
            n += 1;
        } while ( n  <= 10 );
        System.out.println("Sum = " + sum);
    }
}
