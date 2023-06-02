public class number4 {
    private double radius;

    public number4(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Create a circle with radius 5
        number4 circle = new number4(5);

        // Print the current radius
        System.out.println("Radius: " + circle.getRadius());

        // Modify the radius
        circle.setRadius(7);

        // Print the updated radius
        System.out.println("Updated Radius: " + circle.getRadius());

        // Calculate and print the area
        double area = circle.getArea();
        System.out.println("Area: " + area);

        // Calculate and print the circumference
        double circumference = circle.getCircumference();
        System.out.println("Circumference: " + circumference);
    }
}
