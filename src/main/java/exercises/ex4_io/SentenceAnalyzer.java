package exercises.ex4_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SentenceAnalyzer {
    private static final String PATH = Paths.get("").toAbsolutePath().toString() +
            "\\src\\main\\java\\exercises\\ex4_io\\definition.txt";
    public static String getLongestWordInFile() {
        try {
            Scanner sc = new Scanner(new File(PATH));
            String longestWord = "";
            String[] dividedSentence;
            String wordToCompare;
            while (sc.hasNextLine()) {
                dividedSentence = sc.nextLine().replaceAll("[\\.,()]+", "").split(" ");
                wordToCompare = Arrays.stream(dividedSentence).max(Comparator.comparing(String::length)).get();
                if (wordToCompare.length() > longestWord.length()) {
                    longestWord = wordToCompare;
                }
            }
            sc.close();
            return longestWord;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Nie znaleziono pliku!");
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(getLongestWordInFile());
        System.out.println(getLongestWordInFile().length());
    }
}
