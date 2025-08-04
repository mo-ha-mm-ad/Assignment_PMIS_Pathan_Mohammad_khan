/*1. We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.
‌ */


class Vehicle {

    double mileage;
    double price;
}

class Car extends Vehicle {
    double ownershipCost;
    int warranty; 
    int seatingCapacity;
    String fuelType;
}


class Bike extends Vehicle {
    int cylinders;
    int gears;
    String coolingType;
    String wheelType;
    double fuelTankSize; 
}

class Audi extends Car {
    String modelType;

    public void display() {
        System.out.println("----- Audi Details -----");
        System.out.println("Model Type: " + modelType);
        System.out.println("Ownership Cost: " + ownershipCost);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Price: " + price);
    }
}

class Ford extends Car {
    String modelType;

    public void display() {
        System.out.println("----- Ford Details -----");
        System.out.println("Model Type: " + modelType);
        System.out.println("Ownership Cost:  " + ownershipCost);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Price:  " + price);
    }
}


class Bajaj extends Bike {
    String makeType;

    public void display() {
        System.out.println("----- Bajaj Details -----");
        System.out.println("Make Type: " + makeType);
        System.out.println("Cylinders: " + cylinders);
        System.out.println("Gears: " + gears);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Wheel Type: " + wheelType);
        System.out.println("Fuel Tank Size: " + fuelTankSize + " inches");
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Price: " + price);
    }
}

class TVS extends Bike {
    String makeType;

    public void display() {
        System.out.println("----- TVS Details -----");
        System.out.println("Make Type: " + makeType);
        System.out.println("Cylinders: " + cylinders);
        System.out.println("Gears: " + gears);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Wheel Type: " + wheelType);
        System.out.println("Fuel Tank Size: " + fuelTankSize + " inches");
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Price: " + price);
    }
}


public class VehicleInfo {
    public static void main(String[] args) {
        
        Audi audi = new Audi();
        audi.modelType = "Q7";
        audi.ownershipCost = 200000;
        audi.warranty = 5;
        audi.seatingCapacity = 5;
        audi.fuelType = "Diesel";
        audi.mileage = 15;
        audi.price = 8000000;
        audi.display();

        System.out.println();


        Ford ford = new Ford();
        ford.modelType = "Endeavour";
        ford.ownershipCost = 150000;
        ford.warranty = 4;
        ford.seatingCapacity = 7;
        ford.fuelType = "Petrol";
        ford.mileage = 12;
        ford.price = 4500000;
        ford.display();

        System.out.println();

        Bajaj bajaj = new Bajaj();
        bajaj.makeType = "Pulsar 220F";
        bajaj.cylinders = 1;
        bajaj.gears = 5;
        bajaj.coolingType = "Oil";
        bajaj.wheelType = "Alloys";
        bajaj.fuelTankSize = 13;
        bajaj.mileage = 40;
        bajaj.price = 140000;
        bajaj.display();

        System.out.println();

        
        TVS tvs = new TVS();
        tvs.makeType = "Apache RTR 160";
        tvs.cylinders = 1;
        tvs.gears = 5;
        tvs.coolingType = "Air";
        tvs.wheelType = "Alloys";
        tvs.fuelTankSize = 12;
        tvs.mileage = 45;
        tvs.price = 125000;
        tvs.display();
    }
}
