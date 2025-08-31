import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
    }

    @Test
    public void testValidLogin() {
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("loginBtn"));

        username.sendKeys("testuser");
        password.sendKeys("password123");
        loginBtn.click();

        String expectedUrl = "https://example.com/dashboard";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Login failed!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
