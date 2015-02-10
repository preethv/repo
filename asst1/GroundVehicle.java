
public class GroundVehicle {
	
	double speed;
	double rotVel;
	
//vehicle position constraints	
	
	
//vv how do I specify the length of pose[3] in this constructor? 
	//Do I just specify it first like this?  :
	double[] pose = new double[3];
	//pose and velocity needs to have certain constraints
	//take in x, 
	public GroundVehicle(double x, double y, double theta, double s, double omega){
	pose[1] = x;
	pose[2] = y;
	pose[3] = theta;

		//internal representation of pos and vel are initialized based on constructor arguments
		//same constraints as control class
		//define velocity here
	}

	
	
	public double [] getPosition(){return pose;}
	public double [] getVelocity(){
		//take the time derivative of each member of pose[]
		//have it return pose for now, but change it to the velocity for the final submission
		return pose;}
	//it wants setPos to be double [3]
	public double setPosition(double setPos){return 0;}
	//it wants setVel to be double [3]
	public double setVelocity(double setVel){return 0;}
	public Control controlVehicle(Control c){return c;}
	public int updateState(int sec, int msec){return 0;}
	
}
	