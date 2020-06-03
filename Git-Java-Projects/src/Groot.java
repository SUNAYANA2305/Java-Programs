import java.util.Scanner;
public class Groot {
	public static void main(String args[]) {
		
		Scanner x = new Scanner(System.in);
		int age;
		System.out.println("Enter your age");
		age = x.nextInt();
		
		if(age>=18) {
			System.out.println("you can vote ");
		}else {
			System.out.println("you are not eligible to vote");
			if(age >=10) {
				System.out.println("you have to wait 8 years to get your vote right");
			}else {
				System.out.println("you are too young to vote");
			}
			
		}
	}
}
