import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day name");

        String dayname = scan.nextLine()  ;


        if (dayname.equals("Monday")){

            System.out.println("Weekday");
        }else{
            System.out.println("Wrong");
        }





    }
}
