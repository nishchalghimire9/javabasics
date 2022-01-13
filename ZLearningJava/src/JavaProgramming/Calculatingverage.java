package JavaProgramming;

import java.util.Scanner;

public class Calculatingverage {

	public static void main(String[] args) {
		
//		int computer = 90;
//		int linux = 80;
//		int software = 90;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your science total number");
		int science = input.nextInt();
		
		System.out.println("Enter your math total number");
		int math = input.nextInt();
		
		System.out.println("Enter your social total number");
		int social = input.nextInt();
		
//		
//
		//calculating average
	
		int average = ((science+math+social)/3);
				
				System.out.println("this is an average: " + average ) ;
	
	
				if (average>90 && average<=100) {
					System.out.println("Your grade is A" ) ;
					
				}
				else if(average>=80 && average<=89) {
					System.out.println("Your grade is B" );
				}
				else if(average>=70 && average<=79) {
					System.out.println("Your grade is C" );
				}
				else
					System.out.println("Your grade Fail" );
					}
				

}
