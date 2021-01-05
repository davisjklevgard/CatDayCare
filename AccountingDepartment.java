
import java.util.*;
import java.util.Map.Entry;


public class AccountingDepartment{
	HashMap<String, Integer> amountOwedByClient = new HashMap<>();
	//add a client
	public void addClient(String name, int amountDue){
		amountOwedByClient.put(name, amountDue);
		System.out.println(name + " has been added.");
		System.out.println(name + " owes " + amountDue);
	}


	//create report of all clients
	public void reportAllClients(){
		System.out.println(amountOwedByClient); 
	}

	//create report of all delinquent clients
	public void delinquentClients(){
		for (HashMap.Entry<String, Integer> entry : amountOwedByClient.entrySet()) {
			if ( entry.getValue() > 0){
				System.out.println("Delinquent client: " + entry.getKey() );
			}
		}

	}
}