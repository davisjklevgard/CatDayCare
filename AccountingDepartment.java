
import java.util.*;
import java.util.Map.Entry;


public class AccountingDepartment{
	HashMap<String, Integer> clients = new HashMap<>();
	//add a client
	public void addClient(String name, int amountDue){
		clients.put(name, amountDue);
		System.out.println(name + " has been added.");
		System.out.println(name + " owes " + amountDue);
	}


	//create report of all clients
	public void reportAllClients(){
		System.out.println(Collections.singletonList(clients)); 
	}

	//create an array from the HashMap

	Set<Entry<String, Integer>> entrySet = clients.entrySet();
	ArrayList<Entry<String, Integer>> listOfClients = new ArrayList<Entry<String, Integer>>(entrySet);

	//create report of all delinquent clients
	public void delinquentClients(){
		for (int value : listOfClients) {
			if ( value > 0){
				System.out.println(name);
			}
		}

	}
}