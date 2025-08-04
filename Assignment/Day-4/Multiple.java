
class A {
    void show() {
        System.out.println("Class A");
    }
}


class B {
    void show() {
        System.out.println("Class B");
    }
}

/* This will cause a compile-time error
 because Java doesn't allow multiple inheritance using classes

class C extends A, B {  // ❌ Compile-time error: '','' expected
    // Compilation will fail here
}
*/

public class Multiple {
    public static void main(String[] args) {
        System.out.println("Java does not support multiple inheritance using classes.");
    }
}
