package io.pragra.learning.demointerview.InterfacePractice;

public class Manager implements Department,Employee{

    public void doingAuthenticationUser(){
        System.out.println("doingAutheticationUser");
    }
    @Override
    public void workOnITDepartment(){
        System.out.println("It Department");
    }
    @Override
    public void work(){
        System.out.println("employee");
    }

    @Override
    public void getPay(){
        System.out.println("getting pay");
    }

    @Override
    public void doOneOnOneMetting(){
        System.out.println("meeting");
    }
}

