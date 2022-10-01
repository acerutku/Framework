package com.techproed.tests;

import com.techproed.utilities.Driver;
import com.techproed.utilities.TestBaseFinal;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecuter extends TestBaseFinal {

    @Test
    public void JSExecuterTest() {

        driver.get("http://www.fhctrip.com/Account/Logon");
        WebElement loginButton = Driver.getDriver().findElement(By.id("btnSubmit"));
      //  clickElementByJS(loginButton); 1.
        WebElement createButton=Driver.getDriver().findElement(By.xpath("//span[@class='btn btn-primary py-3 px-5']"));
      //  clickElementByJS(createButton); 1.
      // System.out.println(getTitleByJS()); 2.
      //  scrollDownByJS(); 3.
       // WebElement Instagram = Driver.getDriver().findElement(By.xpath("//*[.='Instagram']"));
       // scrollInToViewJS(Instagram); 4.

      //  WebElement image = Driver.getDriver().findElement(By.xpath("(//div[@class='block-21 mb-4 d-flex'])[4]"));
      //  scrollInToViewJS(image); 5.
   //     flash(loginButton); 6.
        generateAlert("Sayfada bir bug bulundu..."); // 7.

    }

    public void clickElementByJS(WebElement element) {
        JavascriptExecutor jsExecutor = ((JavascriptExecutor) Driver.getDriver());
        jsExecutor.executeScript("arguments[0].click();", element);

    }
    //sayfa basligini JS ile alma metodu
    public String getTitleByJS(){
        JavascriptExecutor jsExecutor = ((JavascriptExecutor) Driver.getDriver());
        String title = jsExecutor.executeScript("return document.title;").toString();

                return title;
    }
    //scroll down(asagi kaydirma)bu metod en alt kisma kadar kaydirir
    public void scrollDownByJS(){
        JavascriptExecutor jsExecutor =((JavascriptExecutor)Driver.getDriver());
        jsExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    }
    public void scrollInToViewJS(WebElement element){
        JavascriptExecutor jsExecuter = ((JavascriptExecutor)Driver.getDriver());
        jsExecuter.executeScript("arguments[0].scrollIntoView(true);",element);

    }
        // secilen elementin background rengini degistirmek icin kullanilan yontem
    public void flash(WebElement element){
        String bgColor = element.getCssValue("backgroundcolor");
        for (int i = 0; i < 10; i++){
            changeColor("rgb(0,200,0)",element);
            changeColor(bgColor,element);
        }
    }
    public void changeColor(String color,WebElement element){
        JavascriptExecutor javascriptExecutor = ((JavascriptExecutor)Driver.getDriver());
        javascriptExecutor.executeScript("arguments[0].style.backgroundColor = '"+ color + "'" ,element);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    //gerektiginde bir uyari mesaji olusturma
    public void generateAlert(String message){
    JavascriptExecutor jsExecuter = ((JavascriptExecutor) Driver.getDriver());
    jsExecuter.executeScript("alert('"+ message + "')");


    }



}






