package org.example.titus.practice;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class Playground {

    public static List<Integer> workingNumbers;

    public static  void setWorkingNumbers(List<Integer> numbers){
        workingNumbers = numbers;
    }

    public static  int doLinearSearch(int num){
        for (int i = 0; i<workingNumbers.toArray().length; i++){
            if(workingNumbers.get(i) == num){
                return num;
            }
        }

        return -1; // the number is not there
    }


    public static void main(String [] args){
        setWorkingNumbers(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println("and the number is" + workingNumbers.get(6));  // O(1)
        System.out.println("The linear search result gave num: " + doLinearSearch(7));  // O(1)
    }
}
