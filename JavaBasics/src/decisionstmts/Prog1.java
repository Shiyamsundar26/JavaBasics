package decisionstmts;
import java.util.Scanner;
public class Prog1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=scan.next().charAt(0);
		checkchar('*');
	}


	public static void checkchar(char ch) {
		if(ch>='A'&&ch<='Z'|| ch>='a'&&ch<='Z') {
			System.out.println("Alphaber");
			
		}else if(ch>='0'&&ch<='9') {
			System.out.println("Digit");
		}else {
			System.out.println("mooditu po");
		}
	}
}