package com.homework.work;

import java.util.Scanner;
import java.lang.Math;

public class Fibonacci {



    private static int fibo;
    private static int fiboResult;
    private static int F1;
    private static int F2;
    private static double fOdd;
    private static double fEven;





    private static void fiboCount(int fibo){

        double even=0;
        double odd=0;
        fiboResult=Math.abs(Utility.fibonacci(fibo));

        if(fiboResult%2==0){
            F2=fiboResult;
            F1=Utility.fibonacci(fibo-1);
        }
        else{
            F1=fiboResult;
            F2=Utility.fibonacci(fibo-1);
        }
        for(int i=0;i<fibo;i++){

            if(Utility.fibonacci(i)%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        fOdd=(odd/fibo)*100;
        fEven=(even/fibo)*100;


    }


    public static void fiboStart(){

        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.print("Set the size of the fibonacci sequence:");
            String s=sc.next();
            if(Utility.isNumber(s)){

                fibo=Integer.parseInt(s);
                break;
            }
            else{
                System.out.println("You should input only numbers");
            }
        }
        fiboCount(fibo);
        System.out.println("Fibonacci result:"+fiboResult);
        System.out.println("Fibonacci biggest odd:"+F1);
        System.out.println("Fibonacci biggest even:"+F2);
        System.out.println("Fibonacci odd percentage:"+fOdd);
        System.out.println("Fibonacci even percentage:"+fEven);
    }



}
