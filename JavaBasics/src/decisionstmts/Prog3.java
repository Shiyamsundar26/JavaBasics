package decisionstmts;
import java.util.Scanner;
public class Prog3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("No.of days:");
		int days=scan.nextInt();
		lib(days);
		scan.close();
	}
	public static void lib(int days) {
		if(days>=1 && days<=5) {
			System.out.println("Fine amount:"+days*0.5);
		}
		else if(days>=6 && days<=10) {
			System.out.println("Fine amount:"+days*1);
		}
		else if(days>10 && days<=30) {
			System.out.println("Fine amount:"+days*5.0);
		}
		else if(days>30) {
			System.out.println("Membership cancelled");
		}
		else {
			System.out.println("No fine");
		}
		
	}

}
