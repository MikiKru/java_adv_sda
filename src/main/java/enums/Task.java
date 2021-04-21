package enums;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;

@Data
public class Task {
    private String title;
    private Category category;
    private Status status;

    public Task(String title, String categoryName, Status status) {
        this.title = title;
        if(Arrays.stream(Category.values()).filter(c -> c.getName().equals(categoryName)).findFirst().isPresent()) {
            this.category = Arrays.stream(Category.values()).filter(c -> c.getName().equals(categoryName)).findFirst().get();
        } else {
            this.category = Category.OTHER;
        }
        this.status = status;
    }
}
