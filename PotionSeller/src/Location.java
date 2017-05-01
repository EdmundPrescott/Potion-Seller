import java.util.ArrayList;
import java.util.Scanner;

public class Location {

	private static String Name;
	private static String[][] Gatherables;
	private static String[] Locations={"Bog Lands","Hunters Retreat","Bemothtackt","Gyndel","Laysea","Bouwmont","Kinch","Felling","Donpoltpollot"};
	private static ArrayList<ItemAssist> ItemAssist = new ArrayList<ItemAssist>();
	
	private static Scanner console=new Scanner(System.in);
   	private static String userInput="";
	
	public Location(){
		//Name="Bog Lands";
		Name="Test";
		setGatherables();
	}
	
	public void setName(int locationsNumber){
		Name=Locations[locationsNumber-1];
		setGatherables();
	}
	
	public void setName(String locationsName){
		Name=locationsName;
		setGatherables();
	}
	/*
	 case"":
		 Gatherables=new String[][]{};
		 break;
	 */
	public static void setGatherables(){
		switch(Name){
			case"Bog Lands":
				Gatherables=new String[][]{{"Spotted Puffball","80"},{"Newt","1"},{"Tangle Thistle","40"},{"Half-Caps","90"}};
				break;
			case"Hunter's Retreat":
				Gatherables=new String[][]{{"Dear Pearls","80"},{"Black Thistle","40"},{"Tine","100"},{"Varse","25"}};
				break;
			case"Bemmothtackt":
				Gatherables=new String[][]{{"Brosbule Berries","70"},{"Tree Sap","90"},{"OrArkcausses","10"},{"Silver Moss","40"}};
				break;
			case"Gyndel":
				Gatherables=new String[][]{{"Crux Beattle","25"},{"Witch Nose","1"},{"Half-Rose","50"},{"Crow Feathers","20"}};
				break;
			case"Laysea":
				 Gatherables=new String[][]{{"Lake Snapper","30"},{"Luddic","30"},{"Affiskis","30"},{"Firefly","10"},{"Red Cap","40"}};
				 break;
			case"Bouwmont":
				 Gatherables=new String[][]{{"Fallbird Egg","35"},{"Fellbird Egg","15"},{"Burce","90"},{"Fallbird Claws","10"},{"Fellbird Claws","5"}};
				 break;
			case"Kinch":
				 Gatherables=new String[][]{{"Bee","70"},{"Honey","50"},{"Heartthrob","25"},{"Purple Bell","100"},{"Trick Bell","10"}};
				 break;
			case"Donpoltpollot":
				 Gatherables=new String[][]{{"Spark Powder","20"},{"Canbit","10"},{"Biggus Fruit","10"}};
				 break;
			case"Test":
				 Gatherables=new String[][]{{"Red Cap","100"},{"Silver Moss","100"}};
				 break;
		}
	}
	
	public static void printGatherablesData(){
		for(int i=0;i<Gatherables.length;i++){
			for(int j=0;j<2;j++){
				if(j==0){System.out.print((i+1)+". ");}
				System.out.print(Gatherables[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int totalGatherablesInt(){
		return Gatherables.length;
	}
	
	public static void printGatherables(){
		for(int i=0;i<Gatherables.length;i++){
				System.out.print((i+1)+". "+Gatherables[i][0]+" ");
		}
	}
	
	public static void Gather(){
		for(int i=0;i<Gatherables.length;i++){
			ItemAssist.add(new ItemAssist(new Item(Gatherables[i][0],Name,Integer.parseInt(Gatherables[i][1]))));
			System.out.print((i+1)+". "+ItemAssist.get(i).getItem().getName()+" ");
		}
		System.out.println();
	
		int place=0;
		while(!userInput.equals("quit")){
			System.out.println("Tick "+ItemAssist.get(place).getItem().getName()+"?");
			userInput=console.next();
			if(userInput.equals("y")){
				ItemAssist.get(place).clickItem();
			}
			place++;
			if(place==Gatherables.length){
				place=0;
			}
		}
		
		for(int i=0;i<Gatherables.length;i++){
			Player.InventoryAddAll(ItemAssist.get(i).activate());
		}
		ItemAssist.clear();
	
	}
	
}

