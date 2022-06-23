import java.util.*;

public class Calculator {


    public  static  void main(String[] args){


    }


    public  boolean isEven(int a){
        return  a % 2 == 0;
    }
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return 0;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero!");
        }
        return a / b;
    }
}