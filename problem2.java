
import java.util.Scanner;

public class problem2 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int x;
			int n;
			System.out.println("Please enter the base of the exponent: ");
			x = scan.nextInt();
			System.out.println("Please enter the power of the exponent: ");
			n = scan.nextInt();
			System.out.println("Result: " + exponentiation(x, n));
		}
		
		public static long exponentiation(long x, int n) {
			// if(n == 0) {
			// 	// base case
			// 	return 1;
			// }if( n%2 == 0 ) {
			// 	// When even, splits the exponent into x^(n/2) * x^(n/2), performing one operation of multiplication 
			// 	return exponentiation( x * x, n / 2);
			// }else{
			// 	// When odd, splits the exponent into x^(n/2) * x^(n/2) * n, performing two operations of multiplication 
			// 	return exponentiation( x * x , n / 2) * x;
			// }
		}
}
