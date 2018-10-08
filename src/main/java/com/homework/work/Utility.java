package com.homework.work;

import java.util.Scanner;

public class Utility {

    public static boolean isNumber(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
    public static int fibonacci(int fibo)  {
        if(fibo == 0){
            return 0;
        }
        else if(fibo == 1){
            return 1;
        }
        else{
            return fibonacci(fibo - 1) + fibonacci(fibo - 2);
        }
    }
    public static void start(){
        Sequence.seqStart();
        Fibonacci.fiboStart();
    }


}
