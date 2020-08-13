public class CircleTest {
    public static void main(String[] args) {
        Circle aCircle = new Circle();
        aCircle.setCentreX(10.0);
        aCircle.setCentreY(20.0);
        aCircle.setRadius(5.0);
        System.out.println("Radius = " + aCircle.getRadius());
        System.out.println("Circum = " + aCircle.computeCircumference());
        System.out.println("Area = " + aCircle.computeArea());
        aCircle.resize(2.0);
        System.out.println("Radius = " + aCircle.getRadius());
    }
}
