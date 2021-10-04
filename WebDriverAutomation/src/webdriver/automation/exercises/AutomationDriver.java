package webdriver.automation.exercises;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AutomationDriver {

	/*
	 * Function Name : exerciseOne Arguments : WebDriver element Date : 01/10/2021
	 */

	public static void exerciseOne(WebDriver driver) throws InterruptedException {

		// for selecting radio button1
		driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[1]/input")).click();
		Assert.assertTrue(
				driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[1]/input")).isSelected());
		Thread.sleep(1200L);

		// for selecting radio button2
		driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[2]/input")).click();
		Assert.assertTrue(
				driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[2]/input")).isSelected());
		Thread.sleep(1200L);

		// for selecting radio button3
		driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[3]/input")).click();
		Assert.assertTrue(
				driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[3]/input")).isSelected());
		Thread.sleep(1200L);

		// closing driver
		driver.close();
	}

	/*
	 * Function Name : exerciseTwo Arguments : WebDriver element Date : 01/10/2021
	 */

	public static void exerciseTwo(WebDriver driver) throws InterruptedException {

		// for selecting radio button1
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("United States");
		Thread.sleep(1200L);

		List<WebElement> countryLists = driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));

		for (WebElement countryList : countryLists) {
			if (countryList.getText().toString().equalsIgnoreCase("United States Minor Outlying Islands")) {
				countryList.click();
				Thread.sleep(1500L);
				break;
			}
		}
		// closing driver
		driver.close();
	}

	/*
	 * Function Name : exerciseTwo Arguments : WebDriver element Date : 01/10/2021
	 */

	public static void exerciseThree(WebDriver driver) throws InterruptedException {

		WebElement selectDropdwn = driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
		Select options = new Select(selectDropdwn);
		selectDropdwn.click();
		Thread.sleep(1200L);
		options.selectByIndex(1);
		Thread.sleep(1200L);
		selectDropdwn.click();
		Thread.sleep(1200L);
		selectDropdwn.click();
		options.selectByIndex(2);
		Thread.sleep(1200L);
		selectDropdwn.click();
		Thread.sleep(1200L);
		selectDropdwn.click();
		options.selectByIndex(3);
		Thread.sleep(1200L);
		selectDropdwn.click();
		Thread.sleep(1200L);
		selectDropdwn.click();
	}

	/*
	 * Function Name : exerciseTwo Arguments : WebDriver element Date : 01/10/2021
	 */

	public static void exerciseFour(WebDriver driver) throws InterruptedException {

		// for selecting checkbox1
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Thread.sleep(500L);
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Thread.sleep(500L);

		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

		// for selecting checkbox1
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		Thread.sleep(500L);
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		Thread.sleep(500L);

		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());

		// for selecting checkbox1
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Thread.sleep(500L);
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Thread.sleep(500L);

		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected());

		// closing driver
		driver.close();
	}

	/*
	 * Function Name : exerciseFourPointOne Arguments : WebDriver element Date :
	 * 01/10/2021
	 */

	public static void exerciseFourPointOne(WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected());
	}

	/*
	 * Function Name : exerciseFourPointTwo Arguments : WebDriver element Date :
	 * 01/10/2021
	 */

	public static void exerciseFourPointTwo(WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected());
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H:\\\\Downloads\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// URL in the browser
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// calling exercise1 method
		// try {
		// AutomationDriver.exerciseOne(driver);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		// calling exercise2 method
		// try {
		// AutomationDriver.exerciseTwo(driver);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		// calling exercise3 method
		 try {
		 AutomationDriver.exerciseThree(driver);
		 } catch (InterruptedException e) {
		 e.printStackTrace();
		 }

		// calling exercise4 method
		// try {
		// AutomationDriver.exerciseFour(driver);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		// calling exerciseFourPointOne method
		//AutomationDriver.exerciseFourPointOne(driver);

		// calling exerciseFourPointTwo method
		//AutomationDriver.exerciseFourPointTwo(driver);
	}
}