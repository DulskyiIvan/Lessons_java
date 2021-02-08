package Homework.Lesson8;

public class DomZ8 {
    static final double PI = 3.14;

    double sKruga(double r) {
        double S = PI * r * r;
        return S;
    }

    static double dlinaO(double r1) {
        double d = 2 * PI * r1;
        return d;
    }

    void showInfo(double r3) {
        System.out.println("Radius " + r3 + " Ploshcha " + sKruga(r3) + " dlina " + dlinaO(r3));
    }
}

class DomZ8Test {
    public static void main(String[] args) {

        DomZ8 t1 = new DomZ8();
        System.out.println("Radius kola = " + t1.sKruga(5));
        double krugP = t1.sKruga(5);
        double dlina = DomZ8.dlinaO(4);
        t1.showInfo(5);
    }
}