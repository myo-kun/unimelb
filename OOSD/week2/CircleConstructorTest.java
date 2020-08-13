public class CircleConstructorTest {
    public static void main(String[] args) {

        Circle circle_1 = new Circle(10.0, 20.0, 12.2);
        System.out.println("Defined circle_1 with centre (" +
                circle_1.getCentreX() + ", " + circle_1.getCentreY() +
                ") and radius " + circle_1.getRadius());
    }
}
