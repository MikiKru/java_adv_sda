package exercises.ex7;

public interface CompareGeometricObjects {
    // metoda ma zwracać różnice
    // jeśli c1 posiada większą wartość porównywaną zwracany wynik jest dodatni
    // w przeciwnym razie ujemny
    double compareRadius(Circle c1, Circle c2);
    double compareAreas(Circle c1, Circle c2);
    double comparePerimeters(Circle c1, Circle c2);
}
