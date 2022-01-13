package JavaProgramming;

import java.util.Scanner;

public class ComputeLoanPayment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// obatin yearly interest  rate
		System.out.print("Enter the yearly interest rate for example 8.25: "); 
		double annualInterestRate = input.nextDouble();
		
		// obtain monthly  interest  rate
		System.out.print("Enter the monthly interest rate: "); 
		double monthlyInterestRate = input.nextDouble();
		
		// obtain number of years
		System.out.print("Enter the number of years: "); 
		double years = input.nextDouble();
		
		// obtain loan amount
				System.out.print("Enter the loan amount: "); 
				double loanAmount = input.nextDouble();		
		
				// calculate payment
				double monthlypaymment =  loanAmount * monthlyInterestRate/ 
						(1-1/Math.pow(1+ monthlyInterestRate, years*12));
				
				double  totalpayment = monthlypaymment*years*12;
				
				System.out.println("Your monthly payment will be  " + (int) (monthlypaymment * 100) / 100.0);
				System.out.println("your total payment will be: " + (int) (totalpayment * 100) / 100.0 );
	}

}
