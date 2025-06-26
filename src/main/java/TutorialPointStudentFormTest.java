import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TutorialPointStudentFormTest {

    private WebDriver ovladac;
    @Before
    public void totoNastanePredKazdymTestom(){
        WebDriverManager.chromedriver().setup();
        ovladac = new ChromeDriver();

    }
    @After
    public void totoNastanePoKazdomTeste(){
        ovladac.close();
        ovladac.quit();

    }

    @Given("Uzivatel je na stranke tutorial point student form")
    public void uzivatelJeNaStrankeTutorialPointStudentForm() {
        ovladac.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");


    }

    @When("Uzivatel zada svoje meno {string}")
    public void uzivatelZadaSvojeMeno(String meno) {
        ovladac.findElement(By.id("name")).sendKeys(meno);
    }

    @And("Uzivate zada svoj email {string}")
    public void uzivateZadaSvojEmail(String email) {
        ovladac.findElement(By.id("email")).sendKeys(email);
    }

    @And("Uzivatel klikne na pohlavie male")
    public void uzivatelKlikneNaPohlavieMale() {
            ovladac.findElement(By.id("gender")).click();

    }

    @Then("Radiobutton mail je zaskrtnuty")
    public void radiobuttonMailJeZaskrtnuty() {
        assertTrue(ovladac.findElement(By.id("gender")).isSelected());

    }


    @Then("Radiobutton mail je odskrtnuty")
    public void radiobuttonMailJeOdskrtnuty() {
        assertFalse(ovladac.findElement(By.id("gender")).isSelected());
    }

    @When("Uzivatel klikne na pohlavie female")
    public void uzivatelKlikneNaPohlavieFemale() {
        ovladac.findElement(By.xpath("//*[@id=\"practiceForm\"]/div[3]/div/div/div[2]/input")).click();
    }
}

