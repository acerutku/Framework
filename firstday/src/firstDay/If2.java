package firstDay;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Notu giriniz");
        int num = scan.nextInt();
        if (num < 50)
            System.out.println("Kaldı");
        else if (num > 49 && num < 81)
            System.out.println("Geçti");
        else if (num > 80 && num <= 100)
            System.out.println("Pekiyi");
        else {
            System.out.println("0 la 100 arası sayı giriniz");
        }
scan.close();


    }
}
