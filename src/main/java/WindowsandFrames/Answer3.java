package WindowsandFrames;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Answer3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // Launch the Browser

		driver.navigate().to("https://the-internet.herokuapp.com/nested_frames"); // Load the URL

		driver.manage().window().maximize(); // Maximize the window

		// Implicit wait for the browser to be visible
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait

		// Switch to the top frame using XPath
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//frame[@name='frame-top']")));

		// Verify there are three frames on the page
		int frameCount = driver.findElements(By.xpath("//frame")).size();
		System.out.println("Number of frames in the top frame: " + frameCount);

		// Switch to the left frame using XPath
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']")));

		// Verify that the left frame has text "LEFT"
		String leftFrameText = driver.findElement(By.xpath("/html/body")).getText();
		System.out.println("Text in left frame: " + leftFrameText);

		// Switch back to the top frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));

		// Switch to the middle frame using XPath
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));

		// Verify that the middle frame has text "MIDDLE"
		String middleFrameText = driver.findElement(By.xpath("//div[@id='content']")).getText();
		System.out.println("Text in middle frame: " + middleFrameText);

		// Switch back to the top frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));

		// Switch to the right frame using XPath
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-right']")));

		// Verify that the right frame has text "RIGHT"
		String rightFrameText = driver.findElement(By.xpath("/html/body")).getText();
		System.out.println("Text in right frame: " + rightFrameText);

		// Switch back to the top frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));

		// Switch to the bottom frame using CSS Selector
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-bottom']")));

		// Verify that the bottom frame has text "BOTTOM"
		String bottomFrameText = driver.findElement(By.xpath("/html/body")).getText();
		System.out.println("Text in bottom frame: " + bottomFrameText);

		// Switch back to the main page
		driver.switchTo().defaultContent();

		// Verify that the page title is "Frames"
		String pageTitle = "Frames";
		System.out.println("Page title: " + pageTitle);

		// Close the browser
		driver.quit();
	}
}
