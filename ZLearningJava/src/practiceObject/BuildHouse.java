package practiceObject;

public class BuildHouse {
	public static void main(String[] args) {
		House townhouse1 = new House();
		House townhouse2 = new House();
		House townhouse3 = new House();
		House townhouse4 = new House();
		
		townhouse1.color = "red";
		townhouse2.color = "yellow";
		townhouse3.color= "pink";
		townhouse4.color= "Peach";
		townhouse1.room = 4;
		System.out.println(townhouse1.color);
		System.out.println(townhouse2.color);
		System.out.println(townhouse3.color);
		System.out.println(townhouse1.room);
		
		
	}
}
