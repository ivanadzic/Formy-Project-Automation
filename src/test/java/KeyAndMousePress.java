import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyAndMousePress {
  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    String pageURL = "https://formy-project.herokuapp.com/keypress";
    driver.get(pageURL);

    WebElement inputField = driver.findElement(By.id("name"));
    inputField.click();
    inputField.sendKeys("My Name");

    WebElement button = driver.findElement(By.id("button"));
    button.click();

    driver.quit();
  }




}
