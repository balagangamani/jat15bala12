package SeleniumMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class Answer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver(); // Launch Browser

		driver.navigate().to("https://jqueryui.com/droppable/"); // Load URL

		driver.manage().window().maximize(); // Maximize window

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Wait for the browser to be visible

		// Navigate to the iframe and perform operations within it

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']")); // By xpath

		driver.switchTo().frame(frame);

		WebElement source = driver.findElement(By.id("draggable"));

		WebElement dest = driver.findElement(By.id("droppable"));

		Actions mouse = new Actions(driver);
		mouse.dragAndDrop(source, dest).perform();

		// Get the CSS value for the background color of the destination element

		String cssValue = dest.getCssValue("background-color");

		// Convert the CSS value to a hex value using Selenium's Color class

		String hexColor = Color.fromString(cssValue).asHex();

		System.out.println("Background color: " + hexColor); // Get Background color

		System.out.println(dest.getText()); // Get text

		driver.quit(); // Close the browser

	}

}
