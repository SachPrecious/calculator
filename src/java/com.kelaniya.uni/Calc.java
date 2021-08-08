package com.kelaniya.uni;

public class Calc {

    int no1;
    int no2;

    public Calc(int x, int y){
        System.out.printf("Enter the Option(opt): 1 to addition / 2 To subtract /3 To Multiply /4 To Divide ");
        this.no1 = x;
        this.no2= y;
    }

    public void subs(){
        System.out.println(no1 - no2);
    }

    public void addition(){
        System.out.println(no1 + no2);
    }

    public void multiply(){
        System.out.println(no1*no2);
    }

    public void division(){
        System.out.println((double) no1 / no2);
    }


}
