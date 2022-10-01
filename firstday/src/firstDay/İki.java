package firstDay;

import java.util.Scanner;

public class İki {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("üçgenin bir taban kenarını giriniz");
        double sayı = scan.nextDouble();
        System.out.println("üçgenin yüksekliğini giriniz");
        double sayı2 = scan.nextDouble();
        System.out.println(sayı*sayı2/2);

scan.close();
    }

}
