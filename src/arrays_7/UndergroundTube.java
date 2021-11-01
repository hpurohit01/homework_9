package arrays_7;
/*Write a Java program to test an array list is empty or not. Define array list with
        underground tube names*/

import java.util.ArrayList;

public class UndergroundTube {

    public static void main(String[] args) {

        ArrayList myArraylist = new ArrayList();


        if ((myArraylist.isEmpty())) {


            System.out.println("The ArrayList is empty");
        }else {
            System.out.println("The ArrayList is not empty");
        }
        myArraylist.add("Elephant & Castle");
        myArraylist.add("Lambeth North");
        myArraylist.add("Waterloo");
        myArraylist.add("Embankment");
        myArraylist.add("Charing Cross");
        myArraylist.add("Piccadilly Circus");
        myArraylist.add("Oxford");
        myArraylist.add("Regent's Park");
        myArraylist.add("Baker Street");
        myArraylist.add("Marylebone");
        myArraylist.add("Edgware Road");
        myArraylist.add("Paddington");


        System.out.println(myArraylist);


    }
}

