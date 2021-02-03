package Lesson1;

public class DZ2 {
    public static void main(String[] args) {
        byte b1 = 12;  // 10
        byte b2 = 0b1100;  // 2
        byte b3 = 014; // 8
        byte b4 = 0xC;   //16

        System.out.println("Zavdanya 1");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        short s1 = 1300;
        short s2 = 0b0101_0001_0100;
        short s3 = 0_2424;
        short s4 = 0x514;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        int i1 = 0;
        int i2 = 0b0;
        int i3 = 00;
        int i4 = 0x0;


        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);


        long l1 =123456789;
        long l2 =0b0111_0101_1011_1100_1101_0001_0101;
        long l3 =0_726_746_425;
        long l4 =0x75B_CD15;

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);


        System.out.println("\nZavdanya 2");

        float f1 = 2.5F;
        float f2 = 4.7F;

        System.out.println(f1);
        System.out.println(f2);


        double d1 = 1.7;
        double d2 = -3.8;

        System.out.println(d1);
        System.out.println(d2);

        boolean bole1 = true;
        boolean bole2 = false;

        System.out.println(bole1);
        System.out.println(bole2);

        System.out.println("\nZavdanya 3");

        char c1 = 'g';
        char c2 = 350;
        char c3 = '\u015E';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

     }
}
