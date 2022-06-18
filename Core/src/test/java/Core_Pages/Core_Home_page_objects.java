package Core_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Core_Home_page_objects {
	

	 WebDriver driver = null;
	
By Username = By.cssSelector("#i0116");
By Next = By.cssSelector("#idSIButton9");
By Password = By.cssSelector("#i0118");
By Sign_in= By.cssSelector("#idSIButton9");
By Stay_Signed_in = By.cssSelector("//input[@id='idSIButton9']");

public  void  SigninSVTS() {
	driver.findElement(Username).sendKeys("loadtest_26@tasheer.com");;
	driver.findElement(Next).click();
	driver.findElement(Password).sendKeys("Hs622!@ad");
	driver.findElement(Sign_in).click();
	driver.findElement(Stay_Signed_in);
}
}
