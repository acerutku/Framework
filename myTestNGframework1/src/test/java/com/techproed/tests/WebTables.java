package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables extends TestBase {

    public void login(){
        driver.get("http://www.fhctrip.com/admin/HotelRoomAdmin");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Manager2!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
    @Test
    public void table() throws InterruptedException {
        login();
        //tbody deki datalari konsolda yazdirin
        Thread.sleep(5000);
        WebElement tbody = driver.findElement(By.xpath("//tbody"));
        System.out.println(tbody.getText());
        //tum tablo body'sinin boyutunu(size) bulun
        List<WebElement> table = driver.findElements(By.xpath("//tbody"));
        System.out.println("TABLE BODY SIZE:" +table.size());

        //table daki basliklari (headers) konsolda yazdirin
        List<WebElement> allHeaders = driver.findElements(By.tagName("th"));
        for (WebElement header : allHeaders){
            System.out.println(header.getText());
        }
    }
    @Test
    public void printRows(){
        login();
        //table body sinde bulunan toplam satir sayisini bulun
        System.out.println("Table body'de toplam" + driver.findElements(By.xpath("//tbody//tr")).size()+"tane satir(row) vardir");
        //Table body sinde bulunan satirlari konsolda yazdirin
        List<WebElement> allRows = driver.findElements(By.xpath("//tbody//tr"));
        for (WebElement row : allRows){
            System.out.println(row.getText());
        }
        //4. satirdaki elementleri konsolda yazdirin
    List<WebElement> elementsRow4 = driver.findElements(By.xpath("//tr[4]//td"));
        for (WebElement element : elementsRow4){
            System.out.println(element.getText());
        }
    }
    @Test
    public void printCells(){
        login();
        //table body'sinde bulunan toplam hucre(cell) sayisini bulun
        System.out.println("Tabloda toplam "+ driver.findElements(By.xpath("//tbody//td")).size()+"tane cell(hucre)vardir.");
        //Table body'sinde bulunan hucreleri(cells)konsolda yazdirin.
        List<WebElement> allCellss = driver.findElements(By.xpath("//tbody//td"));
        for (WebElement cell : allCellss){
            System.out.println(cell.getText());
        }
    }
    @Test
    public void printColums(){
        login();
        System.out.println("Tabloda toplam" + driver.findElements(By.xpath("//tr[3]//td")).size()+" Tane sutun(colum) vardir");
    //Table body'sinde bulunan sutunlari konslda yazdirin
        List<WebElement> column5 = driver.findElements(By.xpath("//tbody//td[5]"));
        for (WebElement element : column5){
            System.out.println(element.getText());
        }

        //5. colum daki elementleri yazdirin

    }
    public void printData(int row,int column){
        //kodlari bu metodun icine yazalim
        // //tbody//tr[8]//td[3]
        //dinamik bir xpath yazalim
        String xpath = "//tbody//tr[" +row+ "]//td["+column+"]";
        //elementleri xpath i kullanarak bulalim
        WebElement data = driver.findElement(By.xpath(xpath));
        //datalari yaziralim
        System.out.println(data.getText());

    }
    @Test
    public void printDataTest(){
        login();
        printData(8,3);
        printData(5,2);
        printData(9,5);


}

}
