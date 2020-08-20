public class CircleTest {
    public static void main(String[] args) {
        Circle aCircle = new Circle(10, 14, 15);
        aCircle.setCentreX(10.0);
        aCircle.setCentreY(20.0);
        aCircle.setRadius(5.0);
        System.out.println("Radius = " + aCircle.getRadius());
        System.out.println("Circum = " + aCircle.computeCircumference());
        System.out.println("Area = " + aCircle.computeArea());
        aCircle.resize(2.0);
        System.out.println("Radius = " + aCircle.getRadius());
        System.out.println(new Circle(5.0, 5.0, 40.0));
        Circle c1 = new Circle(10.0, 10.0, 5.0);
        Circle c2 = new Circle(c1); // copying (new object)
    }
}
