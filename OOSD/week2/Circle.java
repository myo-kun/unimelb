public class Circle {
    public double centreX;
    public double centreY;
    public double radius;

    public double computeCircumference() {
        double circum = 2 * Math.PI * radius;
        return circum;
    }
    public double computeArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
    public void resize(double factor) {
        radius = radius * factor;
    }
}
