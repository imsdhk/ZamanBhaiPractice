import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseClass {

    WebDriver driver;

    public BaseClass(WebDriver driver){
    this.driver = driver;
    }

    public void clickElement(String attribute, String param, String paramValue){
        driver.findElement(By.xpath("//" + attribute + "[@" + param + "='"+ paramValue + "']")).click();
    }

    public void insertText(String attribute, String param, String paramValue, String text){
        driver.findElement(By.xpath("//" + attribute + "[@" + param + "='"+ paramValue + "']")).sendKeys(text);
    }
}
