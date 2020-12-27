public class Cat{

	//fields
	String name;
	String ownerName;

	int age;

	String favoriteFood;

	boolean ate = false;


	//methods

	//constructors

	//This method is used when a cat is born
	public Cat (String name){
		this.name = name;
		age = 0;
	}

	//This method is used when a cat is first put into the daycare's system.
	public Cat (String name, String ownerName, int age, String favoriteFood) {
		this.name = name;
		this.ownerName = ownerName;
		this.age = age;
		this.favoriteFood = favoriteFood;
	}
	
	public void playWithCat(String catName){
		System.out.println(name + " is playing with " + catName);
	}

	public void departs(){
		System.out.println(name + " has left the daycare.");
	}

	public void arrives(){
		System.out.println(name + " has been dropped off.");
	}

}