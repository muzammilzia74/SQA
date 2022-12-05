package POM123;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Omyo {
	WebDriver driver;
	@FindBy(id="ta1")
	WebElement name;
	@FindBy(xpath="//textarea [contains(text(),'The cat was playing in the garden.')]")
	WebElement description;
	@FindBy(id="table1")
	WebElement table;
	@FindBy(xpath="//input[@type ='text']")
	WebElement userName;	
	@FindBy(xpath="//input[@type ='password']")
	WebElement password;
	@FindBy(xpath="//button[@value='LogIn']")
	WebElement logInButton1;	
	@FindBy(id="iframe1")
	WebElement frame1;
	@FindBy(id="iframe2")
	WebElement frame2;
	@FindBy(name="userid")
	WebElement userID;	
	@FindBy(name="pswrd")
	WebElement userPassword;	
	@FindBy(xpath="//input[@value='LogIn']")
	WebElement logInButton2;	
	@FindBy(xpath="//option[contains(text(),'Hyundai')]")
	WebElement Hyundai;	
	@FindBy(id="drop1")
	WebElement doc3;	
	@FindBy(id="textbox1")
	WebElement Hello;
	@FindBy(id="but2")
	WebElement button2;
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submitButton;	
	@FindBy(xpath="//button[text()='Login']")
	WebElement logInButton;	
	@FindBy(xpath="//button[text()='Register']")
	WebElement registerButton;	
	@FindBy(id="alert2")
	WebElement textDissapear;	
	@FindBy(xpath="//a[text()='Open a popup window']")
	WebElement popupWindow;	
	@FindBy(id="para1")
	WebElement textA;	
	@FindBy(id="para2")
	WebElement textB;	
	@FindBy(xpath="//button[text()='Try it']")
	WebElement tryIt;	
	@FindBy(xpath="//button[text()=' Double click Here   ']")
	WebElement doubleClick;	
	@FindBy(xpath="//button[text()='Check this']")
	WebElement checkThis;	
	@FindBy(id="dte")
	WebElement mrOption;	
	@FindBy(id="radio1")
	WebElement gender;	
	@FindBy(id="alert1")
	WebElement getAlert;
	@FindBy(id="checkbox1")
	WebElement orange;	
	@FindBy(id="checkbox2")
	WebElement blue;	
	@FindBy(id="rotb")
	WebElement readText;	
	@FindBy(id="prompt")
	WebElement getPrompt;	
	@FindBy(id="confirm")
	WebElement getConfirmation;	
	@FindBy(xpath="//div[@id='HTML24']//child::input")
	WebElement textBox1;	
	@FindBy(xpath="//div[@id='HTML28']//child::input")
	WebElement textBox2;	
	@FindBy(xpath="//input[@value='Car']")
	WebElement car;	
	@FindBy(xpath="//input[@value='Bag']")
	WebElement bag;	
	@FindBy(xpath="//input[@value='Book']")
	WebElement book;	
	@FindBy(xpath="//button[text()='Dropdown']")
	WebElement dropdown;	
	@FindBy(xpath="//a[text()='Gmail']")
	WebElement gmail;
	
	 @Test ( priority = 0)
	  public void task1_VerifyINputValue() {
		  name.sendKeys("Muzammil Zia");
		  Assert.assertNotNull(name);
		  description.clear();
		  description.sendKeys("I am brave man");
		  Assert.assertNotNull( description);
	  }
	 @Test ( priority = 1)
	  public void task2_GetTableDataAndPrintIt() { 
		  table.getText();
		  System.out.print(table);  	  
	  }
	  @Test ( priority = 2)
	  public void task2_LogIn() {
		  userName.sendKeys("muzammilzia@gmail.com");  
		  password.sendKeys("Abcd123");  
		  logInButton1.click();
	  }
	  @Test ( priority = 3)
	  public void task3_SwitchToFrames() {
		  String tab = driver.getWindowHandle();
		  driver.switchTo().frame(frame1);
		  Assert.assertNotNull(frame1);
		  driver.switchTo().window(tab);
		  driver.switchTo().frame(frame2);
		  Assert.assertNotNull(frame2);
		  driver.switchTo().window(tab);
	  }
	  @Test ( priority = 4)
	  public void task3_LogIn() {
	  
		  userID.sendKeys("muzammilzia@gmail.com");  
		  userPassword.sendKeys("Abcd123");
		  logInButton2.click();
		  Alert alert =driver.switchTo().alert();
		  alert.accept(); 
	  }
	  @Test ( priority = 5)
	  public void task4_SelectHyundai() throws InterruptedException {
		  Hyundai.click();
		  doc3.click();
		  Hello.clear();
		  Hello.sendKeys("Hello");
		  button2.click();
		  submitButton.click();
		  logInButton.click();
		  registerButton.click();
		  textDissapear.click();
		  Alert alert =driver.switchTo().alert();
		  alert.accept();
		  String tab1 = driver.getWindowHandle();
		  popupWindow.click();
		  for( String tab2 : driver.getWindowHandles())
		  {
			  driver.switchTo().window(tab2);
		  }
		 String A1 = textA.getText();
		 String B1 = textB.getText();
		 System.out.println(A1+B1);
		 driver.switchTo().window(tab1);
		 tryIt.click();
		 Actions action = new Actions(driver);
		 action.doubleClick(doubleClick).perform();
		 Alert alert1 =driver.switchTo().alert();
		 alert1.accept();
		 checkThis.click();
		 Thread.sleep(10000);
		 mrOption.click();
	  }
	  @Test ( priority = 6)
	  public void task5_SelectGenderColorEtc() throws InterruptedException {
		  gender.click();
		  getAlert.click();
		  Thread.sleep(3000);
		  Alert alert1 =driver.switchTo().alert();
		  alert1.accept();
		  orange.click();
		  blue.click();
		  readText.getText();
		  System.out.println(readText);
		  getPrompt.click();
		  Alert alert2 =driver.switchTo().alert();
		  alert2.accept();
		  getConfirmation.click();
		  Alert alert3 =driver.switchTo().alert();
		  alert3.accept();
		  textBox1.sendKeys("Hello");
		  textBox2.sendKeys("Cars Name");
		  car.click();
		  bag.click();
		  book.click();
		  dropdown.click();
		  Thread.sleep(5000);
		  gmail.click();
	  }
}

