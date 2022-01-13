package JavaProgramming;
import java.util.Scanner;
public class obtain_input {  // geting input from console



	public static void main(String[] args) {
		// TODO Auto-generated method stub
// prompt the euser the radius
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of radius");
		
		double radius = input.nextDouble();
		
		double area = radius *radius* 3.14159;
		System.out.println("This is the radius:" + area);
		
		
		
		
		
	}

}
