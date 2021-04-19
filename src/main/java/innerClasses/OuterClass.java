package innerClasses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data                   // gettery, settery, toString
@AllArgsConstructor     // OuterClass(String title){...}
public class OuterClass {
    private String title;
}
