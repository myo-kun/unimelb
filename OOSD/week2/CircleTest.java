public class CircleTest {
    public static void main(String[] args) {
        Circle aCircle = new Circle();
        aCircle.centreX = 10.0;
        aCircle.centreY = 20.0;
        aCircle.radius = 5.0;
        System.out.println("Radius = " + aCircle.radius);
        System.out.println("Circum = " + aCircle.computeCircumference());
        System.out.println("Area = " + aCircle.computeArea());
        aCircle.resize(2.0);
        System.out.println("Radius = " + aCircle.radius);
    }
}
