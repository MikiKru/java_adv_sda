package exercises.ex7;

import java.util.Locale;

public class CircleComparator implements CompareGeometricObjects {
    @Override
    public double compareRadius(Circle c1, Circle c2) {
        return c1.getRadius() - c2.getRadius();
    }
    @Override
    public double compareAreas(Circle c1, Circle c2) {
        return c1.getArea() - c2.getArea();
    }
    @Override
    public double comparePerimeters(Circle c1, Circle c2) {
        return c1.getPerimiter() - c2.getPerimiter();
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(5.55);
        Circle c2 = new ResizableCircle(7);
        CircleComparator circleComparator = new CircleComparator();

        System.out.printf(Locale.ENGLISH,"PORÓWNANIE PROMIENI: %.1f \nPORÓWNANIE POWIERZCHNI: %.4f \nPORÓWNANIE OBWODÓW: %.4f\n",
                circleComparator.compareRadius(c1,c2),
                circleComparator.compareAreas(c1,c2),
                circleComparator.comparePerimeters(c1,c2)
        );
    }
}
