public class CircleConstructorTest {
    public static void main(String[] args) {

        Circle circle_1 = new Circle();
        System.out.println("Defined circle_1 with centre (" +
                circle_1.getCentreX() + ", " + circle_1.getCentreY() +
                ") and radius " + circle_1.getRadius());

        Circle circle_2 = new Circle(10.0, 20.0, 12.2);
        System.out.println("Defined circle_2 with centre (" +
                circle_2.getCentreX() + ", " + circle_2.getCentreY() +
                ") and radius " + circle_2.getRadius());
    }
}
