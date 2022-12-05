package POM123;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POM111 {
	  Omyo obj1 = new Omyo();
	  WebDriver driver;
	  @BeforeTest
	  public void getUrl(){
	    System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.in/");
		driver.manage().window().maximize();
	  }
	  @Test ( priority = 0)
	  public void task1_VerifyINputValue() {
		 
		  WebElement text1= driver.findElement(By.id("ta1"));
		  text1.sendKeys("Muzammil Zia");
		  Assert.assertNotNull(text1);
		  WebElement text2 =driver.findElement(By.xpath("//textarea [contains(text(),'The cat was playing in the garden.')]"));
		  text2.clear();
		  text2.sendKeys("I am brave man");
		  Assert.assertNotNull(text2);
	  }
	  @Test ( priority = 1)
	  public void task2_GetTableDataAndPrintIt() {
	  
		  String table = driver.findElement(By.id("table1")).getText();
		  System.out.print(table);  	  
	  }
	  @Test ( priority = 2)
	  public void task2_LogIn() {
		  
		  driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("muzammilzia@gmail.com");  
		  driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("Abcd123");  
		  driver.findElement(By.xpath("//button[@value='LogIn']")).click();
	  }
	  @Test ( priority = 3)
	  public void task3_SwitchToFrames() {
		  
		  String tab = driver.getWindowHandle();
		  WebElement frame1 = driver.findElement(By.id("iframe1"));
		  driver.switchTo().frame(frame1);
		  Assert.assertNotNull(frame1);
		  driver.switchTo().window(tab);
		  WebElement frame2 = driver.findElement(By.id("iframe2"));
		  driver.switchTo().frame(frame2);
		  Assert.assertNotNull(frame2);
		  driver.switchTo().window(tab);
		  
		  
	  }
	  @Test ( priority = 4)
	  public void task3_LogIn() {
	  
		  driver.findElement(By.name("userid")).sendKeys("muzammilzia@gmail.com");  
		  driver.findElement(By.name("pswrd")).sendKeys("Abcd123");
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		  Alert alert =driver.switchTo().alert();
		  alert.accept();
	  }
	  @Test ( priority = 5)
	  public void task4_SelectHyundai() throws InterruptedException {
		  driver.findElement(By.xpath("//option[contains(text(),'Hyundai')]")).click();
		  driver.findElement(By.id("drop1")).click();
		  WebElement text3 = driver.findElement(By.id("textbox1"));
		  text3.clear();
		  text3.sendKeys("Hello");
		  driver.findElement(By.id("but2")).click();
		  driver.findElement(By.xpath("//button[text()='Submit']")).click();
		  driver.findElement(By.xpath("//button[text()='Login']")).click();
		  driver.findElement(By.xpath("//button[text()='Register']")).click();
		  driver.findElement(By.id("alert2")).click();
		  Alert alert =driver.switchTo().alert();
		  alert.accept();
		  String tab1 = driver.getWindowHandle();
		  driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		  for( String tab2 : driver.getWindowHandles()){
			  driver.switchTo().window(tab2);
		  }
		 String textA =driver.findElement(By.id("para1")).getText();
		 String textB =driver.findElement(By.id("para2")).getText();
		 System.out.println(textA+textB);
		 driver.switchTo().window(tab1);
		 driver.findElement(By.xpath("//button[text()='Try it']")).click();
		 Actions action = new Actions(driver);
		 WebElement doubleC= driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
		 action.doubleClick(doubleC).perform();
		 Alert alert1 =driver.switchTo().alert();
		 alert1.accept();
		 driver.findElement(By.xpath("//button[text()='Check this']")).click();
		 WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dte")));
		 driver.findElement(By.id("dte")).click();
	  }

	  @Test ( priority = 6)
	  public void task5_SelectGenderColorEtc() throws InterruptedException {
		  driver.findElement(By.id("radio1")).click();
		  driver.findElement(By.id("alert1")).click();
		  Thread.sleep(3000);
		  Alert alert1 =driver.switchTo().alert();
		  alert1.accept();
		  driver.findElement(By.id("checkbox1")).click();
		  driver.findElement(By.id("checkbox2")).click();
		  String text = driver.findElement(By.id("rotb")).getText();
		  System.out.println(text);
		  driver.findElement(By.id("prompt")).click();
		  Alert alert2 =driver.switchTo().alert();
		  alert2.accept();
		  driver.findElement(By.id("confirm")).click();
		  Alert alert3 =driver.switchTo().alert();
		  alert3.accept();
		  driver.findElement(By.xpath("//div[@id='HTML24']//child::input")).sendKeys("Hello");
		  driver.findElement(By.xpath("//div[@id='HTML28']//child::input")).sendKeys("Cars Name");
		  driver.findElement(By.xpath("//input[@value='Car']")).click();
		  driver.findElement(By.xpath("//input[@value='Bag']")).click();
		  driver.findElement(By.xpath("//input[@value='Book']")).click();
		  driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//a[text()='Gmail']")).click();
	  }
}
