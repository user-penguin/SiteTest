package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public void makeAuthorization() {
        WebElement usernameField = webDriver.findElement(By.id("username"));
        usernameField.click();
        usernameField.sendKeys("admin");
        WebElement passwordField = webDriver.findElement(By.id("password"));
        passwordField.click();
        passwordField.sendKeys("1");
        WebElement buttonOk = webDriver.findElement(By.cssSelector("button.btn.btn-lg.btn-primary.btn-block"));
        buttonOk.click();
    }

    public String getTitle() {
        return webDriver.getTitle();
    }

    public void goToNewServiceList() {
        WebElement addButton = webDriver.findElement(By.cssSelector("button.btn.btn-primary.btn-lg.btn-block"));
        addButton.click();
    }

    // @TODO ввод номера автомобиля
    public void inputCarNumber() {
    }


    // @TODO ввод водительского удостоверения
    public void inputDriverCard() {
    }

    // @TODO ввод описания
    public void inputDescription() {
    }

    // @TODO ввод заметки
    public void inputMarkdown() {

    }

    // @TODO add service
    public void addService() {
    }

    // @TODO сохранение и добавление
    public void save() {

    }

    // @TODO проверить редирект
    public boolean checkAdding() {
        return true;
    }
}
