package Homework;

public class Student {
    int stud_id;
    String Firtname;
    String Lastname;
    int god;
    double math;
    double economy; //average grade
    double foreignlang;


}

class StudentTest{
    public static void main(String[] args) {

        Student st1 = new Student();
        st1.stud_id = 25;
        st1.Firtname = "Ivan";
        st1.Lastname = "Dulskiy";
        st1.god = 2018;
        st1.math = 4.5;
        st1.economy = 4;
        st1.foreignlang = 3.5;

        double sr_st1 = (st1.math+ st1.economy+ st1.foreignlang)/3;

        System.out.println("Seredniy bal studenta "+st1.Lastname+ " : "+sr_st1);


        Student st2 = new Student();
        st2.stud_id = 212;
        st2.Firtname = "Petr";
        st2.Lastname = "Rekrut";
        st2.god = 2016;
        st2.math = 3.45;
        st2.economy = 3.12;
        st2.foreignlang = 2.67;

        double sr_st2 = (st2.math+ st2.economy+ st2.foreignlang)/3;

        System.out.println("Seredniy bal studenta "+st2.Lastname+ " : "+sr_st2);


        Student st3 = new Student();
        st3.stud_id = 30;
        st3.Firtname = "Inokenty";
        st3.Lastname = "Baranov";
        st3.god = 2010;
        st3.math = 3.1;
        st3.economy = 2.75;
        st3.foreignlang = 4.79;

        double sr_st3 = (st3.math+ st3.economy+ st3.foreignlang)/3;

        System.out.println("Seredniy bal studenta "+st3.Lastname+ " : "+sr_st3);


    }

}