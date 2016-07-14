public class Fan {

	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	private int speed;
	private double radius;
	private boolean on;
	String color;
	
	Fan() {
		speed = SLOW;
		radius = 5;
		on = false;
		color = "blue";
	}
	
	public Fan(int newSpeed, double newRadius, String newColor, boolean newOn) {
		speed = newSpeed;
		radius = newRadius;
		color = newColor;
		on = newOn;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public boolean isOn() {
		return on;
	}
	
	public void setOn(boolean newOn) {
		on = newOn;
	}

	public String toString() {	
		if (on == true) {
		return "Speed is: " + speed + "\tRadius is: " + radius + "\tColor is: " + color;
	} 		else {
			return "ALERT! ALERT! Fan is off!" + "\tRadius is: " + radius + "\tColor is: " + color;
		}
	}
}
