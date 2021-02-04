package Homework.Lesson7;

public class Employee {
    public void getId(){
        System.out.println("Metod Show id "+id);
    }
    public void getSalary(){
        System.out.println("Metod Show salary "+ salary);
    }
    public void getSurname(){
        System.out.println("Metod Show surname "+ surname);
    }

    public Employee(int id2){
        id=id2;

    }
     Employee(String surname2){
         surname= surname2;
     }
     private Employee(double salary2){
         salary=salary2;
     }


    int id;
    public String surname;
    int age;
    private double salary;
    String department;
}


class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(2);
        Employee emp2 = new Employee("NEwton");
//        Employee emp3 = new Employee(56000.0);

        System.out.println("id :"+emp1.id);
        System.out.println(emp1.surname);
//        System.out.println(emp1.salary());

        System.out.println("id :"+emp2.id);
        System.out.println(emp2.surname);
//        System.out.println(emp2.salary());

        emp1.getId();
        emp1.getSalary();
        emp1.getSurname();

        System.out.println();
        emp2.getId();
        emp2.getSalary();
        emp2.getSurname();



    }
}






//    Employee(int id2,String surname2,int age2){
//        this (id2,surname2,age2,0.0,null);
//
//    }
//
//    public Employee(String surname3,int age3){
//        this (0,surname3,age3,0.0,null);
//
//    }
//
//    Employee(int id4,String surname4,int age4,double salary4,String department4){
//        id=id4;
//        age=age4;
//        salary= salary4;
//        department = department4;
//    }