package JavaProgramming;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
	
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the length size");
		 double length = input.nextDouble();
		 
		 System.out.println("Enter the length size");
		 double width = input.nextDouble();
		 
		 double area =  length*width;
		 
		 System.out.println("This is the area of the square:" +area );
		 
		 
		 
	}

	 
}