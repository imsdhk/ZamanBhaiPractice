import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParameterXpath {
    @Test
    public void demoParam() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.get("https://automationpractice.com/");
        driver.get("https://practice.automationtesting.in/my-account/");
        driver.manage().window().maximize();

        BaseClass bc = new BaseClass(driver);
        bc.insertText("input", "id", "username", "imsdhk1@gmail.com");

        bc.insertText("input", "id", "password", "Al@sna123");

        bc.clickElement("input", "name", "login");

        System.out.println("success login");

        Thread.sleep(5000);
        driver.close();


    }
}





