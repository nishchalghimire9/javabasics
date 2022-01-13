package JavaProgramming;

public class NestedIfStatement {

	public static void main(String[] args) {
		// printing bigger number in console

		int d = 6;
		int w = 6000;
		int v = 60000;
		
		if(d>w) {
			if(d>v) {
				System.out.println("The bigger number is d: " + d);	
				
			} else {
				System.out.print("the bigger number is v: " + w);
			}
			}else if(v>w) {
				System.out.println("The bigger number is V: "+ v);	
			}else {
				System.out.println("The bigger number is w: " + w);
				
			}
		
		// switch statement
		int s = 3;
		
		switch(s){
		case 1 : 
			System.out.println("Today is monday");
			break;
		case 2 : 
			System.out.println("Today is monday");	
			break;
		case 3 : 
			System.out.println("Today is tuesday");	
			break;
		case 4 : 
			System.out.println("Today is thursday");
			break;
		case 5 : 
			System.out.println("Today is friday");
			break;
		case 6 : 
			System.out.println("Today is saturday");
			break;
		case 7 : 
			System.out.println("Today is sunday");
			break;
		default : 
			System.out.println("Input is invalid");
		}
		
		
		
		
		}
		
		
	}


