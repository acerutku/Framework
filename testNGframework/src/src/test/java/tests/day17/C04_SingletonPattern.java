package src.test.java.tests.day17;

import org.testng.annotations.Test;

public class C04_SingletonPattern {
    @Test
    public void test01(){

        // singleton pattern : bir class'dan birden fazla obje uretilmesine
        // izin vermeyen bir pattern olarak kabul gormustur

        // biz Driver class'ini driver uretmek uzere kullaniyoruz
        // ancak Driver class'inda driver isminde bir instance variable da var
        // ve biz obje ureterek bu instance driver'a ulasabiliriz

        //Driver driver1=new Driver();

        //Driver driver2=new Driver();

        //Driver driver3=new Driver();


        // Singleton pattern kabul gormus bir pattern'dir
        // amac bir class'dan obje uretilmemesini saglamaktir
        // bunun icin singleton patter'de koruyacagim,iz class'da
        // parametresiz bir constructor olusturur ve
        // bu constructor'i private yapariz

    }

}