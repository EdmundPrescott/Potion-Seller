public class TimeModule { 

    private static long start;
    private static int time;
    private static int pastTime = 0;
    private static boolean running = false;
    

    public TimeModule(){} 

    public static void startGameTime(){
    	running = true;
    	start = System.currentTimeMillis() - time * 1000;
    }
    
    public static void pauseGameTime(){
    	updateGameTime();
    	running = false;
    }
    
    public static void skipGameTimeForward(int seconds){
    	time += seconds;
    }
    
    public static void setGameTime(int seconds){
    	time = seconds;
    }
    
    public static int TimeElapsed(){
    	if(running==true){
    	updateGameTime();
    	}
    	return time;
    }
    
    public static void printElapsingTime(){
    	updateGameTime();
    	if(time>pastTime){
    	pastTime = time;
    	System.out.println(time);
    	}
    }
    
    public static void resetGameTime(){
    	time = 0;
    }
    
    public static void updateGameTime(){
    	long now = System.currentTimeMillis();
    	time += (int)((now - start) / 1000.0) - time;
    }
    
    
}