import java.util.ArrayList;

public class wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int d = 4;
		int k =5;
		Integer ob = new Integer(d); // boxing   >> there is two way to create oobject in wrapper class.
		System.out.println(d);
		Integer obj =k; // auto boxing 
		System.out.println(k);
		
		 int t = ob.intValue(); // this is unboxing // also we can unbox object value
		 System.out.println(t);
	

	ArrayList Students = new ArrayList<>(); 
	
	Students.add(100);
	Students.add(200000.001f);
	Students.add("nishchal");
	System.out.println(Students.size());
	}
}
