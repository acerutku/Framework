package src.test.java.tests.day20;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C06_WriteExcel {
    @Test
    public void test01() throws IOException {
        // ulkeler exceline 5.sutun olarak NUFUS sutunu ekleyelim
        // 3.satirdaki ulkenin nufusunu 1000000 yapalim

        // 1- dosyaya ulasalim
        String path = "src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(path);
        // 2- class'da calismak icin dosyanin bir kopyasi olan workbook olusturalim

        Workbook workbook = WorkbookFactory.create(fis);
        // 3- dosyada yapmak istedigimiz degisiklikleri
        //    kopya workbook'da yapalim
        // ilk satirin 5.hucresine NUFUS basligini yazdiralim
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("NUFUS");


        // // 3.satirdaki ulkenin nufusunu 1000000 yapalim

        workbook.getSheet("Sayfa1").getRow(2).createCell(4).setCellValue("1000000");


        // 4- kopyada yaptigimiz degisiklikleri ana dosyaya kaydedelim

        FileOutputStream fos = new FileOutputStream(path);
        workbook.write(fos);
    }

}

/*
        formati kopyalama
        FileOutputStream fos = new FileOutputStream(path);
        //excel aciksa bu methodu uygulamak dosyayi bozar, excelin kapali oldugundan emin olun
        CellStyle sayfa1 = workbook.getSheet("Sayfa1").getRow(0).getCell(1).getCellStyle();
        workbook.getSheet("Sayfa1").getRow(0).getCell(4).setCellStyle(sayfa1);
        workbook.write(fos);
 */