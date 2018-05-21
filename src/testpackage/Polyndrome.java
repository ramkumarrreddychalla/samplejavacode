package testpackage;

public class Polyndrome {

	public static void main(String[] args) {
		int num = 12321;
		
		int sum = 0;
		
		while(num > 0) {
			int remider = num % 2;  // 1
			sum = sum + remider; // 1
			num = num / 10; //1232
		}
		// 111/10 = 11
		
		System.out.println(" sample test to execute command line");
		
		
	}
	
}
