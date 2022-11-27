import java.util.Scanner;

public class q1 {
	
	public static double division(int n1, int n2) { 
		if(n1 == 0 || n2 == 0) { 
			throw new ArithmeticException("Exception: Numbers shouldn't  be zero");
		}
		else {
		    double ans = (double) n1 / n2;  
		    System.out.println(ans);
		    return ans;
		}
	}
	
	public static int multiply(int n1, int n2) {
		
		if(n1 == 0 || n2 == 0) { 
			throw new ArithmeticException("Exception: Numbers shouldn't be zero");
		}
		else {
			int ans = n1 * n2; 
		    System.out.println(ans); 
		    return ans;
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		int num1 = scn.nextInt();    
		int num2 = scn.nextInt();
		
		try { 
			division(num1, num2);   			
			multiply(num1, num2);
		}
		catch(ArithmeticException e) { 
			System.out.println(e);
		}
	}

}