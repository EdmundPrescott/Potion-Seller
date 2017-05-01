import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class FileIn {

	private ArrayList<Item> Items = new ArrayList<Item>();
	private static Item Item = new Item(null, null, 0);
	private String[][] potionData = null;
	private static ArrayList<String> itemDetails = new ArrayList<String>();
	private static boolean print=false;
	private static String fileName = "PotionCatalog.txt";
	
	public FileIn(){
		
	}
	
	public static Item readLocatoin(String startIndex) throws FileNotFoundException{
        // This will reference one line at a time
        String line = null;
        try {
            // FileReader reads text files in the default encoding.
            java.io.FileReader fileReader = new java.io.FileReader(fileName);
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
            	
            	if(line.equalsIgnoreCase(startIndex)&&!line.equals("")){
            		print=true;
            	}
            	
            	if(line.equals("---")){
            		print=false;
            	}
            	
            	if(print==true){
            		if(!line.equals("")&&line!=null){
            			itemDetails.add(line);
            		}
            		//System.out.println(line);//very useful for bug fixing
            	}
            }//End of while loop i.e using file information 
            // Always close files.
            bufferedReader.close();         
        }///End of try bracket
        catch(FileNotFoundException ex){System.out.println("Unable to open file '" +fileName+ "'");}
        catch(IOException ex){System.out.println("Error reading file '"+fileName+ "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        
        
        return Item;
	}
	
}