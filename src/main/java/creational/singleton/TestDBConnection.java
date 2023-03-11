package creational.singleton;

public class TestDBConnection {

    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
        dbConnection.testConnection();
    }
}
