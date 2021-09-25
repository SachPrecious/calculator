package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import java.lang.management.OperatingSystemMXBean;

import static org.junit.Assert.*;


import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;


public class OperationFactoryTest {

    //What are you going to test
    //this is the most important thing
    //1.if the operator is add->should return an object of AddOperation class
    @Test
    public void should_return_AddOperation_object_when_operator_is_add(){
        OperationFactory operationFactory=new OperationFactory();
        Operation operation=operationFactory.getInstance("add");

        //verify that the operation object is an instance of AddOperation class
        assertThat(operation,instanceOf(AddOperation.class));

    }

    //2.if the operator is mul->should return an object of MulOperation class

    @Test
    public void should_return_MulOperation_object_when_operator_is_mul(){
        OperationFactory operationFactory=new OperationFactory();
        Operation operation=operationFactory.getInstance("mul");

        //verify that the operation object is an instance of AddOperation class
        assertThat(operation,instanceOf(MulOperation.class));

    }


    //3.if the operator is div->should return an object of DivOperation class

    @Test
    public void should_return_DivOperation_object_when_operator_is_div(){
        OperationFactory operationFactory=new OperationFactory();
        Operation operation=operationFactory.getInstance("div");

        //verify that the operation object is an instance of AddOperation class
        assertThat(operation,instanceOf(DivOperation.class));

    }


    //4.if the operator is sub->should return an object of SubOperation class

    @Test
    public void should_return_SubOperation_object_when_operator_is_sub(){
        OperationFactory operationFactory=new OperationFactory();
        Operation operation=operationFactory.getInstance("sub");

        //verify that the operation object is an instance of AddOperation class
        assertThat(operation,instanceOf(SubOperation.class));

    }



}