import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Dropdown {
  public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    String pageURL = "https://formy-project.herokuapp.com/dropdown";
    driver.get(pageURL);

    WebElement dropdownMenu = driver.findElement(By.id("dropdownMenuButton"));
    dropdownMenu.click();

    // Click on single item
//    WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
//    autocompleteItem.click();

    // Click on any item from the list
    List<WebElement> dropdownItems = driver.findElements(By.cssSelector("div[aria-labelledby='dropdownMenuButton'] .dropdown-item"));

    String searchTerm = "Key and Mouse Press";

    for (WebElement dropdownItem : dropdownItems) {
      if (dropdownItem.getText().equalsIgnoreCase(searchTerm)) {
        dropdownItem.click();
      }
    }

    driver.quit();

  }

}
