package io.pragra.learning.demointerview.InterfacePractice;

public class Test {
    public static void main(String[] args) {

        ImplEmployee employee = new ImplEmployee();
        ImplDEpartment dEpartment = new ImplDEpartment();
        Manager manager = new Manager();
        manager.getPay();
        manager.work();
        manager.doingAuthenticationUser();
        manager.doOneOnOneMetting();
        dEpartment.workOnITDepartment();
        employee.work();
        employee.doOneOnOneMetting();
        employee.getPay();


    }
}
