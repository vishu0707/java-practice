package Assignment;

interface Shape {
    double calculateArea(double side);
    double calculatePerimeter(double side);

    }
class Square implements Shape{
    @Override
    public double calculateArea(double side) {
        return side*side;
    }

    @Override
    public double calculatePerimeter(double side) {
        return 4*side;

    }
}
class Circle implements Shape{
    @Override
    public double calculateArea(double radius) {
        double PI = Math.PI;
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter(double radius) {
        double PI = Math.PI;
        return 2 * PI * radius;
    }
}
class Test{
    public static void main(String[] args) {
        Shape shape=new Square();

        System.out.println(shape.calculateArea(45));
        System.out.println(shape.calculatePerimeter(45));

        Circle circle = new Circle();
        System.out.println(circle.calculateArea(7));
        System.out.println(circle.calculatePerimeter(7));
    }
}
