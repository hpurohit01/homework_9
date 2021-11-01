package arrays_5;
/*Write a Java program to iterate through all elements in an array list using
        Iterator.*/


import java.util.ArrayList;

import java.util.Iterator;

public class Iterate {

    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<String>();
        arrayList.add("Zero");
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        Iterator<String>iterator=arrayList.iterator();

          while ((iterator.hasNext())){
              System.out.println(iterator.next());
          }
    }
}
