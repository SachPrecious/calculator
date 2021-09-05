package com.kelaniya.uni.v4;

public class CommandLineInputs {

    private final String[] args;

    public CommandLineInputs(String[] arguments){
        this.args=arguments;
    }


    public String getOperator() {
        //validate the arguments before using
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument");
            return "";//will change in the future
        }
        //System.out.println(args[0]);
        String operator = args[0];
        if (!(operator.equals("add") || operator.equals("mul") || operator.equals("sub")||operator.equals("div"))) {

            System.out.println("Please provide add sub or mul as the operator argument");
            return "";//will change in the future
        }

    return operator;
    }


}
