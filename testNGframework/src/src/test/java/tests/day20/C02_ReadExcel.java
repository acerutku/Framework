package src.test.java.tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

public class C02_ReadExcel {
    @Test
    public void test01() throws IOException {

        // ulkeler excelinin 3.satirini yazdirin

        String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(fis);

        for (int i=0; i<4 ;i++){
            System.out.println(workbook.getSheet("Sayfa1").getRow(2).getCell(i).toString());
        }

        // ilk 20 ulkenin baskentlerinin turkce ismlerini yazdirin
        for (int i=0 ; i<=20 ; i++){
            System.out.println(workbook.getSheet("Sayfa1").getRow(i).getCell(3));
        }

    }
}
