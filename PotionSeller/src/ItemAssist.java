import java.util.ArrayList;

public class ItemAssist {
	
	private int clickCount;
	private Item Item;
	private ArrayList<Item> returnValue = new ArrayList<Item>();

	public ItemAssist(Item item){
		Item=item;
	}
	
	public Item getItem(){
		return Item;
	}
	
	public void clickItem(){
		clickCount++;
	}
	
	public void clickItem(int clicks){
		clickCount+=clicks;
	}
	
	public ArrayList<Item> activate(){
		for(int i=0;i<clickCount;i++){
			returnValue.add(Item);
		}
		return returnValue;
	}
	
	
	
}
