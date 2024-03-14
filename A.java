/**
 * A
 */

    public class A {
        private int aValue;
    
        public A(int aValue) {
            this.aValue = aValue;
        }
    
        public void displayA() {
            System.out.println("Value of A: " + aValue);
        }
    
        public static void main(String[] args) {
            A aObject = new A(42);
            aObject.displayA();
        }
    }
/*
 * // Class B
public class B {
    private String bValue;

    public B(String bValue) {
        this.bValue = bValue;
    }

    public void displayB() {
        System.out.println("Value of B: " + bValue);
    }

    public static void main(String[] args) {
        B bObject = new B("Hello, World!");
        bObject.displayB();
    }
}

// Class C
public class C {
    private double cValue;

    public C(double cValue) {
        this.cValue = cValue;
    }

    public void displayC() {
        System.out.println("Value of C: " + cValue);
    }

    public static void main(String[] args) {
        C cObject = new C(3.14);
        cObject.displayC();
    }
}
 */