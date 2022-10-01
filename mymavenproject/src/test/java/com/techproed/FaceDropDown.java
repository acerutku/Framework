package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceDropDown {
  @Test
    public void birthday(){

      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com/r.php?locale=tr_TR&display=page");

      WebElement ay = driver.findElement(By.className("birthday_month"));
      Select optionAy = new Select(ay);
      optionAy.selectByVisibleText("Mar");

      WebElement gün = driver.findElement(By.className("birthday_day"));
      Select optionGun = new Select(gün);
      optionGun.selectByIndex(22);

  }
}
