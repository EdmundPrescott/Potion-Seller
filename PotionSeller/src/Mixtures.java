import java.util.ArrayList;
import java.util.Collection;

public class Mixtures {

	private static ArrayList<String> mix = new ArrayList<String>();
	private static ArrayList<String> result = new ArrayList<String>();
	//{new ArrayList<String>() {{add("");}},""},add("");
	private static Object[][] RecipeTable={
			{new ArrayList<String>() {{add("Red Cap");add("Silver Moss");}},"Silver Health Potion"},
			{new ArrayList<String>() {{add("Sulfur Salts");add("Heartthrob");}},"Widow's Spice Potion"},
			{new ArrayList<String>() {{add("Brosuule Berries");add("Silver Moss");add("Tree Sap");}},"Hunter's Cloak Potion"},
			{new ArrayList<String>() {{add("Eye of Newt");add("Crow's Beak");add("Horse Hoove");}},"Random Polymorph Potion"},
			{new ArrayList<String>() {{add("Sulfur Salts");add("Spark Powder");add("Canbit");}},"Violent Break Potion"},
			{new ArrayList<String>() {{add("Honey");add("Gold");add("Heartthrob");add("Animal Fat");add("Puffball");}},"Sun Splotch Potion"},
			{new ArrayList<String>() {{add("Animal Fat");add("Bigguss Fruit");}},"Filling Potion"}
			}; 
	
	public Mixtures(){
			
	}
	
	@SuppressWarnings("unchecked")
	public static void Create(ArrayList<Item> x){//-
		for(int i=0;i<x.size();i++){//$
			mix.add(x.get(i).getName());
		}
		result.clear();
		System.out.println(mix);
		
		for (int i=0; i<RecipeTable.length; i++){
		while(((ArrayList<String>)RecipeTable[i][0]).containsAll(mix)==true&&mix.containsAll((Collection<?>)RecipeTable[i][0])==true&&mix.size()>=((ArrayList<String>)RecipeTable[i][0]).size()){
				result.add((String) RecipeTable[i][1]);
				for(int j=0;j<((ArrayList<String>)RecipeTable[i][0]).size();j++){
					mix.remove(((ArrayList<String>)RecipeTable[i][0]).get(j));
				}
				System.out.println(mix);
			}}
    }
	
	public static void printRecipeTable(){
		for (int i=0; i<2; i++){
			System.out.print((i+1)+": ");
            for (int j=0; j<RecipeTable.length; j++){
            	System.out.print(RecipeTable[j][i]+" ");
        }
            System.out.println();
		}
	}
	
	public static ArrayList<String> getResult(){
		return result;	
	}
}
