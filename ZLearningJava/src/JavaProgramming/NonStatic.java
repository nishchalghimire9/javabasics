package JavaProgramming;

public class NonStatic {

	public static void main(String[] args) {  //  when we call non static method to static class we need to create an object of the  class.
	
	// to creat an object of the class --> classname. name of object = new constructor of the class.	
		NonStatic obj= new NonStatic("Nishchal");
		int income = obj.quartellyGrossIncome(1000, 2500, 32500);
		System.out.println("my monthly income is : " + income);
		obj.addition();	
	}
//	
//	int myincome = quartellyGrossIncome(1500, 2000, 3550);
//		System.out.print("My quarterly income is : " + myincome );
//		
		
//	}
	public void addition() {
		int Income = 20000;
		int expenses = 5000;
		int profit = Income - expenses;
		System.out.println("my monthly saving is: " + profit);
	}
	
	public  int quartellyGrossIncome( int january, int february,int march) {
		int GrossIncome =  january +  february + march;
		
		return GrossIncome;
	}	
	public NonStatic(String Message) {
		System.out.println(Message);
		
	} 
	
	
	

}
	

