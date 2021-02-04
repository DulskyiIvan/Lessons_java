package Homework.Lesson6;

public class Overloading {
    int sum(){
        return 0;
    }

    int sum(int a){
        return a;
    }

    int sum (int a,int b){
        return this.sum(a,b,0,0);
    }

    int sum (int a,int b,int c){
        return this.sum(a,b,c,0);
    }

    int sum (int a,int b,int c,int d){
        return a+b+c+d;
    }
}

class overloadingTest{
    public static void main(String[] args) {
        Overloading ov1 = new Overloading();
        int a = 2,b=6,c=14,d=1;

        System.out.println("Suma 0 chisel "+ov1.sum());
        System.out.println("Suma 2 chisel "+a+","+b+" = "+ ov1.sum(a,b) );
        System.out.println("Suma 3 chisel "+a+","+b+","+c+" = "+ ov1.sum(a,b,c));
        System.out.println("Suma 4 chisel "+a+","+b+","+c+","+d+" = "+ ov1.sum(a,b,c,d));

    }
}
