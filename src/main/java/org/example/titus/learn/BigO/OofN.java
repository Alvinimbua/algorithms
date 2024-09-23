package org.example.titus.learn.BigO;

public class OofN {

    // this is the basic representation of O(n) pronounced as O of N
    public static void  printItems(int n){
        for (int i = 0; i<n; i++ ){
            System.out.println(i);
        }
    }
    public static void main(String [] args){
       printItems(10);
       printItemsSimplification(10);
    }

    // this is the basic representation of O(n) pronounced as O of N
    // in the method below, we simplify the two for loops to O(n) rather than O(2n),  we drop the 2
    public static void  printItemsSimplification(int n){
        for (int i = 0; i<n; i++ ){
            System.out.println(i);
        }

        for (int j = 0; j<n; j++ ){
            System.out.println(j);
        }
    }

}
