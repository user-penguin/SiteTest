package driver;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DriverTest {
    @Test
    public void testConnectionTest () {
        Driver driver = new Driver("http://192.168.43.28:3000");
        assertTrue(driver.checkConnection());
    }

    @Test
    public void testAuthorization () {
        Driver driver = new Driver("http://192.168.43.28:3000");
        driver.makeAuthorization();
        String title = driver.getTitle();
        assertEquals(title, "СТО");
    }

    @Test
    public void nonFullAddingServiceList () {
        Driver driver = new Driver("http://192.168.43.28:3000");
        driver.makeAuthorization();
        driver.goToNewServiceList();
        driver.inputDriverCard();
        driver.inputCarNumber();
        driver.inputDescription();
        driver.inputMarkdown();
        driver.addService();
        driver.save();
        assertTrue(driver.checkAdding());
    }
}
