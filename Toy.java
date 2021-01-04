public class Toy{
	String toyName;
	boolean noises;
	boolean battery;
	boolean broken;
	boolean releaseTreats;

	//create toy
	public Toy(String toyName, boolean noises, boolean battery, boolean releaseTreats) {
		this.toyName = toyName;
		this.noises = noises;
		this.battery = battery;
		this.releaseTreats = releaseTreats;
	}
	//does toy make noises
	public void makeNoise(){
		System.out.println("Does this toy make a noise: " + noises);
	}

	//does this toy need a battery
	public void battery(){
		System.out.println("Does this toy have a battery: " + battery);
		if (battery = true){
			System.out.println("Needs a change of battery.");
		}
	}

	//is toy broken
	public void broken(){
		System.out.println("Is the toy broken?: no");
	}

	//release treats
	public void releaseTreats(){
		System.out.println("Does this toy release treats?: " + releaseTreats);
	}
}