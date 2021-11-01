package arrays_4;
/*Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop.*/

import java.util.ArrayList;
import java.util.List;

public class ArraysAns_4 {
    public static void main(String[] args) {

        List<String>
                list_String=new ArrayList<>();

        list_String.add("Red");
        list_String.add("White");
        list_String.add("Green");
        list_String.add("Orange");
        list_String.add("Black");
        list_String.add("Blue");
        list_String.add("Pink");
        System.out.println(list_String);


    }

}
