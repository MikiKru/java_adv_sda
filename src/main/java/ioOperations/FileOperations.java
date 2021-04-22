package ioOperations;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {
    private List<String> notes = new ArrayList<>();
    // dodaj notatkę do pliku
    public void addNote(String note){
        try {
            PrintWriter pw = new PrintWriter("mynotes.txt");
            notes.add(note);                                // dodaję notatkę do listy
            for(String s : notes) {
                pw.println(s);                               // aktualizuję plik na bazie listy
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Nie znaleziono pliku!");
        }
    }
    // odczytaj notatki z pliku
    public void readNotes(){

    }
    public static void main(String[] args) {
        FileOperations fo = new FileOperations();
        fo.addNote("Nauka STREAM API");
        fo.addNote("Nauka FileIO");
    }
}
