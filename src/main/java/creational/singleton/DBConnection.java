package creational.singleton;

public class DBConnection {
    private static DBConnection dbConnection = null;

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    public void testConnection() {
        System.out.println("connection is success!");
    }
}
