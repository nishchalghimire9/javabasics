package JavaProgramming;

public class MethodwithReturntype {

	public static void main(String[] args) {
		
	int profitBeforeTax=	MonthlySaving(4000, 2000, "january");
	System.out.print("Income Before tax " +  profitBeforeTax );
}



	

public static int MonthlySaving (int saving, int expenses,String month) {
	int profit = saving-expenses;
	System.out.println("Profit of month "  + month + "=" + profit);
	return profit;
}
}