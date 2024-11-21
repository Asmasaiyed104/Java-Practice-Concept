package io.pragra.learning.demointerview.Keyword;

public class Employee {

    String name;
    int age;

    Employee(String name,int myAge){
        this.name= name;
        this.age = myAge;
    }
    Employee(String name){
        this(name, 30);
    }

    public void work(){
        System.out.println("I am working");
    }
    public String getPay(){
        this.work();
        return "pay";
    }

    public void display(){
        System.out.println("name:  " + name + "age : "+age);
    }


}
class EmployeeTest{

    public static void main(String[] args) {
        Employee employee = new Employee("Asma",25);
        Employee employee1 = new Employee("Ashwini");
        SubEmployee subEmployee = new SubEmployee("Deep");
        subEmployee.workSlow();
        employee1.display();
        employee.getPay();



    }

}
class SubEmployee extends Employee{

    SubEmployee(String name ){
        super(name);
    }

    public void workSlow(){
        super.work();

        System.out.println("Name  " +super.name);

    }
}
