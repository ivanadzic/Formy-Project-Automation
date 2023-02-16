import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageScroll {
  public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    String pageURL = "https://formy-project.herokuapp.com/scroll";
    driver.get(pageURL);

    WebElement nameField = driver.findElement(By.id("name"));
    Actions actions = new Actions(driver);
    actions.moveToElement(nameField);
    nameField.sendKeys("Mile Dragic");

    WebElement dateField = driver.findElement(By.id("date"));
    dateField.sendKeys("02/15/2023");

    driver.quit();
  }
}
