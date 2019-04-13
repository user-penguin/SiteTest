package driver;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DriverTest {
    @Test
    public void testConnectionTest () {
        Driver driver = new Driver("https://kom-raz.herokuapp.com");
        assertTrue(driver.checkConnection());
    }

    @Test
    public void testAuthorization () {
        Driver driver = new Driver("https://kom-raz.herokuapp.com");
        driver.makeAuthorization();
        String title = driver.getTitle();
        assertEquals(title, "СТО");
    }

    @Test
    public void nonFullAddingServiceList () {
        Driver driver = new Driver("https://kom-raz.herokuapp.com");
        driver.makeAuthorization();
        driver.goToNewServiceList();
    }
}
