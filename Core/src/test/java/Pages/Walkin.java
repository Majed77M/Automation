package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Walkin {
static Select Traveling_as;
static WebElement Visa_type;
static Select Select_Traveling_as;
static WebElement PassportNO;
static WebElement Slot;
static WebElement Firstname;
static WebElement Middlename;
static WebElement Lastname;
static WebElement Placeofbirth;
static WebElement Email;
static WebElement MobileNO;
static WebElement Dateofbirth;
static Select DateofbirthYEAR;
static WebElement Dateofbirthday;
static WebElement Placeofissue;
static WebElement Submit;



public static Select Traveling_as (WebDriver driver ) {
	Select Select_Traveling_as = new Select(driver.findElement(By.cssSelector("#travelType")));
//	Select_Traveling_as.selectByIndex(1);
	return Select_Traveling_as;
}
public static Select Visa_type (WebDriver driver ) {
	Select Visa_type= new Select (driver.findElement(By.cssSelector("#visaType")));
	return Visa_type;
}
public static WebElement PassportNO(WebDriver driver) {
	return PassportNO= driver.findElement(By.cssSelector("#passportNo"));
}
public static Select Type_of_entry (WebDriver driver ) {
	Select Type_of_entry= new Select (driver.findElement(By.xpath("//select[@id='vistType']")));
	return Type_of_entry;
}
public static Select Visa_Duration (WebDriver driver ) {
	Select Type_of_entry= new Select (driver.findElement(By.xpath("//select[@id='duration']")));
	return Type_of_entry;
}
public static Select Nationality (WebDriver driver ) {
	Select Nationality= new Select (driver.findElement(By.xpath("//select[@id='nationality']")));
	return Nationality;
}
public static WebElement Slot(WebDriver driver) {
	return Slot = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]"));
}
public static Select Passporttype (WebDriver driver ) {
	Select Passporttype= new Select (driver.findElement(By.cssSelector("#passportType")));
	return Passporttype;
}
public static WebElement Firstname(WebDriver driver) {
	return Firstname= driver.findElement(By.cssSelector("#firstName"));
}
public static WebElement Middlename(WebDriver driver) {
	return Middlename= driver.findElement(By.cssSelector("#fatherName"));
}
public static WebElement Lastname(WebDriver driver) {
	return Lastname= driver.findElement(By.cssSelector("#lastName"));
}
public static WebElement Place_of_Birth(WebDriver driver) {
	return Placeofbirth= driver.findElement(By.cssSelector("#placeOfBirth"));
}
public static WebElement Email(WebDriver driver) {
	return Email= driver.findElement(By.cssSelector("#email"));
}
public static WebElement MobileNO(WebDriver driver) {
	return MobileNO= driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[9]/div[1]/div[1]/input[1]"));
}
public static WebElement Dateofbirth (WebDriver driver) {
	WebElement Dateofbirth = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/input[1]"));
return Dateofbirth;
	//	return Dateofbirth = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/input[1]"));
}
public static Select DateofbirthYEAR (WebDriver driver) {
	Select DateofbirthYEAR= new Select (driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")));
//	WebElement DateofbirthYEAR = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"));
return DateofbirthYEAR;
}
public static WebElement Dateofbirthday (WebDriver driver) {
	WebElement Dateofbirthday = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[4]"));
return Dateofbirthday;
}
public static WebElement Dateofissue (WebDriver driver) {
	WebElement Dateofissue = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[10]/div[1]/div[1]/div[1]/input[1]"));
return Dateofissue;
}
public static Select DateofissueYEAR (WebDriver driver) {
	Select DateofissueYEAR= new Select (driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[10]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")));
//	WebElement DateofbirthYEAR = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"));
return DateofissueYEAR;
}
public static WebElement Dateofissueday (WebDriver driver) {
	WebElement Dateofissuehday = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[10]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]"));
	return Dateofissuehday;
}
public static WebElement Dateofexpiry (WebDriver driver) {
	WebElement Dateofexpiry = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[11]/div[1]/div[1]/div[1]/input[1]"));
	return Dateofexpiry;
}
public static Select DateofexpiryYEAR (WebDriver driver) {
	Select DateofexpiryYEAR= new Select (driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[11]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")));
//	WebElement DateofbirthYEAR = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"));
return DateofexpiryYEAR;
}
public static WebElement Dateofexpiryeday (WebDriver driver) {
	WebElement Dateofexpiryeday = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[11]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[5]"));
	return Dateofexpiryeday;
}
public static WebElement Placeofissue(WebDriver driver) {
	return Placeofissue= driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[12]/form[1]/div[1]/input[1]"));
}
public static WebElement Submit(WebDriver driver) {
	return Submit= driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/button[1]"));
}

}