import java.util.Scanner;
public class kranthi {
	public static void main(String args[]) {
		Scanner suni=new Scanner(System.in);
		int Sunayana = suni.nextInt();
		int KranthiKumar = suni.nextInt();
	
	if(KranthiKumar >= 29) {
		if(Sunayana >= 25) {
		System.out.println("both of you eligible to marry ");
	    }else {
		System.out.println("you have to wait");
		}
	}
	else {
		System.out.println("both of you have to wait");
	}
		
	}

}
