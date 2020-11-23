/* Write a program to ask the user for an integer then displays an 
                      “hour glass figure”
Notes:
Your code should work for odd and even numbers.
Your code should check that the user enters an integer >=2.
If it is not the case, the program should display an error message.
*/

import java.util.Scanner;
public class HourGlassFigure {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.print("Please enter hour: ");
		int hour = Scan.nextInt();
		
		if (hour < 2) {
			System.out.println("Hour should be >=2.");
		}
		
		else {
			System.out.println("");
			int i, j, k;
			//first loop for top part
			for (i=0; i<hour/2+hour%2; i++) {
				
				for (j=0; j<i; j++) {
					System.out.print(" ");
				}
				for (j=0; j<hour-2*i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			//second loop for bottom part
			int m = hour/2+hour%2;
			for (i=1; i<m; i++) {
				for (j=0; j<m-1-i; j++) {
					System.out.print(" ");
				}
				for (k=j; k<hour-j; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}//end of else
		
		Scan.close();
	}//end of main()
}//end of class
