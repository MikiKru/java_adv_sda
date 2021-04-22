package ioOperations;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {
    private List<String> notes = new ArrayList<>();
    // dodaj notatkę do pliku
    public void addNote(String note){
        try {
            // PrintWriter -> tworzy nowy plik gdy nie występuję lub nadpisuje istniejący
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
    public void appendNote(String note){
        try {
            FileWriter fw = new FileWriter(new File("myNotesAppend.txt"),true);
            fw.append(note+"\n");
            fw.close();
        } catch (IOException e) {
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
        fo.appendNote("Nauka OOP");
        fo.appendNote("Nauka enums");
    }
}
