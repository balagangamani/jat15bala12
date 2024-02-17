package SeleniumLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Answer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver(); // Launch Browser

		driver.navigate().to("https://www.guvi.in/register"); // Load URL

		driver.manage().window().maximize(); // Maximize window

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Wait for the browser to be visible

		driver.findElement(By.id("name")).sendKeys("Pavan Kumar"); // Locate the "Full Name" element by id

		// Locating by Class name has 4 results, locating by Tag name has many results
		// Hence Id,cssSelector and xpath are used to locate web elements

		// Locate the "Full Name" element by cssSelector

		// driver.findElement(By.cssSelector("input#name")).sendKeys("Pavan Kumar");

		// Locate the "Full Name" element by xpath

		// driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Pavan Kumar");

		// Locate the "Enter email" element by id

		driver.findElement(By.id("email")).sendKeys("pavankumarbochkar456@gmail.com");

		// Locate the "Enter email" element by cssSelector

		// driver.findElement(By.cssSelector("input#email")).sendKeys("pavankumarbochkar456@gmail.com");

		// Locate the "Enter email" element by xpath

		// driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pavankumarbochkar456@gmail.com");

		// Locate the "Enter Password" element by id

		// driver.findElement(By.id("password")).sendKeys("Cintri890@");

		// Locate the "Enter Password" element by cssSelector

		// driver.findElement(By.cssSelector("input#password")).sendKeys("Cintri890@");

		// Locate the "Enter Password" element by xpath

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Cintri890@");

		// Locate the "Mobile Number" element by id

		// driver.findElement(By.id("mobileNumber")).sendKeys("9441349527");

		// Locate the "Mobile Number" element by cssSelector

		// driver.findElement(By.cssSelector("input#mobileNumber")).sendKeys("9441349527");

		// Locate the "Mobile Number" element by xpath

		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9441349527");

		// Click on the "Sign Up" button

		// driver.findElement(By.linkText("Sign Up")).click();

		// Click on the "Sign Up" button

		// driver.findElement(By.id("signup-btn")).click();

		// Click on the "Sign Up" button

		// driver.findElement(By.xpath("//a[text()='Sign Up']")).click();

		driver.findElement(By.cssSelector("a#signup-btn")).click(); // Click on the "Sign Up" button

		driver.quit(); // Close the browser

	}

}
