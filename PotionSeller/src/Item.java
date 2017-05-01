
public class Item {

	private String Name;
	private String OriginalLocation;
	private double Value;
	private int Rareity;
	
	public Item(String name, String location, int rareity){
		Name=name;
		OriginalLocation=location;
		Rareity=rareity;
	}
	
	
	public void setItemValue(double value){
		Value=value;
	}
	
	public String getName(){
		return Name;
	}

	public double getValue(){
		return Value;
	}
	
	public double getRareity(){
		return Rareity;
	}
	
	public String getOriginalLocation(){
		return OriginalLocation;
	}
	
	public void itemDetails(){
		System.out.println("Name: "+Name+" Original Location: "+OriginalLocation+" Rareity: "+Rareity);
	}
	
}
