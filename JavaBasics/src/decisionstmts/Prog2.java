package decisionstmts;
import java.util.Scanner;
public class Prog2 {
	public static void main(String[] args) {
		Scanner sub=new Scanner(System.in);
		
		System.out.println("Enter the physics mark:");
		double phy=sub.nextDouble();
		
		System.out.println("Enter the chemistry mark:");
		double che=sub.nextDouble();

		System.out.println("Enter the Maths mark:");
		double mat=sub.nextDouble();

		System.out.println("Enter the Biology mark:");
		double bio=sub.nextDouble();

		System.out.println("Enter the Computer science:");
		double cs=sub.nextDouble();
		
		System.out.println("Total percentage:");
		double percentage=((phy+che+mat+bio+cs)/5);
		System.out.println(percentage);
		
		res(percentage);
	}
	
	public static void res(double percentage) {
		if(percentage>=90) {
			System.out.println("Grade A");
		}else if(percentage>=80) {
			System.out.println("Grade B");
		}else if(percentage>=70) {
			System.out.println("Grade C");
		}else if(percentage>=60) {
			System.out.println("Grade D");
		}else if(percentage>=40) {
			System.out.println("Grade E");
		}else{
			System.out.println("Grade F");
		}	
	}
}

