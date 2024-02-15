package SeleniumMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Answer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver(); // Launch Browser

		driver.navigate().to("https://www.facebook.com/"); // Load URL

		driver.manage().window().maximize(); // Maximize window

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Wait for the browser to be visible

		// Click on the "Create new account" button

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		driver.findElement(By.name("firstname")).sendKeys("Pavan Kumar", Keys.ENTER); // Enter the "FirstName"

		driver.findElement(By.name("lastname")).sendKeys("Bochkar", Keys.ENTER); // Enter the "LastName"

		// Enter an email address

		driver.findElement(By.name("reg_email__")).sendKeys("pavankumarbochkar456@gmail.com", Keys.ENTER);

		// Confirm the email address

		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("pavankumarbochkar456@gmail.com", Keys.ENTER);

		driver.findElement(By.name("reg_passwd__")).sendKeys("Country67#", Keys.ENTER); // Enter a strong password

		driver.findElement(By.id("age_to_birthday_link")).click(); // click on the "Use Birthday" option

		// Select method is used to select Date of Birth

		WebElement day = driver.findElement(By.name("birthday_day"));

		Select sel = new Select(day);
		sel.selectByVisibleText("11"); // Select Day

		WebElement month = driver.findElement(By.name("birthday_month"));

		Select sel1 = new Select(month);
		sel1.selectByVisibleText("May"); // Select Month

		WebElement year = driver.findElement(By.name("birthday_year"));

		Select sel2 = new Select(year);
		sel2.selectByVisibleText("1985"); // Select Year

		WebElement genderRadio = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		genderRadio.click(); // Select the gender

		driver.findElement(By.name("websubmit")).click(); // Click on the "Sign Up" button

		driver.quit(); // Close the browser

	}

}
