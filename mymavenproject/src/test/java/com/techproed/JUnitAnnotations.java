package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitAnnotations {

        //Bir JUnit projesinde testi calistirmak icin @Test annotation'i kullanilir
                //"test1"adinda bir void method olusturun

        @Before         //Her @Test'den önce calisir
        public void runbeforeTest(){
                System.out.println("@Before => run before test");
        }
        @After          //Her @Test'ten sonra calisir
        public void     runAfterTest() {
                System.out.println("@After => run After test");
        }
        @Test           //@Test test caseleri main mehod olmadan calıstırmamzı saglar
        public void test1(){
                System.out.println("Test1'i yazdir");
        }
        @Test
        public void test2(){
                System.out.println("Test2'yi yazdir");
        }
        @Ignore // @Test görmezden gelir
        @Test
        public void test3(){
                System.out.println("Test3'u yazdir");
        }











}
