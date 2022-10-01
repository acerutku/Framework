package firstDay;

import java.util.Scanner;

public class CharAlma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Char değeri girin");
        char ch = scan.next().charAt(0);
        System.out.println(ch);

        System.out.println("string ");
        String str = scan.nextLine();
        System.out.println(str);
    }
}
