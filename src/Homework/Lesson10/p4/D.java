package Homework.Lesson10.p4;

import Homework.Lesson10.p1.A;
import Homework.Lesson10.p1.p2.p3.C;
import Homework.Lesson10.p4.p5.E;

import static Homework.Lesson10.p1.p2.B.b;
import static Homework.Lesson10.p1.p2.B.sb;

public class D {

    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.s+";variable from A, a= "+a1.a);
        C c1 = new C();
        System.out.println(c1.sc+";variable from C, c= "+c1.c);
        E e1 = new E();
        System.out.println(e1.se+";variable from E, e= "+e1.e);
        System.out.println(sb+";variable from B, b= "+b);
    }

}
