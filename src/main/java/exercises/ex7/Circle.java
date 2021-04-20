package exercises.ex7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Circle implements GeometricObject {
    private double radius;
    @Override
    public double getPerimiter() { // obwód
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea() {   // pole
        return Math.PI * Math.pow(radius,2);
    }
}
