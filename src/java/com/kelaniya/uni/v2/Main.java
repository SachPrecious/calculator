package com.kelaniya.uni.v2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument");
            return;
        }
        //System.out.println(args[0]);
        String operator = args[0];
        if (!(operator.equals("add") || operator.equals("mul") || operator.equals("sub"))) {

            System.out.println("Please provide add sub or mul as the operator argument");
            return;
        }

       /*

       //one way is using try catch
       try{

           Files.readAllLines(Paths.get("E:\\SoftwareCons\\calculator\\src\\java\\com.kelaniya.uni\\numbers.txt"));

       }
       catch (IOException e){
           System.out.println("Failed to read the numbers file.Make sure that the file exists or the path is correct.");
           e.printStackTrace();
       }
      */

        //read the numbers from the text file
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("E:\\SoftwareCons\\calculator\\src\\java\\com.kelaniya.uni\\numbers.txt")
        );


        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        double result = 0;

        //Or We can use a switch case
        if (operator.equals("add")) {
            result = number1 + number2;
        } else if (operator.equals("sub")) {
            result = number1 - number2;

        } else if (operator.equals("mul")) {
            result = number1 * number2;

        }


    }
}
