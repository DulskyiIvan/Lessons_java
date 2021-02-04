package Homework.Lesson5;

import Lesson4.BankAccount;

public class BankAcc {
    int id;
    String name;
    double balance;

    void popovnenniaRahunku(double popovn){
        balance+=popovn;

    }

    void zniattiaZRahunku(double zn){
        balance-=zn;

    }

    void showInfo(){
        System.out.println("Balans user "+ name+" "+balance);
    }

}


class BankAccTest{
    public static void main(String[] args) {

        BankAcc Acc1 = new BankAcc();
        BankAcc Acc2 = new BankAcc();


        Acc1.id = 1;
        Acc1.name = "Ivan";
        Acc1.balance = 12.35;



        Acc2.id = 2;
        Acc2.name = "Johny";
        Acc2.balance = 125.25;

//        Acc1.popovnenniaRahunku(25.5);
        Acc1.zniattiaZRahunku(2.35);

        Acc1.showInfo();

//        Acc2.popovnenniaRahunku(25.5);
         Acc1.zniattiaZRahunku(2.35);

       Acc2.showInfo();



    }

}
