package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private WebDriver webDriver;

    public Driver (String url) {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        this.webDriver = new ChromeDriver();
        this.webDriver.get(url);
    }

    public boolean checkConnection () {
        return webDriver.getTitle() != null || webDriver.getTitle().length() > 0;
    }

    // @TODO создать процедуру авторизации
    public void makeAuthorization() {

    }

    // @TODO реализовать получение тайтла выбранной страницы
    public String getTitle() {
        return "СТО";
    }
}
