class Employee6 {
    String name;
    int yearOfJoining;
    String address;

    Employee6(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    void printInfo() {
        System.out.printf("%-10s %-15d %s\n", name, yearOfJoining, address);
    }

    public static void main(String[] args) {
        Employee6 e1 = new Employee6("Robert", 1994, "64C- WallsStreat");
        Employee6 e2 = new Employee6("Sam", 2000, "68D- WallsStreat");
        Employee6 e3 = new Employee6("John", 1999, "26B- WallsStreat");

        System.out.printf("%-10s %-15s %s\n", "Name", "Year of joining", "Address");

        e1.printInfo();
        e2.printInfo();
        e3.printInfo();
    }
}
