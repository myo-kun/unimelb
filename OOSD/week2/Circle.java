public class Circle {
    public double centreX, centreY, radius;
    public double getCenterX() {
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
}
