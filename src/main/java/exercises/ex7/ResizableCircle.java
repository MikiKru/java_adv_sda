package exercises.ex7;

public class ResizableCircle extends Circle implements Resize{
    public ResizableCircle(double radius) {
        super(radius);
    }
    @Override
    public void resize(int percent) {
        super.setRadius(super.getRadius() * ( (double)percent / 100));
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        System.out.println("AREA: " + circle1.getArea());
        System.out.println("PERIMETER: " + circle1.getPerimiter());
        System.out.println(circle1);
        Circle circle2 = new ResizableCircle(2);
        System.out.println("AREA BEFORE: " + circle2.getArea());
        System.out.println("PERIMETER BEFORE: " + circle2.getPerimiter());
        System.out.println("BEFORE: " + circle2);
        ((ResizableCircle) circle2).resize(50);
        System.out.println("AREA AFTER: " + circle2.getArea());
        System.out.println("PERIMETER AFTER: " + circle2.getPerimiter());
        System.out.println("AFTER: " + circle2);
    }
}
