package com.kelaniya.uni.v5.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//this class name can be changed
public class FileNumberRepository implements NumberRepository{


    public Double[] getNumbers() throws NumberRepositoryException {


        //read the numbers from the text file
        List<String> numbersStrs = null;
        try {
            numbersStrs = Files.readAllLines(
                    //Paths.get("E:\\SoftwareCons\\calculator\\src\\java\\com.kelaniya.uni\\numbers.txt")
                    Paths.get("E:\\SoftwareCons\\calculator\\numbers.txt")

            );
        } catch (IOException e) {
            //e.printStackTrace();

            throw new NumberRepositoryException(e,"Could not read the text file");
        }




        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        return new Double[]{number1,number2};
    }


}
