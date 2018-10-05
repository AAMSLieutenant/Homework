package Project;

import java.util.Scanner;
import java.lang.Math;

public class Work {


    public static int begin;
    public static int end;
    public static int fibo;
    public static int fiboResult;
    public static int F1;
    public static int F2;
    public static double fOdd;
    public static double fEven;

    public static int fibonacci(int fibo)  {
        if(fibo>=0){
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
        else{
            if(fibo == 0){
                return 0;
            }
            else if(fibo == -1){
                return 1;
            }
            else{
                return fibonacci(fibo +2) - fibonacci(fibo + 1);
            }
        }

    }

    public static void count(int fibo){

        double even=0;
        double odd=0;
        fiboResult=Math.abs(fibonacci(fibo));

        if(fiboResult%2==0){
            F2=fiboResult;
            F1=fibonacci(fibo-1);
        }
        else{
            F1=fiboResult;
            F2=fibonacci(fibo-1);
        }
        for(int i=0;i<fibo;i++){

            if(fibonacci(i)%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        fOdd=(odd/fibo)*100;
        fEven=(even/fibo)*100;


    }


    public static void start(){
        Scanner sc=new Scanner(System.in);
//        while(true) {
//
//                System.out.print("Set the start of the sample:");
//                String s=sc.next();
//                try{
//                    Integer.parseInt(s);
//                }
//                catch(NumberFormatException nfe){
//                    System.out.println("Insert only numbers");
//                }
//                begin = sc.nextInt();
//
//        }

        System.out.print("Set the start of the sample:");
        end=sc.nextInt();
        print();
        System.out.print("Set the size of the fibonacci sequence:");
        fibo=sc.nextInt();
        count(fibo);
        System.out.println("Fibonacci result:"+fiboResult);
        System.out.println("Fibonacci biggest odd:"+F1);
        System.out.println("Fibonacci biggest even:"+F2);
        System.out.println("Fibonacci odd percentage:"+fOdd);
        System.out.println("Fibonacci even percentage:"+fEven);
        //System.out.println(fibonacci(fibo));



    }






    public static void print(){

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



    public static void main(String[] args) {
        //System.out.println("Hello world!");
        start();
        //print();
    }
}
