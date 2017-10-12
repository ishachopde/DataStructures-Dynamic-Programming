package com.datastructures.DynamicProgramming;

public class StairProblemBruteForceAlgo {
    //static int  getCount;;
    static int count;
    public int getCount(int steps){

        if(steps<0){
            //System.out.println(steps);
            return 0;

        }
        else if(steps == 0){
            return 1;
        }
        


        else{

            count = (getCount(steps-1) + getCount(steps-2) + getCount(steps-3));
            //System.out.println(count);
            return count;
                  //return count;
            }



        //return getCount;
    }
    public static void main(String args[]){


        StairProblemBruteForceAlgo sp = new StairProblemBruteForceAlgo();
        sp.getCount(3);
        System.out.println(count);

    }
}


//output - 4