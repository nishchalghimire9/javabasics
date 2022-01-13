package Encapsualtion;



public class encap2 implements addition, substraction { // we are implementing multiple interface here 
	
	private int d;
	private int k;
	
	
	
	

	public int getD() {
		return d;
	}





	public void setD(int d) {
		this.d = d;
	}





	public int getK() {
		return k;
	}





	public void setK(int k) {
		this.k = k;
	}





	public static void main(String[] args) {
		encap1 obj = new encap1();
		obj.subraction();
		encap2 object = new encap2();
	
		
object.setD(100);
int t = object.getD();
System.out.println("This is t " + t);

	}





	@Override
	public void substraction() {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void division() {
		// TODO Auto-generated method stub
		
	}
	
	















}
