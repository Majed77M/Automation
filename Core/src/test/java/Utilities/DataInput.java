package Utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInput {
	public static void dataRead() throws IOException {
	//	File src = new File("C:\\Users\\MajedSultanAlotaibi\\OneDrive - SAUDI COMPANY FOR VISA AND TRAVEL SOLUTIONS\\Desktop\\DataInput.xlsx");

//FileInputStream file = new FileInputStream(src);






Workbook Excel = null;
File file1 = new File("C:\\Users\\MajedSultanAlotaibi\\eclipse-workspace\\Core\\EXCEL\\DataInput.xlsx");
if (!file1.exists()) {
   if (file1.toString().endsWith(".xlsx")) {
      Excel = new XSSFWorkbook();
   } else {
      Excel = new HSSFWorkbook();
   }
} else {
   Excel = WorkbookFactory.create(new FileInputStream(file1));
}
Sheet sheet = Excel.getSheetAt(0);
int RowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
for (int i =0; i<RowCount+1;i++) {
	Row Row=sheet.getRow(i);
	System.err.println(sheet.getRow(i).getCell(i).getStringCellValue());
	for (int j = 0; j < Row.getLastCellNum(); j++) {
		System.out.println("Passport Number is "+Row.getCell(j).getStringCellValue());
	//	String Passport = Row.getCell(j).getStringCellValue();

//System.out.println("This is row"+row);
}
	
// For xslx file
//XSSFWorkbook Xlsx = new XSSFWorkbook(file);
//For xls file;
//HSSFWorkbook Xls = new HSSFWorkbook(file);
//XSSFSheet Sheet = Xlsx.getSheetAt(1);
//Row row = Sheet.getRow(0);
//Cell cell = row.getCell(0);
//System.out.println("In DataInput class"+Row);
//System.out.println("This is "+ row + cell);
}
}
	public static void GenerateRandomString() {
	  String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	    // create random string builder
	    StringBuilder sb = new StringBuilder();

	    // create an object of Random class
	    Random random = new Random();

	    // specify length of random string
	    int length = 7;

	    for(int i = 0; i < length; i++) {

	      // generate random index number
	      int index = random.nextInt(alphabet.length());

	      // get character specified by index
	      // from the string
	      char randomChar = alphabet.charAt(index);

	      // append the character to string builder
	      sb.append(randomChar);
	    }

	    String randomString = sb.toString();
	    
	   System.out.println("Random String is: " + randomString);

	  }
	}
	