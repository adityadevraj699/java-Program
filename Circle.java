public class Circle {
    double area;
    double circumference;

    public Circle(int radius) {
        this.area = Math.PI * Math.pow(radius, 2);
        this.circumference = Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return String.format("Area of Circle is : %.2f\nCircumference of Circle is : %.2f", area, circumference);
    }

    public static void main(String[] args) {
        Circle m = new Circle(5);
        System.out.println(m);
    }
}

