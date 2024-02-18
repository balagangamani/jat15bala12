package SeleniumWebComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Answer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize the WebDriver instance using ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to the URL
		driver.navigate().to("https://www.guvi.in/");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Wait for the browser to be visible
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Click on the "Sign Up" button
		driver.findElement(By.linkText("Sign up")).click();

		// Locate the "Full Name" element by xpath
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ganesh Kumar");

		// Locate the "Enter email" element by id
		driver.findElement(By.id("email")).sendKeys("pk98224728@gmail.com");

		// Locate the "Enter Password" element by xpath
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Cintri890@");

		// Locate the "Mobile Number" element by cssSelector
		driver.findElement(By.cssSelector("input#mobileNumber")).sendKeys("9848675434");

		// Click on the "Sign Up" button
		driver.findElement(By.linkText("Sign Up")).click();

		driver.getTitle(); // Get the title of the page

		System.out.println("User Registered successfully");

		// Click on the "Login" button
		driver.findElement(By.className("login")).click();

		// Locate the "Enter email" element by id
		driver.findElement(By.id("email")).sendKeys("pk98224728@gmail.com");

		// Locate the "Enter Password" element by xpath
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Cintri890@");

		// Click on the "Login" button
		driver.findElement(By.id("login-btn")).click();

		driver.getTitle(); // Get the title of the page

		System.out.println("Logged In successfully");

		// Close the browser
		driver.quit();

	}

}
