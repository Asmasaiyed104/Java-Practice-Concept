package io.pragra.learning.demointerview.InnerClass;

// actually it is tightly coupling
public class NonstaticInner {

    int age ;

    public class InnerClass{

        void diplay(){
            System.out.println("Display");
        }
    }
    public void outerClassMethod(){
        InnerClass innerClass = new InnerClass();
        innerClass.diplay();
    }

    public static void main(String[] args) {
        NonstaticInner nonstaticInner = new NonstaticInner();
        nonstaticInner.outerClassMethod();
    }
}
