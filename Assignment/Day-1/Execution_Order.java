//5. Write a program that illustrate the execution order of static block and initializer block?


public class Execution_Order {
   
    static {
        System.out.println("Static block executed.");
    }

    {
        System.out.println("Initializer block executed.");
    }

    public Execution_Order() {
        System.out.println("Constructor executed.");
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");

        System.out.println("Creating first object:");
        Execution_Order obj1 = new Execution_Order();

        System.out.println("Creating second object:");
        Execution_Order obj2 = new Execution_Order();
    }


}
