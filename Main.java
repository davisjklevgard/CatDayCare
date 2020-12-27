public class Main {
	
	public static void main(String[] args){
		
		//cat is born, at the daycare, - create a new cat
		Cat cat1 = new Cat("Beef");


		//cat is first put into daycare's system - create a new cat
		Cat cat2 = new Cat("Tango", "Mackenzie", 4, "catnip");

		//creates Daycare
		CatDayCare dc = new CatDayCare(cat2);
		
		//cat that was born at daycare leaves
		cat1.departs();

		//cat that was newly put into system is dropped off
		cat2.arrives();

		//cat that was born at daycare is dropped off
		cat1.arrives();

		//cat is eating
		dc.eating(cat2);

	}

}