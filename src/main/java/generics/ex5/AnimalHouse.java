package generics.ex5;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnimalHouse <T extends Animal> {
    private T [] animals;
}
