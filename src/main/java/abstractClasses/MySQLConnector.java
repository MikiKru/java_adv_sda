package abstractClasses;

public class MySQLConnector extends DatabaseConnector {
    // dziedziczę metodę connect
    @Override
    public void close() {           // zamyka otwarte połączenie -> isConnected -> false i przypisuje null do parametrów połączenia
        setConnected(false);
        setDatabase(null);
        setPassword(null);
        setUserName(null);
    }
    @Override
    public void insert(Object o) {  // wporowadza rekord do tablicy rekordów gdy isConnected -> true
        if(isConnected()){
            for(int i = 0; i < DatabaseConnector.records.length; i++){
                if(DatabaseConnector.records[i] == null){
                    DatabaseConnector.records[i] = o;   // wporwadzenie rekordu
                    break;
                }
            }
        } else {
            System.out.println("Connection error!");
        }
    }
    @Override
    public Object[] select() {      // pobiera zawartość tablicy rekordów gdy isConnected -> true
        if(isConnected()){
            return DatabaseConnector.records;
        } else {
            System.out.println("Connection error!");
            return null;
        }
    }
    public static void main(String[] args) {
        DatabaseConnector db = new MySQLConnector();
        db.connect("task_manager","user", "qwe123");
        db.insert("ABC");
        db.insert("ZYZ");
        for(Object o : db.select()){
            System.out.println(o);
        }
        db.close();
    }
}
