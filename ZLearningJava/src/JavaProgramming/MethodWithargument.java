package JavaProgramming;

public class MethodWithargument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Monthlyincome(4000, 2000, "january");
		
		Monthlyincome(4000, 1000, "february");
	}

	
	public static void Monthlyincome (int saving, int expenses,String month) {
		int profit = saving-expenses;
		System.out.println("Profit of month "  + month + "=" + profit);
		
		
	}
	
}
