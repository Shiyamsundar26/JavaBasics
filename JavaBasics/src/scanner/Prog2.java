package scanner;
import java.util.Scanner;
public class Prog2 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=num.nextInt();
        boolean s=(a%10==4?true:false);
        
        System.out.println("The entered number last digit is"+s);
    }
}
