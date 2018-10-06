package Project;

import java.util.Scanner;
import java.lang.Math;


public class Work {


    private static int begin;
    private static int end;
    private static int fibo;
    private static int fiboResult;
    private static int F1;
    private static int F2;
    private static double fOdd;
    private static double fEven;

    private static boolean isNumber(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    private static int fibonacci(int fibo)  {
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

    private static void count(int fibo){

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

    private static void print(){

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

    private static void start(){
        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.print("Set the start of the sample:");
            String s=sc.next();
            if(isNumber(s)){

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
            if(isNumber(s)){
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

        print();

        while(true) {
            System.out.print("Set the size of the fibonacci sequence:");
            String s=sc.next();
            if(isNumber(s)){

                fibo=Integer.parseInt(s);
                break;
            }
            else{
                System.out.println("You should input only numbers");
            }
        }
        count(fibo);
        System.out.println("Fibonacci result:"+fiboResult);
        System.out.println("Fibonacci biggest odd:"+F1);
        System.out.println("Fibonacci biggest even:"+F2);
        System.out.println("Fibonacci odd percentage:"+fOdd);
        System.out.println("Fibonacci even percentage:"+fEven);
    }

    public static void main(String[] args) {
        start();
    }
}
