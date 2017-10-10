package com.datastructures.DynamicProgramming;

public class FibonacciMemoization {

    public int getFibonacci(int num){
        int memo[] = new int[num+1];
        memo[0]=0;
        memo[1]=1;
        //int i;
        if(num ==0 ||num==1){
            return num;
        }
        for(int i=2;i<=num;i++){
            memo[i]=memo[i-1]+memo[i-2];
        }
        //System.out.println("The cache value is "+memo[i]);
        return memo[num];
    }

    public static void main(String args[]){
        FibonacciMemoization fm = new FibonacciMemoization();
        int result = fm.getFibonacci(7);
        System.out.println(result);
    }

}


/*output:
13

 */
