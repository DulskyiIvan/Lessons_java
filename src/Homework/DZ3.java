package Homework;

public class DZ3 {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0 ;

        result = i2 /d1 + d2%i1 - l;

        double j= d2%5;
        System.out.println(j);
        System.out.println(result);



        int a = 5;
        int resulta = a-- - --a + ++a + a++ +a;

        int b = 8;

        int resultb= ++b - b++ + ++b- --b;

        System.out.println(resulta);
        System.out.println(resultb);


    }
}
