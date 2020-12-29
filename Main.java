public class Main {
	
	public static void main(String[] args){
		
		//cat is born, at the daycare, - create a new cat
		Cat cat1 = new Cat("Beef");


		//cat is first put into daycare's system - create a new cat
		Cat cat2 = new Cat("Tango", "Mackenzie", 8, "turkey pate");

		//creates Daycare
		CatDayCare dc = new CatDayCare(Owner);
		
		//cat that was born at daycare leaves
		cat1.departs();

		//cat that was newly put into system is dropped off
		cat2.arrives();

		//cat that was born at daycare is dropped off
		cat1.arrives();

	}

}