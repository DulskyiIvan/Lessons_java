package Homework.Lesson8;

public class DZ8 {

    public static int multipl(int a, int b, int c) {
        int result = a * b * c;
        return result;
    }

    public static void remaind(int a1, int b1) {
        int result = a1 / b1;
        System.out.println("Celoe chastnoe " + result + " ; Ostatok : " + a1 % b1);
    }

}

class DZ8Test {
    public static void main(String[] args) {

        System.out.println("Pisla mozhennya  chsisel ravno " + DZ8.multipl(6, 2, 8));
        System.out.println("Pisla mozhennya  chsisel ravno " + DZ8.multipl(3, 7, 25));

        DZ8.remaind(10, 3);
        DZ8.remaind(20, 7);
    }
}
