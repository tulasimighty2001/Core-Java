package GenericUtilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class EXcelFileUtility {
public String readDataFromExcelFile(String SheetName,int rowNum,int cellNum)throws Throwable{
	FileInputStream fise=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\SwagLabs_Maven_Hybridprojects\\src\\test\\resources\\excel.xlsx");
	Workbook wb=WorkbookFactory.create(fise);
	return wb.getSheet(SheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();

}
}

