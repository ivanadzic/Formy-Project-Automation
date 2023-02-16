import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    String pageURL = "https://formy-project.herokuapp.com/fileupload";
    driver.get(pageURL);

    WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
    WebElement chooseButton = driver.findElement(By.className("btn-choose"));
    fileUploadField.sendKeys("file-to-upload.png");

    driver.quit();

  }

}
