package singleton;

public class App {
    public static void main(String []args){
        Database db = Database.getInstance();
        db.query("Selection ...");
        Database db2 = Database.getInstance();
        db2.query("Selection ....");
        System.out.println(db.getConnection());
        System.out.println(db2.getConnection());

    }
}
