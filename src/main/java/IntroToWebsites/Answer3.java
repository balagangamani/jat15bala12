package IntroToWebsites;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Answer3 {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver(); // Create a new instance of the Chrome driver

		driver.manage().window().maximize(); // Maximize the window

		driver.get("https://www.wikipedia.org/"); // Navigate to wikipedia page

		WebElement searchInput = driver.findElement(By.id("searchInput")); // Searching for "Artificial Intelligence":
		searchInput.sendKeys("Artificial Intelligence" + Keys.ENTER);

		// Find the History link and click on it directly without waiting
		WebElement historyLink = driver.findElement(By.partialLinkText("History"));
		historyLink.click();

		// Find the title of the History section directly without waiting
		// Note that if the page has not loaded the History section yet, this may fail
		WebElement sectionTitle = driver.findElement(By.xpath("//a[contains(text(), 'History')]"));
		// Print the title of the section
		System.out.println("Title of the section: " + sectionTitle.getText());

		driver.quit(); // Close the browser

	}

}
