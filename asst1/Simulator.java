
public class Simulator {

	//defined the variable c so that [public Control getControl] will compile.
	Control c;
	
	public Simulator(){}
	
	public int getCurrentSec(){
		//return ms component of current Simulator clock 
		return 0;}
	
	public  int getCurrentMSec(){return 0;}
	
	public Control getControl(int sec, int msec){return c;}

	public int setNumSides(int n){return 0;}
	
	public void run(){}

	//Simulator class contains the main method:	
	public static void main(String argv[]){}

	
	

	
	
}
