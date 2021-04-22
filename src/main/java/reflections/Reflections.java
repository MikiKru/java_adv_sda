package reflections;

import exercises.ex5_io.User;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Reflections {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        Class c = Class.forName("exercises.ex5_io.User");
        // pola
        System.out.println("FIELD");
        Arrays.stream(c.getFields()).forEach(System.out::println);
        Arrays.stream(c.getDeclaredFields()).forEach(System.out::println);
        System.out.println("AGE: " + c.getDeclaredField("age"));
        // methods
        System.out.println("METHODS");
        Arrays.stream(c.getMethods()).forEach(System.out::println);
        System.out.println("getAge(): " + c.getMethod("getAge"));
        // superclasses
        System.out.println("SuperClass: " + c.getSuperclass());
        // konstruktory
        Arrays.stream(c.getConstructors()).forEach(System.out::println);
        // obiekt klasy
        User user = new User("Test","Test",30);
        User o1 = (User) c.newInstance();
        // pola
        Field nameField = User.class.getDeclaredField("name");
        Field ageField = User.class.getDeclaredField("age");
        // edycja
        nameField.set(o1, "Michał");
        user.name = "Michał";
        ageField.set(o1, 30);
        user.age = 30;
        // odczyt
        System.out.println("NAME: " + nameField.get(o1));
        System.out.println("AGE: " + ageField.get(o1));

    }
}
