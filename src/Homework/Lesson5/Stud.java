package Homework.Lesson5;

public class Stud {
    int stud_id;
    String Firtname;
    String Lastname;
    int kurs;
    double mathAverageGrade;
    double economyAverageGrade; //average grade
    double foreignLangAverageGrade;


}

class studTest{

    double srednArf(Stud st){

        double result = (st.economyAverageGrade+ st.mathAverageGrade+ st.foreignLangAverageGrade)/3;
        System.out.println("Seredniy bal studenta "+st.Lastname+" "+result);
        return result;
    }

    public static void main(String[] args) {
        Stud st1 = new Stud();
        st1.stud_id = 25;
        st1.Firtname = "Ivan";
        st1.Lastname = "Dulskiy";
        st1.kurs = 2;
        st1.mathAverageGrade = 4.5;
        st1.economyAverageGrade = 4;
        st1.foreignLangAverageGrade = 3.5;

        studTest sTest = new studTest();
        sTest.srednArf(st1);
    }

}
