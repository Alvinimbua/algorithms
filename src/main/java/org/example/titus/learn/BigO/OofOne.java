package org.example.titus.learn.BigO;

public class OofOne {
    /*
      doesn't matter if n = 1 or n =100, the number of operation will still be one

      this is because even as n grows we only have a constant number of operations

      this is the most efficient Big O

     */

    public static int printIntems(int n){
        /*
         even if we have 2 operations here, since theres a drop constants rule
         the code just maintains a O(1) notation
         */
        return n+n+n;
    }


    public static void main (String [] args){
        System.out.println(printIntems(10));
    }
}
