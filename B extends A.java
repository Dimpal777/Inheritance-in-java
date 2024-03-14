
// Class A (Superclass)
/* 
class A {
    private int aValue;

    public A(int aValue) {
        this.aValue = aValue;
    }

    public void displayA() {
        System.out.println("Value of A: " + aValue);
    }
}

// Class B (Subclass of A)
class B extends A {
    private String bValue;

    public B(int aValue, String bValue) {
        super(aValue); // Call the superclass constructor
        this.bValue = bValue;
    }

    public void displayB() {
        System.out.println("Value of B: " + bValue);
    }
}

// Class C (Subclass of B)
class C extends B {
    private double cValue;

    public C(int aValue, String bValue, double cValue) {
        super(aValue, bValue); // Call the superclass constructor
        this.cValue = cValue;
    }

    public void displayC() {
        System.out.println("Value of C: " + cValue);
    }
}

// Main class to demonstrate usage
public class Main {
    public static void main(String[] args) {
        A aObject = new A(42);
        aObject.displayA();

        B bObject = new B(10, "Hello");
        bObject.displayA(); // Accessing superclass method
        bObject.displayB();

        C cObject = new C(5, "World", 3.14);
        cObject.displayA(); // Accessing superclass method
        cObject.displayB(); // Accessing superclass method through inheritance
        cObject.displayC();
    }
}
*/
