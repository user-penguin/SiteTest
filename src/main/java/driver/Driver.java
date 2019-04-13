package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public void inputCarNumber() {
        WebElement inputDriveCard = webDriver.findElement(By.id("inputClient"));
        inputDriveCard.click();
        inputDriveCard.sendKeys("123");
    }

    public void inputDriverCard() {
        WebElement inputDriveCard = webDriver.findElement(By.id("inputCar"));
        inputDriveCard.click();
        inputDriveCard.sendKeys("Л124АМ44");
    }

    public void inputDescription() {
        WebElement inputDescription = webDriver.findElement(By.name("inputDescription"));
        inputDescription.click();
        inputDescription.sendKeys("Замена масла, 5 литров, вязкость 5w-30, замена фильтра, mann 3456");
    }

    public void inputMarkdown() {
        WebElement inputMarkup = webDriver.findElement(By.id("inputMarkup"));
        inputMarkup.click();
        inputMarkup.sendKeys("Приехал бумер свой починить, денег опять жмёт, залить плохое масло");
    }



    public void save() {
        WebElement saveButton = webDriver.findElement(By.name("add"));
        saveButton.click();
    }

    // @TODO проверить редирект
    public boolean checkAdding() {
        return true;
    }
}
