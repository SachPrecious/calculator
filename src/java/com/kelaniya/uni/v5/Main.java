package com.kelaniya.uni.v5;

import com.kelaniya.uni.v5.input.CommandLineInputs;
import com.kelaniya.uni.v5.input.Inputs;
import com.kelaniya.uni.v5.operation.Operation;
import com.kelaniya.uni.v5.operation.OperationFactory;
import com.kelaniya.uni.v5.repository.FileNumberRepository;
import com.kelaniya.uni.v5.repository.NumberRepository;
import com.kelaniya.uni.v5.ui.CmdLineUI;
import com.kelaniya.uni.v5.ui.UI;
import java.io.IOException;

public class Main {

    //Main class is the coordinator now
    //Main class is only an entry point
    public static void main(String[] args) throws IOException {


        Inputs inputs =new CommandLineInputs(args);
        NumberRepository numberRepository = new FileNumberRepository();
        OperationFactory operationFactory = new OperationFactory();
        UI ui =new CmdLineUI();
        CalculatorApp app =new CalculatorApp(inputs,numberRepository,operationFactory,ui);
        app.execute();


    }
}
