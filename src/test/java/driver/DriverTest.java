package driver;

import org.junit.Test;

public class DriverTest {
    @Test
    public void testConnectionTest () {
        Driver driver = new Driver("https://kom-raz.herokuapp.com/index");
        assertTrue(driver.checkConnection());
    }
}
