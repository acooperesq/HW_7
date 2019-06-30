
import java.util.Scanner;

public class GCD_A {

	



		public static void main(String[] args)  throws OutOfRangeException {
		
			
			int fnum;
			int snum;
			
			int k=1;  // modulus
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("WELCOME TO THE GCD PROGRAM \n \n");
			
			System.out.println("Please Enter The First Number");
			
			fnum = scanner.nextInt();
			
			System.out.println("Please Enter The Second Number");
			
			snum = scanner.nextInt();
			
			OutOfRangeException problem = new OutOfRangeException("It's GCD is 1");
			
			//EUCLID'S ALGORITHM FOR FINDING GCD  
			
			// https://en.wikipedia.org/wiki/Greatest_common_divisor
			
			do {
			
			k = fnum% snum;
			fnum = snum;
			snum = k;
			
			if (k ==1)
				throw problem;
			
			;} while (k !=0);
			
			
			System.out.println("  The GCD for this combination is " + fnum);
			
			
			

		}


	}


