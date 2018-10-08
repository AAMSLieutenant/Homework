package com.homework.work;

import java.util.Scanner;

public class Sequence {

    private static int begin;
    private static int end;

    private static void printSeq(){

        int oddSum=0;
        int evenSum=0;
        System.out.print("Odd numbers:");
        for(int i=begin;i<=end;i++){
            if(i%2!=0){
                System.out.print(i+" ");
                oddSum+=i;
            }
        }
        System.out.println();
        System.out.println("----------------------------------");
        System.out.print("Even numbers:");
        for(int i=end;i>=begin;i--){
            if(i%2==0){
                System.out.print(i+" ");
                evenSum+=i;
            }
        }
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Odd numbers sum: "+oddSum);
        System.out.println("Even numbers sum: "+evenSum);
    }

    public static void seqStart(){
        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.print("Set the start of the sample:");
            String s=sc.next();
            if(Utility.isNumber(s)){

                begin = Integer.parseInt(s);
                break;
            }
            else{
                System.out.println("You should input only numbers");
            }
        }

        while(true) {
            System.out.print("Set the end of the sample:");
            String s=sc.next();
            if(Utility.isNumber(s)){
                end = Integer.parseInt(s);
                if(end>begin) {
                    break;
                }
                else{
                    System.out.println("You should input only numbers");
                }
            }
            else{
                System.out.println("You should input only numbers");
            }
        }


        printSeq();

    }
}
