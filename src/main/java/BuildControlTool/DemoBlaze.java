package BuildControlTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) {
		// Initialize the WebDriver with ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to the website
		driver.navigate().to("https://demoblaze.com/index.html#");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Click on "Laptops" category
		driver.findElement(By.linkText("Laptops")).click();

		// Assuming the goal is to click the first laptop link, wait a bit for elements
		// to appear (better with explicit waits)
		try {
			Thread.sleep(2000); // Not recommended for production use, consider using WebDriverWait instead
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Find the first laptop link. This assumes the first laptop link can be
		// uniquely identified by its href attribute containing 'prod.html'
		WebElement firstLaptopLink = driver.findElement(By.cssSelector("a[href*='prod.html'][class='hrefch']"));
		firstLaptopLink.click();

		// Add a delay to ensure the product page loads, again better with explicit
		// waits
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Click on "Add to cart"
		driver.findElement(By.linkText("Add to cart")).click();

		// Cleanup by closing the browser
		driver.quit();

	}
}
