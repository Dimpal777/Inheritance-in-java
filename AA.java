
// Class AA (Superclass)
class AA {
    private int aValue;

    public AA(int aValue) {
        this.aValue = aValue;
    }

    public void displayA() {
        System.out.println("Value of A: " + aValue);
    }

    // Specific method for AA
    public void methodAA1() {
        System.out.println("Method specific to AA");
    }

    // Overridden method
    public void overriddenMethod() {
        System.out.println("Overridden method in AA");
    }
}

// Class BB (Subclass of AA)
class BB extends AA {
    private String bValue;

    public BB(int aValue, String bValue) {
        super(aValue); // Call the superclass constructor
        this.bValue = bValue;
    }

    public void displayB() {
        System.out.println("Value of B: " + bValue);
    }

    // Specific method for BB
    public void methodBB1() {
        System.out.println("Method specific to BB");
    }

    // Overridden method
    @Override
    public void overriddenMethod() {
        System.out.println("Overridden method in BB");
    }
}

// Class CC (Subclass of BB)
class CC extends BB {
    private double cValue;

    public CC(int aValue, String bValue, double cValue) {
        super(aValue, bValue); // Call the superclass constructor
        this.cValue = cValue;
    }

    public void displayC() {
        System.out.println("Value of C: " + cValue);
    }

    // Specific method for CC
    public void methodCC1() {
        System.out.println("Method specific to CC");
    }

    // Overridden method
    @Override
    public void overriddenMethod() {
        System.out.println("Overridden method in CC");
    }
}

    class Main {
    public static void main(String[] args) {
        AA aaObject = new AA(42);
        aaObject.displayA();
        aaObject.methodAA1();
        aaObject.overriddenMethod();

        BB bbObject = new BB(10, "Hello");
        bbObject.displayA(); // Accessing superclass method
        bbObject.displayB();
        bbObject.methodBB1();
        bbObject.overriddenMethod();

        CC ccObject = new CC(5, "World", 3.14);
        ccObject.displayA(); 
        ccObject.displayB(); 
        ccObject.displayC();
        ccObject.methodCC1();
        ccObject.overriddenMethod();
    }
}
