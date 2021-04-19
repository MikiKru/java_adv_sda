package abstractClasses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class DatabaseConnector {
    public static Object[] records = new Object[10];

    private String database;
    private String userName;
    private String password;
    private boolean isConnected;
    // 1. metoda wyświetlająca dane dotyczące połączenia z bazą danych i zwracająca obiekt połączenia
    // -> nazwa -> connect
    // -> argumenty -> database, userName, password
    // -> jeżeli database && userName && password != null to isConnected -> true
    // -> w przeciwnym przypadku -> false
    public boolean connect(String database, String userName, String password){
        if(database != null && userName != null && password != null){
            isConnected = true;
        }
        return isConnected;
    }
    // 2. metoda abstrakcyjna close() do zamykania połączenia
    public abstract void close();
    // 3. metoda abstrakcyjna do wprowadzania nowych rekordów (obiektów)
    public abstract void insert(Object o);
    // 4. metoda abstrakcyjna do zwracania wszystkich (tablicy) rekordów (obiektów) z tabeli db
    public abstract Object [] select();


}
