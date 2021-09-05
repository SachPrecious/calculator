package com.kelaniya.uni.v4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//this class name can be changed
public class FileReader {


    public Double[] getNumbers() throws IOException { //will change the signature too..


        //read the numbers from the text file
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("E:\\SoftwareCons\\calculator\\src\\java\\com.kelaniya.uni\\numbers.txt")
                //Paths.get("E:\\SoftwareCons\\calculator\\numbers.txt")

        );



        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        return new Double[]{number1,number2};
    }


}
