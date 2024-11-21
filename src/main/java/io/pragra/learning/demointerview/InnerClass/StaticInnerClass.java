package io.pragra.learning.demointerview.InnerClass;

public class StaticInnerClass {
    private static int num = 3;

    // Correctly declaring a static nested class
    static class InnerStaticInnerClass {
        void display() {
            System.out.println("Display: " + num);  // Can access static members of the outer class
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the static nested class
        StaticInnerClass.InnerStaticInnerClass innerClass = new StaticInnerClass.InnerStaticInnerClass();
        innerClass.display();  // Calling the method of the nested class
    }
}
