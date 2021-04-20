package maps;

import oop.User;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class MapsIteration {
    Map<String, String> initMap  = new HashMap<String, String>() {{
        put("key1", "value1");
        put("key2", "value2");
    }};
    private static Map<Integer, User> usersMap = new HashMap<>() {{
        put(1, new User("a","a@a","aaa", LocalDate.of(2000,1,1)));
        put(2, new User("b","a@a","aaa", LocalDate.of(2000,1,1)));
        put(3, new User("c","a@a","aaa", LocalDate.of(2000,1,1)));
        put(4, new User("d","a@a","aaa", LocalDate.of(2000,1,1)));
    }};
    public static void main(String[] args) {
        Map<String, Integer> romanToNumeric = new HashMap<>();
        romanToNumeric.put("0",0);
        romanToNumeric.put("I",1);
        romanToNumeric.put("II",2);
        romanToNumeric.put("III",3);
        romanToNumeric.put("IV",4);
        romanToNumeric.put("V",5);
        romanToNumeric.put("VI",6);
        romanToNumeric.put("VII",7);
        romanToNumeric.put("VIII",8);
        romanToNumeric.put("IX",9);
        System.out.printf("%s to %d\n", "II", romanToNumeric.get("II"));
        for(String key : romanToNumeric.keySet()){
            System.out.printf("| %-4s | %1d |\n", key, romanToNumeric.get(key));
        }
        for(Integer id : usersMap.keySet()){
            System.out.printf("| %-1s | %-10s | %-10s |\n",
                    id, usersMap.get(id).getLogin(), usersMap.get(id).getEmail());
        }
        System.out.println(romanToNumeric.keySet());
        System.out.println(romanToNumeric.values());
        System.out.println(romanToNumeric);
    }
}
