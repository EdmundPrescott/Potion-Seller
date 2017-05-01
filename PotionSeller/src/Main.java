import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Mixtures mixtures=new Mixtures();
		
		new Location();
		int TTS = 99999999;
		
		ArrayList<String> mixture = new ArrayList<String>();

		String[][] board=new String[32][2];//To be used later
		
		Scanner console=new Scanner(System.in);
	   	String userInput="";
	    
	   	boolean endGame=false;
	   	ArrayList<String> mixtureA = new ArrayList<String>();
	   	mixtureA.add("Red Cap");
	   	mixtureA.add("Silver Moss");
	   	ArrayList<String> mixtureB = new ArrayList<String>();
	   	mixtureB.add("Crow's Beak");
	   	mixtureB.add("Horse Hoove");
	   	mixtureB.add("Eye of Newt");
	   	ArrayList<String> mixtureC = new ArrayList<String>();
	   	mixtureC.add("Red Cap");
	   	mixtureC.add("Eye of Newt");
	   	ArrayList<String> x = new ArrayList<String>();
	   	
	   	System.out.println("Bloop");
	   	
	   	while(endGame==false){
	   		
	   		userInput=console.next();
	   		
	   		if(userInput.equals("test")){
	   			Location.Gather();
	   			Player.printInventory();
	   			Mixtures.Create(Player.sendInventory());
	   			Player.printInventory();
	   			x=Mixtures.getResult();
	   			System.out.println("fuck");
	   			for(int i=0;i<x.size();i++){
	   				System.out.println(x.get(i));
	   			}
	   			
	   		}
	   		
	   		if(userInput.equals("Inventory")){
	   			
	   		}
	   		
	   		if(userInput.equals("gather")){
	   			Player.printInventory();
	   			Location.Gather();
	   			Player.printInventory();
	   			
	   		}
	   		
	   		if(userInput.equals("InventorySort")){
	   			System.out.print("1. Alphabetical\n"
	   					       + "2. Rareity\n"
	   					       + "3. Inventory price");
	   		}
	   		
	   		
	   	}
		
		
	}

	
}

