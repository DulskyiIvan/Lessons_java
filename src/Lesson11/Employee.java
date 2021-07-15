package Lesson11;



public class Employee {
    public String name;
    public double salary;


    Employee(String name,double salary){
        this.name= name;
        this.salary= salary;
    }

    public double upper(double a){
        a=a*2;
        return a;
    }
    public double upperzp2(){
       salary = salary * 2;
       return salary;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan",100.500);
        double u = emp1.upper(emp1.salary);
        System.out.println(u);
        System.out.println(emp1.salary);
        emp1.upperzp2();
        System.out.println(emp1.salary);
    }
}
