package com.techproed;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMavenClass {
    public static void main(String[] args) {
        //Maven projesinde  System.setProperty("","") kullanmayız
        //bunun yerine WebDriverManager kullanırız
        //chrome driver için bunu yazalım
        WebDriverManager.chromedriver().setup();  //kırmızı olmasının sebebi eksik dependensy olmasındandr
        //dependensyler neredne alınr //https://mvnrepository.com/


         WebDriver driver = new ChromeDriver();  //https://mvnrepository.com/ git ve selenium java ara
            driver.get("https://www.google.com");
//FAKE DATA NASIL OLUSTURULUR
        //fake data olsturmak icin "JavaFaker" denilen bir dependensy gerekir

        WebElement searchBox = driver.findElement(By.name("q"));//Locate ettik

        Faker faker = new Faker();
        searchBox.sendKeys(faker.country().capital()+ Keys.ENTER);
        System.out.println(faker.country().capital());





    }


}
