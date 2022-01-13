package JavaProgramming;

public class MethodWithArgumen {// this class is with argument.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		monthlyexpenses(2000,100, 500, 250, "January");
		
	}

	
	public static void monthlyexpenses(int mortagage, int insurance, int utility, int grocessery , String month) {
		int totalexpenses = mortagage+insurance+utility+grocessery;
		
		System.out.println("my monthly expenses for month " + month +" is " + totalexpenses);
		
	}
	
}
