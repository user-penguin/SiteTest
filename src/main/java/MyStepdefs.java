import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.Driver;
import org.junit.Assert;

public class MyStepdefs {
    private Driver driver;
    private int numberServiceList;

    @Given("^У меня есть класс Driver$")
    public void уМеняЕстьКлассDriver() {
        driver = new Driver();
    }

    @When("^Я создаю драйвер для сайта \"([^\"]*)\"$")
    public void яСоздаюДрайверДляСайта(String path) {
        driver = new Driver(path);
    }

    @And("^Я прохожу регистрацию$")
    public void яПрохожуРегистрацию() {
        driver.makeAuthorization();
    }

    @And("^Я создаю новый сервис лист$")
    public void яСоздаюНовыйСервисЛист() {
        driver.goToNewServiceList();

    }

    @And("^Я запоминаю номер сервисного листа$")
    public void яЗапоминаюНомерСервисногоЛиста() {
        this.numberServiceList = driver.getNumber();
    }

    @And("^Я ввожу номер водительского удостоверения$")
    public void яВвожуНомерВодительскогоУдостоверения() {
        driver.inputDriverCard();
    }

    @And("^Я ввожу номер машины$")
    public void яВвожуНомерМашины() {
        driver.inputCarNumber();
    }

    @And("^Я подтверждаю сервис лист$")
    public void яПодтверждаюСервисЛист() {
        driver.save();
    }

    @Then("^Я нахожу запись с нужным id$")
    public void яНахожуЗаписьСНужнымId() {
        Assert.assertTrue(driver.findLineById(this.numberServiceList));
    }
}
