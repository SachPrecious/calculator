package com.kelaniya.uni;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("E:\\SoftwareCons\\calculator\\src\\java\\com.kelaniya.uni\\numbers.txt");
        Scanner scannerFile = new Scanner(file);
        int x = scannerFile.nextInt();
        int y= scannerFile.nextInt();

        Calc cal1 = new Calc(x,y);

        Scanner scan = new Scanner(System.in);
        int opt = scan.nextInt();
        
        if(opt==1)
           cal1.addition();
        else if(opt==2)
           cal1.subs();
        else if(opt==3)
           cal1.multiply();
        else if(opt==4)
           cal1.division();
        else
          System.out.println("Option Is Not Valid ");            
        
        scan.close();
        scannerFile.close();
    }
}