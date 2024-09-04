package org.example.titus.learn;

/**
 *  this is an inefficient form of search where the algorithm searches one item at a time until it gets the
 *  matching item.
 *
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
public class LinearSearch {
    private static double availableMoney;
    private static double costPerBottle;

    // setting available money
    public static void setMoney(double money){
        availableMoney = money;
    }

    // set number of bottles
    public static void setCostPerBottle(double cost){
        costPerBottle =cost;
    }

    // a boolean method to give the number of bottles to be made
    public static boolean canItMakeTheseBottles(int n){
        return (n * costPerBottle) <= availableMoney;
    }

    // algorithm to calculate the maximum bottles to be made given the cost
    public static double maximumBottles (){
        // initialize the bottle with zero value
        var bottles = 0;
        while (canItMakeTheseBottles(bottles +1)){
            // increment the bottle value  till the statement is false
            bottles ++;
        }

        return bottles;
    }



    // lets create a main function to run this code
    public static void main (String [] args){
        setMoney(100);
        setCostPerBottle(2.5);
        double result  = maximumBottles();
        System.out.println("The maximum bottles are "+ result);
    }
}
/**
 * The total time complexity of the above algorithm is O(n), where n is the length of the range.
 */