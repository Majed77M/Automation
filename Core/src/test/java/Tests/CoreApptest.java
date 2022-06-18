package Tests;
import java.io.IOException;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.Core_Sign_in_Page;
import Pages.Home_Page;
import Pages.Walkin;
import Utilities.DataInput;
import Utilities.DataInput;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CoreApptest {

	static WebDriver driver;

	
public static void main(String[] args) throws InterruptedException, IOException {
//	WebDriverManager.chromedriver().setup();
	// driver = new ChromeDriver();
SigninSVTS();
Thread.sleep(3000);
ScrollDown_to_Manager();
Thread.sleep(2000);
Navigate_to_Walkin();
Thread.sleep(1000);
//Click_On_Walkin();
Fill_Walkin_details();
//ReadExcel();
System.out.println("Test successfully completed");
driver.quit();
	//driver = new ChromeDriver();
	
	//System.out.println("Browser closed successfully");
//	driver.close();

}

@Test

public static void ReadExcel () throws IOException {
	DataInput.dataRead();
}
@Test
public static void SigninSVTS() throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.get("https://vscpre.tasheer.com/center/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	Core_Sign_in_Page.Username(driver).sendKeys("loadtest_26@tasheer.com");
	Thread.sleep(3000);
	Core_Sign_in_Page.next(driver).click();
	Thread.sleep(2000);
	Core_Sign_in_Page.Password(driver).sendKeys("Hs622!@ad");
	Thread.sleep(2000);
	Core_Sign_in_Page.Sign_in_button(driver).click();
	Thread.sleep(2000);
	Core_Sign_in_Page.Stay_signed_in(driver).click();
	Thread.sleep(2000);
}
@Test
public static void ScrollDown_to_Manager() throws InterruptedException {
//WebDriverManager.chromedriver().setup();
	// driver = new ChromeDriver();
	Home_Page.Click_on_Manager(driver).click();
	Thread.sleep(1000);
	Home_Page.Click_on_BOD(driver).click();;
	Thread.sleep(8000);
	WebElement Activate_BOD = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]"));
	
	if(Activate_BOD.isEnabled()==false) {
		Home_Page.Click_On_Recpetion(driver).click();
		System.out.println("Click on Recpetion");
		Home_Page.Click_on_Walkin(driver).click();
	}
	else	{
		Thread.sleep(5000);
	Home_Page.Activate_BOD(driver).click();
	
	Thread.sleep(500);}
//driver.close();
}
@Test
public static void Navigate_to_Walkin() throws InterruptedException {
	Home_Page.Navigate_to_Walkin(driver).click();
	Thread.sleep(500);
}
@Test
public static void Click_On_Walkin() throws InterruptedException {
	Thread.sleep(1000);
	Home_Page.Click_on_Walkin(driver).click();
}
@Test
public static void Fill_Walkin_details() throws InterruptedException {
	//Walkin.Traveling_as(driver).selectByIndex(0);
//	Walkin.Visa_type(driver).selectByVisibleText("Diplomatic");
//	Walkin.Visa_type(driver).selectByValue("Diplomatic");
	//Walkin.Visa_type(driver).selectByIndex(2);
Walkin.PassportNO(driver).sendKeys("KfDSJKREKFDSDo43");
//	Thread.sleep(1000);
	//WebElement TravelType = driver.findElement(By.xpath("//select[@id='travelType']"));
//	Thread.sleep(2000);
//Select TravelType1= new Select (TravelType);
Thread.sleep(1000);
Walkin.Traveling_as(driver).selectByIndex(1);
WebElement Travel_as_value= Walkin.Traveling_as(driver).getFirstSelectedOption();
	System.out.println(Travel_as_value.getText());
	//WebElement VisaType = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/select[1]"));
WebElement Visa_type_valueWalkin= Walkin.Visa_type(driver).getFirstSelectedOption();
	Walkin.Visa_type(driver).selectByIndex(2);
	WebElement Type_of_entry_value=Walkin.Type_of_entry(driver).getFirstSelectedOption();
	Thread.sleep(1000);
	System.out.println(Type_of_entry_value.getText());
	Walkin.Type_of_entry(driver).selectByIndex(2);
	Thread.sleep(1000);
	Walkin.Visa_Duration(driver).selectByIndex(1);
	Thread.sleep(500);
	Walkin.Nationality(driver).selectByIndex(25);
	Thread.sleep(1000);
	Walkin.Slot(driver).click();
	Walkin.Passporttype(driver).selectByIndex(1);
	Walkin.Firstname(driver).sendKeys("Majed");
	Walkin.Middlename(driver).sendKeys("Sultan");
	Walkin.Lastname(driver).sendKeys("AlotaibiGIThub");
	Walkin.Place_of_Birth(driver).sendKeys("Riyadh");
	Walkin.Email(driver).sendKeys("motaibi@Saudivts.com");
	Walkin.MobileNO(driver).sendKeys("0535352885");
	Walkin.Dateofbirth(driver).click();
	Walkin.DateofbirthYEAR(driver).selectByIndex(88);
	Walkin.Dateofbirthday(driver).click();
	Walkin.Dateofissue(driver).click();
	Walkin.DateofissueYEAR(driver).selectByIndex(95);
	Walkin.Dateofissueday(driver).click();
	Walkin.Dateofexpiry(driver).click();
	Walkin.DateofexpiryYEAR(driver).selectByIndex(3);
	Walkin.Dateofexpiryeday(driver).click();
	Thread.sleep(1000);
	Walkin.Placeofissue(driver).sendKeys("RiyadhSaudi");
	//System.out.println("Submitted Riyadh in place of issue");
	Walkin.Submit(driver).click();
}
}
