package exercises.ex5_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvParser {
    private List<User> users = new ArrayList<>();
    private final String PATH = Paths.get("").toAbsolutePath().toString() +
            "\\src\\main\\java\\exercises\\ex5_io\\users.csv";

    // prasowanie CSV to User
    private List<User> getUsersFromCsvFile(){
        try {
            Scanner sc = new Scanner(new File(PATH));
            List<User> returnList = new ArrayList<>();
            while(sc.hasNextLine()){
                String[] userTable = sc.nextLine().split(",");
                returnList.add(new User(userTable[0], userTable[1], Integer.valueOf(userTable[2])));
            }
            sc.close();
            return returnList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
    // parsowanie User to CSV
    private void addUserToCsvFile(User user){
        try {
            FileWriter fw = new FileWriter(PATH, true);
            fw.append(String.format("%s,%s,%d\n", user.getName(),user.getLastName(),user.getAge()));
//            fw.append(user.getName() + "," + user.getLastName() + "," + user.getAge() + "\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CsvParser csvParser = new CsvParser();
        csvParser.addUserToCsvFile(new User("Test", "Test", 20));
        csvParser.getUsersFromCsvFile().forEach(System.out::println);

    }
}
