package Lesson8;

public class Test {
     public final int a ;


     Test(){
         a= 10;
     }

     Test(boolean b){
         a=15;
     }

     public  void abc(final  short s){
         final byte b ;
         b=10;
         System.out.println(s+b);
     }


    public static void main(String[] args) {
        Test t =new Test();
        System.out.println(t.a);
    }
}
