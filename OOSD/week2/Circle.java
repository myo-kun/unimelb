public class Circle {
    public static int numCircles = 0;
    public double centreX, centreY, radius;
    // flexible constructor
    Circle (Circle aCircle) {
        if (aCircle == null) {
            System.out.println("Fatal Error.");
            System.exit(0);
        }
        this.centreX = aCircle.centreX;
        this.centreY = aCircle.centreY;
        this.radius = aCircle.radius;
    }
    public Circle(double x, double y, double r) {
        centreX = x;
        centreY = y;
        radius = r;
        numCircles++;
    }
    public double getCentreX() {
        return centreX;
    }
    public void setCentreX(double centreX) {
        this.centreX = centreX;
    }
    public double getCentreY() {
        return centreY;
    }
    public void setCentreY(double centreY) {
        this.centreY = centreY;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
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
    public boolean equals(Circle circle) {
        return Double.compare(circle.centreX, centreX) == 0 &&
                Double.compare(circle.centreY, centreY) == 0 &&
                Double.compare(circle.radius, radius) == 0;
    }
    public String toString() { return "I am a Circle with {" + "centreX=" + centreX + ", centreY=" + centreY + ", radius=" + radius + '}'; }
    public static void printNumCircles() { System.out.println("Number of circles = " + numCircles); }
}
