public class Student2 {
    String name;
    int roll_no;
    int phone_no;
    String address;


    Student2(String name, int roll_no, int phone_no, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }

     void displayDetails() {
        System.out.printf("Name     : %-10s \nRoll No  : %-10d \nPhone No : %-10d \nAddress  : %-20s \n\n",name,roll_no,phone_no,address);
    }

    // void displayDetails() {
    //     System.out.println("Name: " + name + "\nRoll No: " + roll_no + "\nPhone No: " + phone_no + "\nAddress: " + address + "\n\n");
    // }

    public static void main(String[] args) {
        Student2 student1 = new Student2("Sam", 1, 987654321, "123 Street, City");
        Student2 student2 = new Student2("John", 2, 876543210, "456 Avenue, City");

        student1.displayDetails();
        student2.displayDetails();
    }
}
