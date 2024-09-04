package org.example.titus.learn;

/**
 *  -> Binary search is a divide and conquer algorithm that repeatedly divide the search space in half
 *  in each comparison therefore it is well suited for searching elements of a sorted array or matrices
 */
public class BinarySearch {
    private static double availableMoney;
    private static double costPerBottle;

    private static void setAvailableMoney(double money){
        availableMoney = money;
    }

    private static void setCostPerBottle(double cost){
        costPerBottle = cost;
    }

    // boolean to check if the available amount is viable
    private static boolean canItMakeTheseBottles(int n){
        return (n * costPerBottle) <=availableMoney;
    }


    // use binary search algorithm
    private static int maximumBottlesInBinarySearch(){
        // the first index is always zero
        int left  = 0;
        // the last is the size +1, cast it to int
        int right = (int)(availableMoney / costPerBottle) +1 ;

        while (left <right){
            // get the midpoint
            int mid = left + (right-left) /2;
            if (canItMakeTheseBottles(mid)){
                /*
                If we can make mid bottles, we know the maximum is at least mid, so we set left = mid + 1 to search the upper half.
                 */
                left = mid+1;
            }else {
                   /*
                       If we can't make mid bottles, we know the maximum is less than mid, so we set right = mid to search the lower half.
                   */
                right = mid;
            }
        }

        // return the last valid number of mid
        return left -1;
    }


    public static void main(String [] args){
        setAvailableMoney(100);
        setCostPerBottle(2.5);

        var response  = maximumBottlesInBinarySearch();

        System.out.println("Binary result for maximum bottles: " + response);
    }
}
