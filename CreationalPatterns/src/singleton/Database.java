package singleton;

public class Database {

    private static Database database;
    private boolean connection;
    private Database(){
        connection=true;
        

    }

    public static Database getInstance(){
        if(database == null){
            database = new Database();
        }
        return database;
    }

    public boolean getConnection(){
        return connection;
    }
    public void query(String sql){
        System.out.println("Executing query: " + sql);
        //throttling or caching logic
    }
}
