package Homework.Lesson6;


public class Student {
    Student(int stud_id1,String firstname1,String lastname1,int kurs1,double mathAverageGrade1,double economyAverageGrade1,
            double foreignLangAverageGrade1){
        stud_id=stud_id1;
        firstname=firstname1;
        lastname=lastname1;
        kurs=kurs1;
        mathAverageGrade=mathAverageGrade1;
        economyAverageGrade=economyAverageGrade1;
        foreignLangAverageGrade=foreignLangAverageGrade1;

    }

    Student(int stud_id2,String firstname2,String lastname2,int kurs2){
        this(stud_id2,firstname2,lastname2,kurs2,0.0,0.0,0.0);
    }

    Student(){

    }


    int stud_id;
    String firstname;
    String lastname;
    int kurs;
    double mathAverageGrade;
    double economyAverageGrade; //average grade
    double foreignLangAverageGrade;
}

class studentTest{
    double srednArifm(Student st){
        double result = (st.economyAverageGrade+ st.mathAverageGrade+ st.foreignLangAverageGrade)/3;
        System.out.println("Seredniy bal studenta "+st.lastname+" "+result);
        return result;
    }

    public static void main(String[] args) {
        Student st1 = new Student(1,"Ivan","Dulskiy",5,3.6, 4.68,4.23);
        Student st2 = new Student(2,"Oleg","Shapoval",2);
        st2.mathAverageGrade = 4.12;
        st2.economyAverageGrade = 4.35;
        st2.foreignLangAverageGrade = 5.0;

        Student st3 = new Student();
        st3.stud_id = 25;
        st3.firstname = "Leva";
        st3.lastname = "Mort";
        st3.kurs = 2;
        st3.mathAverageGrade = 4.5;
        st3.economyAverageGrade = 4;
        st3.foreignLangAverageGrade = 3.5;

        studentTest stT1 = new studentTest();
        stT1.srednArifm(st1);
        stT1.srednArifm(st2);
        stT1.srednArifm(st3);

    }
}