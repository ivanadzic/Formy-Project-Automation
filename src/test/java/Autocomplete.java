import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Autocomplete {
  public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    String pageURL = "https://formy-project.herokuapp.com/autocomplete";
    driver.get(pageURL);

    WebElement autocomplete = driver.findElement(By.id("autocomplete"));
    autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
    autocompleteResult.click();

    driver.quit();
  }
}
