package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	static WebElement Click_on_Manager;
	static WebElement Click_on_BOD;
	static WebElement Activate_BOD;
	static WebElement Click_on_Reception;
	static WebElement Navigate_to_Walkin;
	static WebElement Click_on_Walkin;
	static WebElement CLICKMANAGER;
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[11]/div[1]/div[1]/span[1]")
	WebElement Click_on_Manager1;
WebDriver driver;
public Home_Page(WebDriver driver) {
	// TODO Auto-generated constructor stub}(WebDriver driver) {
	driver=this.driver;
	PageFactory.initElements(driver, this);
	
}
	public static WebElement Click_on_Manager (WebDriver driver) throws InterruptedException {
		Thread.sleep(7000);
		Click_on_Manager=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[11]/div[1]/ul[1]/li[2]/a[1]/span[1]"));
	//JavascriptExecutor js = (JavascriptExecutor) driver;
    //     js.executeScript("window.scrollBy(0,350)", "");
         return Click_on_Manager;
        
}
	
	public WebElement CLICKMANAGER(WebDriver driver ) {
		CLICKMANAGER=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[11]/div[1]/div[1]/span[1]"));
		return CLICKMANAGER;
	}
	public static WebElement Click_on_BOD (WebDriver driver) {
		return Click_on_BOD=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[11]/div[1]/ul[1]/li[2]/a[1]/span[1]"));
	}
	public static WebElement Activate_BOD (WebDriver driver) {
		return Activate_BOD = driver.findElement(By.xpath("//button[normalize-space()='Beginning Of the Day']"));
		}
	public static WebElement Click_On_Recpetion(WebDriver driver) {
		return Click_on_Reception= driver.findElement(By.xpath("//span[@id='reception']"));
		
	}
	public static WebElement Navigate_to_Walkin(WebDriver driver) {
		return Navigate_to_Walkin= driver.findElement(By.xpath("//span[@id='reception']"));

	}
	public static WebElement Click_on_Walkin(WebDriver driver) {
		return Click_on_Walkin = driver.findElement(By.xpath("//span[contains(text(),'Walkin')]"));
	}

}
