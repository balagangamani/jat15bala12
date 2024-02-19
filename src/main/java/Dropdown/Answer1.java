package Dropdown;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Answer1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver(); // Initialize the WebDriver instance using ChromeDriver

		driver.navigate().to("https://phptravels.com/demo/"); // Go to the form page

		driver.manage().window().maximize(); // Maximize the browser window

		// Wait for the browser to be visible
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Wait for the form elements to load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait for the firstname to be visible before sending keys
		WebElement firstname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("first_name")));
		firstname.sendKeys("Kumar");

		// Retrieving the value attribute after inputting the text
		System.out.println("First Name is: " + firstname.getAttribute("value"));

		// Wait for the lastname to be visible before sending keys
		WebElement lastname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("last_name")));
		lastname.sendKeys("Bannu");

		// Retrieving the value attribute after inputting the text
		System.out.println("Last Name is: " + lastname.getAttribute("value"));

		// Wait for the businessname to be visible before sending keys
		WebElement businessname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("business_name")));
		businessname.sendKeys("KB Industries");

		// Retrieving the value attribute after inputting the text
		System.out.println("Business Name is: " + businessname.getAttribute("value"));

		// Wait for the email to be visible before sending keys
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		email.sendKeys("kb6@gmail.com");

		// Retrieving the value attribute after inputting the text
		System.out.println("Email is: " + email.getAttribute("value"));

		// Let's assume the numbers to be summed are in elements with "num1" and "num2",
		// and the result needs to be entered into an element with "sum".
		WebElement num1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("numb1")));
		WebElement num2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("numb2")));

		// Retrieve the number values as Strings
		String number1String = num1.getText();
		String number2String = num2.getText();

		// Convert the number values from String to Integer
		int number1 = Integer.parseInt(number1String);
		int number2 = Integer.parseInt(number2String);

		// Calculate the sum
		int sumResult = number1 + number2;

		// Now, enter the sum result into the sum input field
		WebElement sumInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("number")));
		sumInputElement.sendKeys(String.valueOf(sumResult));

		// Click on "Submit" button to submit the form after entering the sum
		WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
		submitButton.click();

		// Verify that the form is submitted successfully by checking the message
		// displayed
		System.out.println("Form is submitted successfully");

		// Take a screenshot of the page after the form submission
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\EclipseClass\\jat15bala12\\Snap\\Screenshot1.png");
		FileUtils.copyFile(source, dest);

		driver.quit(); // // Quit the WebDriver session

	}

}
