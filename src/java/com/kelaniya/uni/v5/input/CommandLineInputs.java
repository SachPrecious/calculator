package com.kelaniya.uni.v5.input;

public class CommandLineInputs implements Inputs {

    private final String[] args;

    public CommandLineInputs(String[] arguments){
        this.args=arguments;
    }


    public String getOperator() throws InvalidInputException {
        //validate the arguments before using
        if (args.length == 0) {
            throw new InvalidInputException("Please provide the operation as an argument");
        }
        //System.out.println(args[0]);
        String operator = args[0];
        if (!(operator.equals("add") || operator.equals("mul") || operator.equals("sub")||operator.equals("div"))) {
            throw new InvalidInputException("Please provide add sub or mul as the operator argument");
        }

    return operator;
    }


}
