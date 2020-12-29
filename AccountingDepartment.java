public class AccountingDepartment{
	HashMap<String, int> clients = new HashMap<>();
	//add a client
	public void addClient(String name, int amountDue){
		clients.put(name, amountDue)
		System.out.println(name + " has been added.");
		System.out.println(name + " owes " + amountDue);
	}


	//create report of all clients
	public void reportAllClients(){
		System.out.println(Collections.singletonList(clients)); 
	}

	//create report of all delinquent clients
	public void delinquentClients(){
		for (value > 0: clients.name()) {
			System.out.println(name);
		}
	}
}