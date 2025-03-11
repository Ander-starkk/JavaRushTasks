package com.javarush.task.pro.task10.task1008;

/* 
Зарплата
*/

public class Programmer {
    private int salary = 1000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > this.salary) {
            this.salary = salary;
        }

    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        System.out.println(programmer.getSalary());
        programmer.setSalary(100);
        System.out.println(programmer.getSalary());
        programmer.setSalary(2000);
        System.out.println(programmer.getSalary());
    }
}
