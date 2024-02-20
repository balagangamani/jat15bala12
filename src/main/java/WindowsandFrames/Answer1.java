package WindowsandFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Answer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver(); // Launch the Browser

		driver.navigate().to("https://the-internet.herokuapp.com/iframe"); // Load the URL

		driver.manage().window().maximize(); // Maximize the window

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // // Wait for the browser to be visible

		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")); // Switch to the iframe

		driver.switchTo().frame(iframe);

		// Interact with elements inside the iframe
		WebElement pElement = driver.findElement(By.tagName("p"));
		System.out.println("Text before sending keys: " + pElement.getText());
		pElement.clear();
		pElement.sendKeys("Hello People");

		// Retrieving text from the paragraph element
		String text = "Hello People";
		System.out.println("Text after sending keys: " + text);

		// Finally, close the browser
		driver.quit();

	}

}
