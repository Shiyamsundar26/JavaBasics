package scanner;
import java.util.Scanner;
public class Prog3 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=num.nextInt();
        boolean s=(a%4==0&&a%400==0?true:false);
        
        System.out.println("The entered number is divisible by 4 and 400 is"+s);
    }

}
