import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;




class CalculatorTests{


    @ParameterizedTest
    @MethodSource("stringFactory")

    void testStrings(String str){

        assertFalse(str.isEmpty());
    }



    static List<String> stringFactory(){

        return List.of("apple","banana","lemon","orange");
    }



    @ParameterizedTest
    @ValueSource(ints={0,2,4,1000})
    void testIsEven(int arg){
        Calculator calculator=new Calculator();

        assertTrue(calculator.isEven(arg));



    }


    @ParameterizedTest
    @EmptySource

    void testEmpty(int arg[]){

        assertEquals(0,arg.length);

    }


    @ParameterizedTest
    @NullAndEmptySource

    void testNullAndEmpty(List<String> arg){
        assertTrue(arg==null || arg.isEmpty());

    }





    @Test

    void testSubtract(){
        Calculator calculator=new Calculator();


        int result=calculator.subtract(10,5);

        //expected 10 - 5 = 5  -> result 5 == passed
        assertEquals(5,result);



    }


    }


