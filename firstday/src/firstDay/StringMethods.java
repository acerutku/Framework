package firstDay;

public class StringMethods {
    public static void main(String[] args) {

        String n = "Ali";
        String str1 = n.concat("Can");

        String str2 = n.toLowerCase();
        String str3 = n.toUpperCase();
        String str4 = n.replace("l","y");
        String str5 = n.substring(1);
        String str6 = n.substring(1,3);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
    }
}
