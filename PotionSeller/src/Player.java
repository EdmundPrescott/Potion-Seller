import java.util.ArrayList;

public class Player {

	private static ArrayList<Item> Inventory = new ArrayList<Item>();
	
	
	public Player(){}
	
	public static void printInventory(){
		if(Inventory.size()>0){
			System.out.println("Inventory: ");
			for(int i=0;i<Inventory.size();i++){
				System.out.println((i+1)+": "+Inventory.get(i).getName());
			}
		}else{
			System.out.println("There's nothing in you inventory...");
		}
	}
	
	public static void InventoryAdd(Item x){
		Inventory.add(x);
	}
	
	public static void InventoryAddAll(ArrayList<Item> x){
		Inventory.addAll(x);
	}
	
	public static void itemDetails(int x){
		Inventory.get(x).itemDetails();
	}
	
	public static ArrayList<Item> sendInventory(){
		return Inventory;
	}
	
}
