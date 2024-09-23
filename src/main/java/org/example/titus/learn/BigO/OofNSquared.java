package org.example.titus.learn.BigO;

public class OofNSquared {

    // just means a for loop inside a for loop
    public static void printItems(int n){

        for (int i = 0; i <n; i++){
            for (int j =0; j<n; j++){
                System.out.println(i+" "+j );
            }
        }

        // demonstrating Drop-Non dominant

        for(int k = 0; k<n; k++){
            System.out.println(k);
        }
    }

    public static void main(String [] args){
        /*
          now with the K iterations this Big O becomes
          O(n2'squared'  + n) -> O(n2+n)
          since n2 is the dominant term and n is non-dominant, we drop the n

          this makes the Big O to be
          O(n2)
        */
        printItems(10);
    }

/*
  OUTPUT
            0 0
            0 1
            0 2
            0 3
            0 4
            0 5
            0 6
            0 7
            0 8
            0 9
            1 0
            1 1
            1 2
            1 3
            1 4
            1 5
            1 6
            1 7
            1 8
            1 9
            2 0
            2 1
            2 2
            2 3
            2 4
            2 5
            2 6
            2 7
            2 8
            2 9
            3 0
            3 1
            3 2
            3 3
            3 4
            3 5
            3 6
            3 7
            3 8
            3 9
            4 0
            4 1
            4 2
            4 3
            4 4
            4 5
            4 6
            4 7
            4 8
            4 9
            5 0
            5 1
            5 2
            5 3
            5 4
            5 5
            5 6
            5 7
            5 8
            5 9
            6 0
            6 1
            6 2
            6 3
            6 4
            6 5
            6 6
            6 7
            6 8
            6 9
            7 0
            7 1
            7 2
            7 3
            7 4
            7 5
            7 6
            7 7
            7 8
            7 9
            8 0
            8 1
            8 2
            8 3
            8 4
            8 5
            8 6
            8 7
            8 8
            8 9
            9 0
            9 1
            9 2
            9 3
            9 4
            9 5
            9 6
            9 7
            9 8
            9 9
 */
}
