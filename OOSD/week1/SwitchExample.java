public class SwitchExample {
    public static void main(String[] args) {
        char x = 'b';
        switch (x) {
            case 'a':
                System.out.println("Character = a");
                break;
            case 'b':
                System.out.println("Character = b");
                break;
            default:
                System.out.println("Other character");
                break;
        }
    }
}
