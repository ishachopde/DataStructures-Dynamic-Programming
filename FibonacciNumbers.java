package com.datastructures.DynamicProgramming;

public class FibonacciNumbers{

    public int getFibonacci(int num){
        if(num<0){
            System.out.println("Number cannot be negative ");
        }
        if(num == 0 || num == 1){
            return num;
        }
        int a = 0, b=1; //base values
        int sum = a+b;
        for(int i=2;i<=num;i++){
            //i =2 because i=0and 1 have the base values
             sum = a+b;
            a=b;
            b=sum;
            System.out.print(sum +" ");

        }
        System.out.print("\n");
        System.out.println("The value of num "+num+" is: "+sum);
        return sum;

    }

    public static void main(String args[]){
        FibonacciNumbers fn = new FibonacciNumbers();
        fn.getFibonacci(8);
        //System.out.println("The value of num"+num+"is: "+sum);
    }
}
 /*output:
1 2 3 5 8 13 21
The value of num 8 is: 21


  */