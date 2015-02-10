
public class Control {
	
	double speed;
	double rotVel;
	
public Control(double s, double omega){
//s and omega can only be between certainv values
speed = s;
rotVel = omega;	
}

public double getSpeed(){
	return speed;
}

public double getRotVel(){
	return rotVel;
}


}
