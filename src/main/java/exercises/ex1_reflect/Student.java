package exercises.ex1_reflect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    private String name, lastname, indexNo, branch;

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//  Wyświetl następujące informacje wykorzystując mechanizm refeksji:
//  - dostępne metody
//  - dostępne pola
//  - dostępne konstruktory
        Class student = Class.forName("exercises.ex1_reflect.Student");
        Arrays.stream(student.getMethods()).forEach(System.out::println);
        Arrays.stream(student.getDeclaredFields()).forEach(System.out::println);
        Arrays.stream(student.getConstructors()).forEach(System.out::println);

//        Student s = new Student("Adam","Kowalski","123321","IT");
        Student s1 = (Student) student.getDeclaredConstructor().newInstance();
        Student s2 = (Student) student
                .getDeclaredConstructor(String.class, String.class, String.class, String.class)
                .newInstance("Anna","Kot","432234","IT");
        System.out.println(student.getMethod("toString").invoke(s2));
    }
}
