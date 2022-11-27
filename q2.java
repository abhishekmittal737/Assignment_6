import java.util.Scanner;

public class q2 {
	
	public static int addition(int n1, int n2) {
		if(n1 < 0 || n2 < 0) {  
			throw new ArithmeticException("Exception: Numbers shouldn't be negative");
		}
		else {
			int ans = n1 + n2;  
			System.out.println(ans);
			return ans;
		}
	}
	
	public static int subtraction(int n1, int n2) {
		if(n1 < 0 || n2 < 0) {  
			throw new ArithmeticException("Exception: numbers shouldn't be negative");
		}
		else {
			int ans = n1 - n2;  
			System.out.println(ans);
			return ans;
		}
	}
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		
		try {  
			addition(num1, num2);
			
			subtraction(num1, num2);
		}
		catch(ArithmeticException e) { 
			System.out.println(e);
		}
	}
}