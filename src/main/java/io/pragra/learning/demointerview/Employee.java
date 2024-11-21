package io.pragra.learning.demointerview;

public class Employee implements Cloneable { // Implement Cloneable interface

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Call Object's clone method
    }

    String name;

    // Constructor
    Employee(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        try {
            // Create an original Employee object
            Employee original = new Employee("Asma");

            // Clone the Employee object
            Employee cloned = (Employee) original.clone();

            // Modify the cloned object's name
            cloned.name = "Nouman";

            // Print the names of original and cloned objects
            System.out.println("Original Employee name: " + original.name);
            System.out.println("Cloned Employee name: " + cloned.name);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
