package exercises.ex1_io;

import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;


//Napisz program, który wyświetli wszystkie pliki/katalogi zawarte w danym katalogu.
//Wraz z informacją o plikach i katalogach zwróć informację o ich rozmiarze i dacie utworzeni
public class ListResurces {
    public static void main(String[] args) {
        final String PATH = Paths.get("").toAbsolutePath().toString() + "\\src\\main\\java\\exercises";
        File file = new File(PATH);
        Arrays.stream(file.list())
                .forEach(f -> System.out.printf("| %20s | %10skb |\n",
                        f,
                        new File( PATH + "\\" + f).isDirectory() ?
                                "0" :
                                new File( PATH + "\\" + f).length()));

    }
}
