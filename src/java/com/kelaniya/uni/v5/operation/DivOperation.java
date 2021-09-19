package com.kelaniya.uni.v5.operation;

import java.awt.dnd.InvalidDnDOperationException;

public class DivOperation implements Operation {

    public Double execute(Double[] numbers) throws InvalidCalcOperationException {

       if (numbers[1]==0){
           throw new InvalidCalcOperationException("Do Not divide by zero !");

       }

        return numbers [0] / numbers[1];

    }


}
