package enums;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Task {
    private String title;
    private Category category;
    private Status status;
}
