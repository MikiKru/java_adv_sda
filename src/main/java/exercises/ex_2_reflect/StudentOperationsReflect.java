package exercises.ex_2_reflect;

import exercises.ex1_reflect.Student;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StudentOperationsReflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        // 1. tworzenie obiektu z przekazaniem wszystkich wymaganych parametrów
        Class student = Class.forName("exercises.ex1_reflect.Student");
        Student s2 = (Student) student
                .getDeclaredConstructor(String.class, String.class, String.class, String.class)
                .newInstance("Anna","Kot","432234","IT");
        // 2. wywołanie metod typu getter na podstawie utworzonego obiektu
        Method nameGetter = student.getMethod("getName");
        System.out.println(nameGetter.invoke(student));
        // 3. bezpośrednie modyfikacje wartości pól prywatnych
        Field studentName = student.getDeclaredField("name");
        studentName.setAccessible(true);
        studentName.set(student, "Mikołaj");
        studentName.setAccessible(false);
        System.out.println(nameGetter.invoke(student));
    }
}
