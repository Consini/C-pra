package fan;

/**
 *
 * @author shinan
 */
public class Fan {

    /**
     * @param args the command line arguments
     */
    static int SLOW=1;
    static int MEDIUM=2;
    static int FAST=3;
    private int speed=SLOW;
    private boolean on =false;
    private double radius=5;
    private String color ="blue";
    public Fan(){   
    }
    public int getSpeed() {
	return speed;
    }
    public void setSpeed(int speed) {
	this.speed = speed;
    }
    public boolean getOn() {
	return on;
    }
    public void setOn(boolean on) {
	this.on = on;
    }
    public double getRadius() {
	return radius;
    }
    public void setRadius(double radius) {
	this.radius = radius;
    }
    public String getColor() {
	return color;
    }
    public void setColor(String color) {
	this.color = color;
    }
    public String tostring(){
        if(on)
            return " speed " + speed  + " color " + color  + " radius " + radius;
        else
            return " fan is off " + " color " + color + " radius " + radius;
    }
public static void main(String[] args) {
        Fan fan1=new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        
        Fan fan2=new Fan();
        fan2.setSpeed(MEDIUM);
        
        System.out.println("fan1:" + fan1.tostring());
        System.out.println("fan2:" + fan2.tostring());
    }
    
}

