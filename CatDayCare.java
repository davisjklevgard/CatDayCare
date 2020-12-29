public class CatDayCare {
	String ownerName;
	String CatName;
	String favoriteFood;
	String favoriteToy;
	
	int age;
	
	HashMap<String, String> cats = new HasMap<>(100);
	//the cat eating
	public void acceptCat(String ownerName, String catName){
		cats.put(ownerName, catName); 
		System.out.println(catName + " has been dropped off at Daycare");
	}	
	//prompt client
	public void catInfo(String name, String ownerName, int age, String favoriteFood, String favoriteToy){
		this.catName = catName;
		this.ownerName = ownerName;
		this.age = age;
		this.favoriteFood = favoriteFood;	
		this.favoriteToy = favoriteToy; 
	}
	//feed cat
	public void feed(String favoriteFood){
		System.out.println(catName + " is eating " + favoriteFood);
	}
	//playing with favorite toy
	public void playingWithFavoriteToy(String favoriteToy){
		System.out.prinln(catName + " is playing with " + favoriteToy);
	}

}