package designpatterns.singletonttest;

import com.ranguht.code.javabasics.designpatterns.singleton.NetworkConnection;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NetworkConnectionTests {

    @Test
    public void verifySingleton(){
        NetworkConnection connection = NetworkConnection.getConnection();
        NetworkConnection anotherConnection = NetworkConnection.getConnection();
        Assert.assertEquals(connection, anotherConnection, "Both connections are different");
    }
}