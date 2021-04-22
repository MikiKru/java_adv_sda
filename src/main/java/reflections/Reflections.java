package reflections;

import java.util.Arrays;

public class Reflections {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
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
    }
}
