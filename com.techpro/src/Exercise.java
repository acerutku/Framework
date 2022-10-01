import java.io.Console;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam= 0;
        System.out.println("sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println("2. sayiyi giriniz");
        int sayi1 = scan.nextInt();

        for (int i = 0; i<sayi1 ; i++)
        {
            toplam += sayi;
        }
      System.out.println(sayi + "X" + sayi1 + "=" + toplam);





    }














}
