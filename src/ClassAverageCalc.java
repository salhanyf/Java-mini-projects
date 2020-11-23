import java.util.Scanner;

//calculates the class average depending on the number of students and their geades
public class ClassAverageCalc {
	public static void main (String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		int numStudents;
		int aboveAvg = 0;
		double average = 0;
		double marks[];
		
		System.out.println("How many students?");
		numStudents = Scan.nextInt();
		
		marks = new double[numStudents];
		
		for (int i = 0; i < numStudents; i++) {
			System.out.print("Please enter student "+ (i+1)+" grade: ");
			marks[i] = Scan.nextDouble();
			average += marks[i];
			
		}//end of for loop
		
		average /= numStudents;
		System.out.println("\nAvarage is: "+average);
		
		for(int i = 0; i < marks.length; i++) {
			if(marks[i] > average) {
				aboveAvg++;
					
			}//end of if statement 
		}//end of for loop
		
		System.out.println("Students above avarge: "+aboveAvg);
		
		Scan.close();
	}//end of main
}//end of class
