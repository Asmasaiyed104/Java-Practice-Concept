package io.pragra.learning.demointerview;

public class Mother {
    // properties
    private String name;
    private int age= 30;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Test {
    public static void main(String[] args) {
        Mother mother = new Mother();
        System.out.println(mother.getName());
        System.out.println(mother.getAge());


    }
}

abstract class Child extends Mother{
    int age;

    // abstract method
    abstract void show();
    //concrete method
    public void setAge(int age) {
        System.out.println("Yes my age is " + age);
         this.age=age;
    }

    // concrete method
    public int getAge(int age){
        return age;
    }

}
class ImplementChild extends Child{
    @Override
    public void show() {
        System.out.println("child show");
    }
}
abstract class GrandChild extends Child {

}



