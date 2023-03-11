package creational.singleton;

import org.junit.Assert;
import org.junit.Test;

public class DBConnectionTest {

    @Test
    public void getInstanceTest() {
        DBConnection dbConnection = DBConnection.getInstance();
        DBConnection dbConnection1 = DBConnection.getInstance();
        Assert.assertEquals(dbConnection.hashCode(), dbConnection1.hashCode());//same objects have same hash code
    }
}