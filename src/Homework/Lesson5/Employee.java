package Homework.Lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

     Employee(int id2,String surname2,int age2,double salary2,String department2){
        id=id2;
        surname=surname2;
        age=age2;
        salary=salary2;
        department = department2;
    }

    void salaryUp(){
        salary*=2;
    }


}


class EmployeeTest{

    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Dulskiy",23,2350,"SA");
        Employee emp2 = new Employee(2,"Petrov",25,3040,"Design");


        emp1.salaryUp();
        emp2.salaryUp();

        System.out.println("After salaryUP "+emp1.surname+" have: "+emp1.salary);
        System.out.println("After salaryUP "+emp2.surname+" have: "+emp2.salary);
    }
}
