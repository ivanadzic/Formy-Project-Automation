import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.ConfirmationPage;
import pages.FormPage;

import java.time.Duration;

public class CompleteWebForm {
  public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    String pageURL = "https://formy-project.herokuapp.com/form";
    driver.get(pageURL);

    FormPage formPage = new FormPage();
    formPage.submitForm(driver);

    ConfirmationPage confirmationPage = new ConfirmationPage();
    confirmationPage.waitForAlertBanner(driver);

    Assert.assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

    driver.quit();

  }
}
