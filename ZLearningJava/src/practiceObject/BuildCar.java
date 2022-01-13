package practiceObject;

public class BuildCar {

	public static void main(String[] args) {
		Tesla modelS = new Tesla();
		Tesla modely = new Tesla();
		Tesla modelx = new Tesla();
		
	modelS.color ="Red";
	modely.color ="White";
	modelx.color ="Black";
	//Tesla.manufacture = "Tesla";
	
	System.out.println("This car is a " + modelS.manufacture+ " " + " modelS " + modelS.color  );
	System.out.println("This car is a " + modelS.manufacture+ " " + " modely "  + modely.color);
	System.out.println("This car is a " + modelS.manufacture+ " " + " modelx "  + modelx.color);
	
	}

}
