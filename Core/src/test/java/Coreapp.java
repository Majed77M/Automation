import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Coreapp {

	public static void main(String[] args) throws InterruptedException {

	//System.setProperty("webdriver.chrome.driver", "C:/Users/MajedSultanAlotaibi/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
		driver.get("https://vscpre.tasheer.com/center/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Thread.sleep(10000);

		driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("loadtest_15@tasheer.com");
		//WebElement VARName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='i0116']"))));
	//	username.sendKeys("loadtest_15@tasheer.com");
		driver.findElement(By.cssSelector("#idSIButton9")).click();
		driver.findElement(By.cssSelector("#i0118")).sendKeys("Hs@&T604");
		System.out.println("Enterd password");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/input[1]")).click();
		
		System.out.println("Signed in");
	}

}
