/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Calendar;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class App {
    public static void main(String[] args) throws IOException, URISyntaxException {
        FileInputStream fis =
                new FileInputStream(new File("berufe-heft-kldb2010-dwol-0-202111-xlsx.xlsx"));
        try (Workbook workbook = new XSSFWorkbook(fis);) {
            Sheet sheet = workbook.getSheetAt(4);
            Row row = sheet.getRow(12);
            Cell cell = row.getCell(3);
            Date date = cell.getDateCellValue();
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int year = cal.get(Calendar.YEAR);
            System.out.println(year);
            String month = cal.get(Calendar.MONTH)
        }
    }
}