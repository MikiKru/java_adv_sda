package generics.ex2;

public interface Validator<T> {
    boolean validate(T t);  // metoda abstrakcyjna, która waliduje dane z tablicy
}
