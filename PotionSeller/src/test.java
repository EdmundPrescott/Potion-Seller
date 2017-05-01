
public class test {

	public static void main(String[] args) {
		boolean go=true;
		int seconds=0;
		long startTime=System.nanoTime();
		while(go==true){
		if(startTime-System.nanoTime()<(-1000000000*10)){
			seconds++;
			System.out.println(seconds);
			startTime=System.nanoTime();
		}
		
		}

	}

}
