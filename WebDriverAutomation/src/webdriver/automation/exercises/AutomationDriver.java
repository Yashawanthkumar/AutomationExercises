package webdriver.automation.exercises;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.Assertion;

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
		Thread.sleep(1200L);
	}

	/*
	 * Function Name : exerciseThree Arguments : WebDriver element Date : 01/10/2021
	 */

	public static void exerciseThree(WebDriver driver) throws InterruptedException {

		WebElement selectDropdown = driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
		Select options = new Select(selectDropdown);
		selectDropdown.click();
		Thread.sleep(1200L);
		options.selectByIndex(1);
		Thread.sleep(1200L);
		selectDropdown.click();
		Thread.sleep(1200L);
		selectDropdown.click();
		options.selectByIndex(2);
		Thread.sleep(1200L);
		selectDropdown.click();
		Thread.sleep(1200L);
		selectDropdown.click();
		options.selectByIndex(3);
		Thread.sleep(1200L);
		selectDropdown.click();
		Thread.sleep(1200L);
		selectDropdown.click();
	}

	/*
	 * Function Name : exerciseFour Arguments : WebDriver element Date : 01/10/2021
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
	}

	/*
	 * Function Name : exerciseFourPointOne Arguments : WebDriver element Date :
	 * 01/10/2021
	 */

	public static void exerciseFourPointOne(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected());
		Thread.sleep(1200L);
	}

	/*
	 * Function Name : exerc
	 * iseFourPointTwo Arguments : WebDriver element Date :
	 * 01/10/2021
	 */

	public static void exerciseFourPointTwo(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected());
		Thread.sleep(1200L);
	}

	/*
	 * Function Name : exerciseFive Arguments : WebDriver element Date : 01/10/2021
	 */

	public static void exerciseFive(WebDriver driver) throws InterruptedException {

		driver.findElement(By.cssSelector("button[id='openwindow']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String parentId = itr.next();
		String childId = itr.next();
		driver.switchTo().window(childId);
		Thread.sleep(3000L);
		driver.close();
		driver.switchTo().window(parentId);
		Assert.assertTrue(driver.getTitle().equals("Practice Page"));
		Thread.sleep(3000L);
	}

	/*
	 * Function Name : exerciseSix Arguments : WebDriver element Date : 01/10/2021
	 */

	public static void exerciseSix(WebDriver driver) throws InterruptedException {

		Actions keyPress = new Actions(driver);

		keyPress.moveToElement(driver.findElement(By.xpath("//a[@id='opentab']"))).keyDown(Keys.CONTROL).click().build()
				.perform();
		Set<String> windows = driver.getWindowHandles();

		Iterator<String> itr = windows.iterator();

		// Storing Parent Id
		String parentId = itr.next();

		// Storing Child Id
		String childId = itr.next();

		// Switching from parent to child tab
		driver.switchTo().window(childId);

		Assert.assertTrue(driver.getTitle().contains("Rahul Shetty Academy"));
		Thread.sleep(2000L);

		driver.close();

		Thread.sleep(2000L);
		// Returning back to parent tab(original tab)

		driver.switchTo().window(parentId);
		Assert.assertTrue(driver.getTitle().contains("Practice Page"));
		Thread.sleep(1200L);
	}

	/*
	 * Function Name : exerciseSeven Arguments : WebDriver element Date : 01/10/2021
	 */

	public static void exerciseSeven(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Yashawantkumar");
		Thread.sleep(1200L);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000L);
		driver.switchTo().alert().accept();
		Thread.sleep(1200L);
	}

	/*
	 * Function Name : exerciseEight Arguments : WebDriver element Date : 01/10/2021
	 */

	public static void exerciseEight(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,680)");
		
		int numOfDataFields=driver.findElements(By.xpath("//table[@class=\"table-display\"]/tbody/tr/td")).size();
		List<WebElement> dataFields=driver.findElements(By.xpath("//table[@class=\"table-display\"]/tbody/tr/td"));
		for(int i=0;i<numOfDataFields;i++)
		{
			Assert.assertFalse(dataFields.get(i).getText().toString().isEmpty());
		}
	}

	/*
	 * Function Name : exerciseNine Arguments : WebDriver element Date : 01/10/2021
	 */

	public static void exerciseNine(WebDriver driver) throws InterruptedException {
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		a.moveToElement(driver.findElement(By.xpath("//button[@id='mousehover']"))).click().build().perform();
		Thread.sleep(3000);
		a.moveToElement(driver.findElement(By.cssSelector("a[href='#top']"))).click().build().perform();
		Thread.sleep(1200L);
	}

	/*
	 * Function name: main() Created on: 01-10-2021 Creator:Yashawantkumar
	 */
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H:\\\\Downloads\\\\chromedriver.exe");

		// creating WebDriver object
		WebDriver driver = new ChromeDriver();

		// maximize the screen
		driver.manage().window().maximize();

		// URL in the browser
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		try {

			// calling exerciseOne method
			AutomationDriver.exerciseOne(driver);

			// calling exerciseTwo method
			AutomationDriver.exerciseTwo(driver);

			// calling exerciseThree method
			AutomationDriver.exerciseThree(driver);

			// calling exerciseFour method
			AutomationDriver.exerciseFour(driver);

			// calling exerciseFourPointOne method
			AutomationDriver.exerciseFourPointOne(driver);

			// calling exerciseFourPointTwo method
			AutomationDriver.exerciseFourPointTwo(driver);

			// calling exerciseFive method
			AutomationDriver.exerciseFive(driver);

			// calling exerciseSix method
			AutomationDriver.exerciseSix(driver);

			// calling exerciseSeven method
			AutomationDriver.exerciseSeven(driver);

			// calling exerciseEight method
			AutomationDriver.exerciseEight(driver);

			// calling exerciseNine method
			AutomationDriver.exerciseNine(driver);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}