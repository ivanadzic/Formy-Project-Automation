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

//    submitForm(driver);

    ConfirmationPage confirmationPage = new ConfirmationPage();
    confirmationPage.waitForAlertBanner(driver);

//    waitForAlertBanner(driver);

    Assert.assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

    driver.quit();

  }

//  public static void submitForm(WebDriver driver) {
//    WebElement firstNameField = driver.findElement(By.id("first-name"));
//    firstNameField.sendKeys("John");
//
//    WebElement lastNameField = driver.findElement(By.id("last-name"));
//    lastNameField.sendKeys("Doe");
//
//    WebElement jobTitle = driver.findElement(By.id("job-title"));
//    jobTitle.sendKeys("QA Specialist");
//
//    WebElement educationButton = driver.findElement(By.id("radio-button-1"));
//    educationButton.click();
//
//    WebElement sexCheckBox = driver.findElement(By.id("checkbox-1"));
//    sexCheckBox.click();
//
//    WebElement experienceDropdown = driver.findElement(By.id("select-menu"));
//    experienceDropdown.click();
//
//    WebElement experiencetValue = driver.findElement(By.cssSelector("option[value='1']"));
//    experiencetValue.click();
//
//    WebElement datePicker = driver.findElement(By.id("datepicker"));
//    datePicker.sendKeys("01/01/2022");
//
//    datePicker.sendKeys(Keys.RETURN);
//
//    WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
//    submitButton.click();
//  }
//
//  public static void waitForAlertBanner(WebDriver driver) {
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
//  }
//
//  public static String getAlertBannerText(WebDriver driver) {
//    return driver.findElement(By.className("alert")).getText();
//  }
}
