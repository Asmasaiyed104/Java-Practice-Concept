package io.pragra.learning.demointerview.InterfacePractice;

public class ImplEmployee implements Employee {
    @Override
    public void work(){
        System.out.println("I am implemented employee");
    }

    @Override
    public void getPay(){
        System.out.println("I am getting pay");
    }

    @Override
    public void doOneOnOneMetting(){
        System.out.println("I am implemented class of meeting");
    }

}
