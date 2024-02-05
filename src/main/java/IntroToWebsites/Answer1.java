package IntroToWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Answer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver(); // Launch the Browser

		driver.manage().window().maximize(); // Maximize the browser window

		driver.navigate().to("http://google.com"); // Pass the URL and navigate to Google

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL : " + currentUrl); // Get and print the current URL

		driver.navigate().refresh(); // Refresh the page

		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL : " + currentUrl); // Get and print the current URL after refresh

		driver.close(); // Close the browser

	}

}
