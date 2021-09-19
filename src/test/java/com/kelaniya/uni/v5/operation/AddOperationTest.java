package com.kelaniya.uni.v5.operation;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class AddOperationTest {

    //followings are cases
    //5,6->ans11
    //1,2_>ans3
    //0,0->ans0
    //4,5->ans9
    //-1,-3->ans-4
    //-1,6->ans5



    //test cases
    //positive number+positive=>6+5=11
    //negative+negative=>
    //zero+zero
    //negative+positive
    @Test
    public void should_add_positive_values(){

        AddOperation addOperation=new AddOperation();
        Double result=addOperation.execute(new Double[]{5.0,6.0});
        assertThat(result,is(11.0));

    }
    @Test
    public void should_add_zeros(){

        AddOperation addOperation=new AddOperation();
        Double result=addOperation.execute(new Double[]{0.0,0.0});
        assertThat(result,is(0.0));

    }
    @Test
    public void should_add_negatives(){

        AddOperation addOperation=new AddOperation();
        Double result=addOperation.execute(new Double[]{-1.0,-2.0});
        assertThat(result,is(-3.0));

    }



}