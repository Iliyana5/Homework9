
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class DemoJUNIT {
    public static WebDriver driver;

    @BeforeClass
    public static void Setup() {
        System.setProperty("webdriver.chrome.driver", "/D://chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.abv.bg/");
        driver.manage().window().maximize();
    }



    @Test
     public void UserCredentials() {
        System.setProperty("webdriver.chrome.driver", "/D://chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.abv.bg/");
        driver.findElement(By.id("username")).sendKeys("John");
        Assert.assertEquals("John", driver.findElement(By.id("username")).getText());
        System.out.println(driver.findElement(By.id("username")).getText());
        driver.findElement(By.id("password")).sendKeys("898989");
        Assert.assertEquals("898989", driver.findElement(By.id("password")).getText());
        System.out.println(driver.findElement(By.id("password")).getText());
        driver.findElement(By.id("loginBut")).click();
        String actualUrL = "https://www.abv.bg/";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrL);
        Assert.assertTrue(driver.findElement(By.id("loginBut")).isSelected());
        System.out.println(driver.findElement(By.id("loginBut")).isSelected());
     }



     @AfterClass
     public static void Closeup(){
        driver.close();
     }
        }


















