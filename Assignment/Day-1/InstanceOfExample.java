// 10. Write a program to check whether the object is an instance of a particular class?
class Vehicle {
    
}

class Car extends Vehicle {

}

public class InstanceOfExample {
    public static void main(String[] args) {

        Car myCar = new Car();

        if (myCar instanceof Car) {
            System.out.println("myCar is an instance of Car");
        }

        if (myCar instanceof Vehicle) {
            System.out.println("myCar is also an instance of Vehicle");
        }

        if (myCar instanceof Object) {
            System.out.println("myCar is also an instance of Object");
        }
    }
}
