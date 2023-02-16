package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
  public static void submitForm(WebDriver driver) {
    WebElement firstNameField = driver.findElement(By.id("first-name"));
    firstNameField.sendKeys("John");

    WebElement lastNameField = driver.findElement(By.id("last-name"));
    lastNameField.sendKeys("Doe");

    WebElement jobTitle = driver.findElement(By.id("job-title"));
    jobTitle.sendKeys("QA Specialist");

    WebElement educationButton = driver.findElement(By.id("radio-button-1"));
    educationButton.click();

    WebElement sexCheckBox = driver.findElement(By.id("checkbox-1"));
    sexCheckBox.click();

    WebElement experienceDropdown = driver.findElement(By.id("select-menu"));
    experienceDropdown.click();

    WebElement experiencetValue = driver.findElement(By.cssSelector("option[value='1']"));
    experiencetValue.click();

    WebElement datePicker = driver.findElement(By.id("datepicker"));
    datePicker.sendKeys("01/01/2022");

    datePicker.sendKeys(Keys.RETURN);

    WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
    submitButton.click();
  }
}
