package IntroToWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Answer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver(); // Create a new instance of the Chrome driver

		driver.navigate().to("https://www.demoblaze.com/"); // Navigate to the website

		driver.manage().window().maximize();  // Maximize the window

		String pageTitle = driver.getTitle(); // Get the title of the page

		System.out.println("Title of the page : " + pageTitle); // Print the title of the page

		// Verify the title and print the appropriate message
		if (pageTitle.equals("STORE")) {
			System.out.println("Page landed on correct website");
		} else {
			System.out.println("Page not landed on correct website");

		}

		driver.quit(); // Close the browser
	}

}
