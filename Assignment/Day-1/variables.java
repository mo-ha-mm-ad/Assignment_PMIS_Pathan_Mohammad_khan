
//1. Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?


public class variables {
   static String staticVar = "Printing static variable";
   String instanceVar = "Printing Instance";
   final String finalVar;
   public variables(String finalVar) {
        this.finalVar = finalVar;
    }

    public void demonstrateScopes() {
        String localVar = "printing local variables";
        System.out.println("Local variable: " + localVar);

        if (true) {
            String blockVar = "Printing if block variable";
            System.out.println("Block variable: " + blockVar);
        }

        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
        System.out.println("Final variable: " + finalVar);
    }
    public static void main(String... args) {
        variables obj1 = new variables("final variable");
        obj1.demonstrateScopes();
        System.out.println("Accessing staticVar from main: " + obj1.staticVar);
    }
}
