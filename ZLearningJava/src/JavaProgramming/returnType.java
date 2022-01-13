package JavaProgramming;

public class returnType {
	
	public static void main(String[] args) {
		int myincome = quartellyGrossIncome(1500, 2000, 3550);
		System.out.print("My quarterly income is : " + myincome );
		
		
	}
	
	public static int quartellyGrossIncome( int january, int february,int march) {
		int GrossIncome =  january +  february + march;
		
		return GrossIncome;
		
		
	}

}
