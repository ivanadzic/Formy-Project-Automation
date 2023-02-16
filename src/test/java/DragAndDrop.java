import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    String pageURL = "https://formy-project.herokuapp.com/dragdrop";
    driver.get(pageURL);

    WebElement image = driver.findElement(By.id("image"));

    WebElement box = driver.findElement(By.id("box"));

    Actions actions = new Actions(driver);
    actions.dragAndDrop(image, box).build().perform();

    Thread.sleep(1500);

    driver.quit();

  }
}
