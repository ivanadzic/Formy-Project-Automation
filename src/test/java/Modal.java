import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modal {
  public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    String pageURL = "https://formy-project.herokuapp.com/modal";
    driver.get(pageURL);

    WebElement modalButton = driver.findElement(By.id("modal-button"));
    modalButton.click();

    WebElement closeButton = driver.findElement(By.id("close-button"));

    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click;", closeButton);

    driver.quit();

  }
}
