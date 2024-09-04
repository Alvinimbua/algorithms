package org.example.titus.practice;

/**
 *
 *  Suppose we want to make bottles of fruit juice of determined sizes. We have some amount of money, and there’s a shop
 *  nearby that sells fruits for fixed prices. We want to know the maximum number of bottles we can make.
 *
 * To simplify the problem, we’ll assume that there’s a function canMake that takes the number of bottles as input.
 * This function returns true if the money we have is enough to make that number of bottles, and returns false otherwise.
 *
 * Then, we’ll iterate over the range from the lowest possible number to the maximum possible number of bottles we can
 * make and check every value with the canMake function. We’ll keep iterating until the canMake function returns false,
 * then we’ll stop the algorithm and return the maximum possible number of bottles we can make with the money we have.
 */
public class BinarySearchPractice {
    private static double amountToSpend;
    private static double costOfOneBottle;


    // method to set the cost of a bottle
    private static void setAmount(double amount){
        amountToSpend = amount;
    }
    // method to set the cost
    private static void  setCostOfOneBottle(double cost){
        costOfOneBottle = cost;
    }

    // find given the n bottles if the cash can make these
    private static boolean canItMakeTheseBottles(int n){
      return (n * costOfOneBottle) <=amountToSpend;
    }

    // the algorithm
    private static int calculateMaxBottles(){

        // split indexes to make a proper binary search
        int left =0;
        int right= (int)(amountToSpend/costOfOneBottle) + 1; // get the last index
        // loop as long as left if less than right
        while (left <right){
            // look for a midpoint
            int mid = left +(right-left)/2;

            if (canItMakeTheseBottles(mid)){
                // we assume that the number of bottles then in greater than the midpoint, so we shift left to mid+1,
                left = mid+1;
            }else {
                // means that the value is below the mid so we shift the right to mid to search on the first half
                right = mid;
            }
        }


        // [7,8,9,10,11,12]

        // to return the value
        return left-1;
    }


    // main file
    public static void main (String [] args){
        // init
        setAmount(100);
        setCostOfOneBottle(2.5);

        System.out.println("Result is: "+ calculateMaxBottles());
    }
}
