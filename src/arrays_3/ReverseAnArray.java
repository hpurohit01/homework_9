package arrays_3;

import java.util.Arrays;
import java.util.Collections;
/*Write a Java program to reverse an array of integer values.*/


public class ReverseAnArray {

    static void reverses(Integer myArray[]){

        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array:"+ Arrays.asList(myArray));
    }

    public static void main(String[] args) {
        Integer[]myArray={1,2,3,4,5,6,7,8,9,10,};

        System.out.println("original Array"+ Arrays.asList(myArray));

        reverses(myArray);

        }

    }

