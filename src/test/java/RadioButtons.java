import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
  public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    String pageURL = "https://formy-project.herokuapp.com/radiobutton";
    driver.get(pageURL);

    WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
    radioButton1.click();

    WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
    radioButton2.click();

    WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
//    WebElement radioButton3 = driver.findElement(By.cssSelector("input[value='option3']"));
    radioButton3.click();

    driver.quit();

  }
}
