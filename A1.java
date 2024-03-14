// Class A1
class A1 {
    public void methodA1() {
        System.out.println("Method A1");
    }
}

// Class B (Subclass of A1)
class B extends A1 {
    public void methodB() {
        System.out.println("Method B");
    }
}

// Class C
class C {
    public void methodC() {
        System.out.println("Method C");
    }
}

// Main class with main method
   class Main {
    public static void main(String[] args) {
        // Create objects for each class
        A1 a1Object = new A1();
        B bObject = new B();
        C cObject = new C();
        
        // Call every method of class A1 using its own object
        a1Object.methodA1();
        
        // Call every method of class B using its own object
        bObject.methodA1(); // Method inherited from superclass A1
        bObject.methodB();
        
        // Call every method of class C using its own object
        cObject.methodC();
    }
}
