package exercises.ex1_io;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Collectors;

//Napisz program, który wyświetli wszystkie pliki/katalogi zawarte w danym katalogu.
//Wraz z informacją o plikach i katalogach zwróć informację o ich rozmiarze i dacie utworzeni
public class ListResurces {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\PROXIMO\\Desktop\\java_adv_sda\\src\\main\\java\\exercises");
        Arrays.stream(file.list()).forEach(System.out::println);

    }
}
