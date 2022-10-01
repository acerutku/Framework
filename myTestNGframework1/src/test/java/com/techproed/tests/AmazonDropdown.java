package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AmazonDropdown extends TestBase {
    //bir method olustur ; amazonDropdownTest

    @Test
    public void amazonDropdownTest(){

        driver.get("https://www.amazon.com/");
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select = new Select(dropdownElement);
        String firstOption =select.getFirstSelectedOption().getText();
        System.out.println(firstOption);
        Assert.assertEquals(firstOption,"All Departments");
        select.selectByIndex(5);
        String option6 = select.getFirstSelectedOption().getText();
        Assert.assertEquals(option6,"Books");

        List<WebElement> allOptions = select.getOptions();
        for (WebElement option : allOptions){
            System.out.println(option.getText());
        }
        int optionsSayisi = allOptions.size();
        System.out.println("Dropdowndaki eleman sayisi: "+optionsSayisi );

        boolean flag = false;
        for(WebElement option : allOptions ){
            if (option.getText().equals("Electronics")){
                flag = true;
                break;
            }
        }
        System.out.println(flag);

    }
}
