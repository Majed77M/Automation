package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Core_Sign_in_Page {
static WebElement Username = null;
	static WebElement Password = null;
	static WebElement next = null;
	static WebElement Sign_in_button = null;
	static WebElement Stay_signed_in = null;

	public static  WebElement  Username(WebDriver driver) {
		 Username = driver.findElement(By.cssSelector("#i0116"));
return Username;	
	}
	public static WebElement next (WebDriver driver) {
		next = driver.findElement(By.cssSelector("#idSIButton9"));
		return next;
	}
	public static WebElement Password(WebDriver driver) {
		Password=driver.findElement(By.cssSelector("#i0118"));
			return Password;
	}
	public static WebElement Sign_in_button(WebDriver driver) {
		Sign_in_button=driver.findElement(By.cssSelector("#idSIButton9"));
		return Sign_in_button;
	}
public static WebElement Stay_signed_in(WebDriver driver) {
	Stay_signed_in=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
	return Stay_signed_in;
}


public void EnterusernameAndpassowrd(String username,String password) {
	
	Username.sendKeys(username);
	Password.sendKeys(password);
	
}
public void clicksignin() {
	Sign_in_button.click();
}
WebDriver driver = null;
 public Core_Sign_in_Page(WebDriver driver) {
	// TODO Auto-generated constructor stub}(WebDriver driver) {
	driver=this.driver;
	PageFactory.initElements(driver, this);
	
}
}


