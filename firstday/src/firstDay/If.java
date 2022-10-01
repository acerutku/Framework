package firstDay;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int num = scam.nextInt();

        if (num>3)
            System.out.println("Merhaba");
        else{
            System.out.println("Güle GÜle");
        }
    }
}
