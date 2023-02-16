import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
  public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    String pageURL = "https://formy-project.herokuapp.com/datepicker";
    driver.get(pageURL);

    WebElement dateField = driver.findElement(By.id("datepicker"));
    dateField.sendKeys("01/01/2023");
    dateField.sendKeys(Keys.RETURN);

    driver.quit();

  }
}
