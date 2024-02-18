package SeleniumWebComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Answer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize the WebDriver instance using ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Navigate to the URL with the datepicker
		driver.navigate().to("https://jqueryui.com/datepicker/");

		// Wait for the browser to be visible
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Switch to the iframe that contains the datepicker
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		// Open the datepicker widget
		driver.findElement(By.id("datepicker")).click();

		// Select the next month
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

		// Select the date "22"
		driver.findElement(By.xpath("//a[text()='22']")).click();

		// Store the selected date in a variable
		String selectedDate = driver.findElement(By.id("datepicker")).getAttribute("value");

		// Print the selected date to the console
		System.out.println("Selected date: " + selectedDate);

		// Quit the WebDriver session
		driver.quit();

	}

}
