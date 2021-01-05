public class Clients {
	
	
	String name; 
	String clientName;
	int numberOfCats;
	int age;
	int bill;
	String favoriteFood;
	
	
	//become a client
	public void becomeClient(String name){
		this.clientName = name;
		System.out.println("Insert client name: " + name);
	}
	//adding a cat
	public void Cat (String name, String clientName, int age, String favoriteFood){
	this.name = name;
	this.clientName = clientName;
	this.age = age;
	this.favoriteFood = favoriteFood;
	}
	//drop off cat
	public void arrives(){
		System.out.println(name + " has been dropped off.");
	}
	//pay bill
	public void payBill(String name, int bill){
		this.bill = bill;
		this.clientName = name;
		System.out.println(name + " has paid the bill of" + bill);
	}
}