package com.homework.work;

import java.util.ArrayList;
import java.util.Scanner;

public class Sequence {

    private static int begin;
    private static int end;
    private static int oddSum;
    private static int evenSum;
    private static ArrayList<Integer> oddArr;
    private static ArrayList<Integer> evenArr;

    public Sequence(){


    }

    static{
        oddArr=new ArrayList<Integer>();
        evenArr=new ArrayList<Integer>();
    }


    private static void seqCount(){


        for(int i=begin;i<=end;i++){
            if(i%2!=0){
                //System.out.print(i+" ");
                oddArr.add(i);
                oddSum+=i;
            }

            if(i%2==0){
                //System.out.print(i+" ");
                evenArr.add(i);
                evenSum+=i;
            }
        }

    }

    private static void seqPrint(){


        System.out.print("Odd numbers:");
        System.out.println(oddArr.toString());
        System.out.println();
        System.out.println("----------------------------------");
        System.out.print("Even numbers:");
        System.out.println(evenArr.toString());
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Odd numbers sum: "+oddSum);
        System.out.println("Even numbers sum: "+evenSum);
    }

    public static void seqInput(){

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




    }

    public static void SeqStart(){
        seqInput();
        seqCount();
        seqPrint();
    }
}
