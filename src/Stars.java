//printing different shapes of start
public class Stars {
	public static void main(String[] args) {
		
	/*              *
	                **	
	                ***
	                ****
	                *****
	 */
	
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print("*");			
			}
			
			System.out.println();
		}
		System.out.println();
		
	/*	              *
	                 ***
	                *****
	               *******
	              *********
	             ***********
	*/
		
		for(int i=0; i<6; i++) {
			
			for(int j=0; j<6-i; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			
			System.out.println();	
		}
		System.out.println();
		
		
	/*	              *
                     ***
                    *****	 
                     ***
                      *       
    */
		
		int i, j, k;
		
		for(i=1; i<=3; i++) {
			
			for(j=0; j<3-i; j++) {
				System.out.print(" ");
				
			}
			
			for(k=1; k<=5-2*j; k++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		for(i=1; i<=2; i++) {
			
			for(j=1; j<=i; j++) {
				System.out.print(" ");
		
			}
			
			for(j=1; j<=5-2*i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}//end of main()
}//end of class
