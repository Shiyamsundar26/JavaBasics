package decisionstmts;
import java.util.Scanner;
public class Prog4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Current year:");
		int current=scan.nextInt();
		System.out.println("Employee joined year:");
		int join=scan.nextInt();
		System.out.println("Enter your basic salary:");
		double basic=scan.nextInt();
		employee(current,join,basic);
		scan.close();

		
	}
	public static void employee(int current,int join,double basic) {
		if (current-join>=3) {
			if(basic<=10000) {
				System.out.println(basic+0.2*basic+0.8*basic+2500);
			}
			else if(basic<=20000) {
				System.out.println(basic+0.25*basic+0.8*basic+2500);
				
			}
			else if(basic>20000) {
				System.out.println(basic+0.3*basic+0.95*basic+2500);
			}
			else {
				if(basic<=10000) {
					System.out.println(basic+0.2*basic+0.8*basic);
				}
				else if(basic<=20000) {
					System.out.println(basic+0.25*basic+0.8*basic);
					
				}
				else if(basic>20000) {
					System.out.println(basic+0.3*basic+0.95*basic);
			}
			
		}
		
	}
}
	
}