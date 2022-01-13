package loops;



public class Arrays {  // arays is special data type that allow to store multiple value.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Students= new int[10];
		Students[3]= 103;
		Students[4]= 103;
		Students[1]= 200;
		System.out.println(Students[3]);
		System.out.println(Students.length);
		
		
		
		for(int i =0; i<Students.length; i++) {
			System.out.println(Students[i]);
			System.out.println("Students ["+i+"]="+Students[i]);
		}
				
	}
	
}






















//for (int d=0; d<=100; d++) {
//			
//			System.out.println("the value is : " +d); //Ascending order
		


