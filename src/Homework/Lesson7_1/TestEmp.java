package Homework.Lesson7_1;

import Homework.Lesson7.Employee;

public class TestEmp {
    public static void main(String[] args) {
        Employee emp1 = new Employee(2);
//        Employee emp2 = new Employee("NEwton");
//     Employee emp3 = new Employee(56000.0);

//        System.out.println("id :"+emp1.id);
        System.out.println(emp1.surname);
//        System.out.println(emp1.salary());

        emp1.getId();
        emp1.getSalary();
        emp1.getSurname();


    }
}
