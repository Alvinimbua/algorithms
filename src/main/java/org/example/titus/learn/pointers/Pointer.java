package org.example.titus.learn.pointers;

import java.util.HashMap;

public class Pointer {


    public static void main (String [] args){

        /**
         * the code below demonstrate the difference between pointers and
         * non-pointers, pointers point to a memory space but non-pointer is assigned
         * the value/copy of the assigned value
         * <p>
         * for instance the int num1 and num2 clearly demonstrate assignment, not pointing, since
         * when we change value of num1 later it doesn't affect num2
         *
         * however in Hashmap map2 points to a memory of map1 such that any change in map 1 is also reflected in map2
         */
        int num1 = 10;
        int num2 = num1;

        num1 = 11;

        System.out.println(num1);
        System.out.println(num2);

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2;

        map1.put("value", 14);
        map2 = map1;

        // lets change values
        map1.put("value", 45);

        System.out.println(map1);
        System.out.println(map2);

        // you realise that the map output are the same value 45
    }
}
