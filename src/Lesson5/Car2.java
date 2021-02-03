package Lesson5;

public class Car2 {

    Car2(String cvet,String motor){
        color = cvet;
        engine = motor;


    }

    String color;
    String engine;
    int speed;

    int gaz(int skorost){
        speed+=skorost;
        return speed;
    }
    int tormoz(int skorost){
        speed-=skorost;
        return speed;
    }

    void showInfo(){
        System.out.println("Cvet: "+color+" motor"+engine+" skorost"+speed);
    }
}

class Car2Test{
    public static void main(String[] args) {
        Car2 c1 = new Car2("White","V8");
        System.out.println(c1.color);
        System.out.println(c1.engine);

//        c1.color="white";
//        c1.engine="V6";
//        c1.speed =60;
//
//        c1.showInfo();
//        c1.gaz(20);
//        c1.showInfo();
//        c1.tormoz(80);
//        c1.showInfo();
    }
}
