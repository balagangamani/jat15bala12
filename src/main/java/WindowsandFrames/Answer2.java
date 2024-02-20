package WindowsandFrames;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Answer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver(); // Launch the Browser

		driver.navigate().to("https://the-internet.herokuapp.com/windows"); // Load the URL

		driver.manage().window().maximize(); // Maximize the window

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // // Wait for the browser to be visible

		driver.findElement(By.linkText("Click Here")).click(); // Click the "Click Here" button to open a new window

		String originalwindow = driver.getWindowHandle(); // Store the current window handle for future reference
		
		System.out.println("Original Window Title is: " + driver.getTitle()); // print the Title

		// Switch to the newly opened window
		for (String windowHandle : driver.getWindowHandles()) {
			if (!originalwindow.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		// Verify that the text "New Window" is present on the page
		WebElement newWindowText = driver.findElement(By.xpath("//h3[contains(text(), 'New Window')]"));
		if (newWindowText.getText().equals("New Window")) {
			System.out.println("Text 'New Window' is present on the page.");
		} else {
			System.out.println("Text 'New Window' is NOT present on the page.");
		}

		// Close the new window
		driver.close();

		// Verify that the original window is active
		driver.switchTo().window(originalwindow);

		// Close the browser instance
		driver.quit();

	}

}
