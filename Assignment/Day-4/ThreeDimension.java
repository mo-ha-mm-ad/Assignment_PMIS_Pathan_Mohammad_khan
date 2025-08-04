/*
2. Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"
 */

    class TwoD {
    protected double x;
    protected double y;

    
    public TwoD() {
        System.out.println("TwoD default constructor");
        this.x = 0;
        this.y = 0;
    }

    
    public TwoD(double x, double y) {
        System.out.println("TwoD constructor with two arguments");
        this.x = x;
        this.y = y;
    }

    
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}


class ThreeD extends TwoD {
    private double z;

    
    public ThreeD() {
        super(); 
        this.z = 0;
    }

    
    public ThreeD(double x, double y, double z) {
        super(x, y); 
        this.z = z;
    }

    
    public void setZ(double z) {
        this.z = z;
    }

   
    public double getZ() {
        return z;
    }

    
    public double distanceTo(ThreeD other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        double dz = this.z - other.z;

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    
    public void displayCoordinates() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
}


public class ThreeDimension {
    public static void main(String[] args) {
        
        ThreeD point1 = new ThreeD();
        point1.setX(2);
        point1.setY(3);
        point1.setZ(4);

        
        ThreeD point2 = new ThreeD(5, 6, 7);

        System.out.print("Point 1: ");
        point1.displayCoordinates();

        System.out.print("Point 2: ");
        point2.displayCoordinates();

        double distance = point1.distanceTo(point2);
        System.out.println("Distance between the points: " + distance);
    }
}


