import java.util.Scanner;
public class practice {
	public static void main(String args[]) {
		Scanner x = new Scanner(System.in);
		 
		double a;
		double b;
		double e;
		
		System.out.println("a value is : ");
		a= x.nextDouble();
		System.out.println("b value is : ");
		b= x.nextDouble();
		
		e=a-b;
		System.out.println("result e is : " + e);	  
		
	}
}