import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestClass {
    @Test
    public void init(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/shop/");
        driver.manage().window().maximize();

//        String myAccountLink = "//a[normalize-space()='My Account']";

        WebElement myAccountLink = driver.findElement(By.xpath("//a[normalize-space()='My Account']"));
        myAccountLink.click();

        WebElement emailAdressField = driver.findElement(By.xpath("//input[@id='reg_email']"));
        emailAdressField.sendKeys("imsdhk11@gmail.com");

        WebElement passwordField = driver.findElement(By.xpath("//input[@id='reg_password']"));
        passwordField.sendKeys("Al@sna123");

        WebElement regButton = driver.findElement(By.xpath("//input[@name='register']"));
        regButton.click();

        driver.quit();
    }
}