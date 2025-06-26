import io.github.bonigarcia.wdm.WebDriverManager;
import org.jspecify.annotations.Nullable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;


import java.util.List;
import java.util.Set;


public class SelTestTutorialPointCheck {

    private WebDriver ovladac;

    @BeforeEach
    public void  setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\adamv\\Desktop\\Selenium\\src\\main\\resources\\chromedriver.exe");
        ovladac = new ChromeDriver();

        //Alternativne nastavenie - Automaticke sprava webdriveru
        //WebDriverManager.chromedriver().setup();
        //ovladac = new ChromeDriver();

    }

    @AfterEach
    public void tearDown(){
        ovladac.quit();
    }


    @Test
    public void CheckBoxTest(){
        //Prepnutie na stranku
        ovladac.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");

        //Najdenie objektu
        ovladac.findElement(By.xpath("//*[@id=\"bs_1\"]/span[1]")).click();

        //Kliknutie na checkboxy
        ovladac.findElement(By.id("c_bf_1")).click();
        ovladac.findElement(By.id("c_bf_2")).click();
        //Kontrola ci je hlavne pole zaskrtnute
        assertTrue(ovladac.findElement(By.id("c_bs_1")).isSelected());
        ovladac.findElement(By.id("c_bf_1")).click();
        //Kontrola ci je hlavne pole odskrtnute
        assertFalse(ovladac.findElement(By.id("c_bs_1")).isSelected());


    }

}


