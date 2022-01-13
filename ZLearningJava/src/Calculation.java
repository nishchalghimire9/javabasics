
public class Calculation {

	public static void main(String[] args) {
		Calculator operation = new Calculator();
		
		int sum = operation.addition(500, 300, 100);  // this is with parameter 
		System.out.println("This is the value comes after Addition  : " +sum);
		 
		int sub = operation.substraction();// here to below with out parameter by creating an object.
		System.out.println("This is the value comes after substration :" + sub);
		int multi = operation.multiplication();
		System.out.println(multi);
		int div = operation.division();
		System.out.println(div);

	}

}
