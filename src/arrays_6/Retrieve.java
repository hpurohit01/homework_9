package arrays_6;

import java.util.*;

public class Retrieve {

    public static void main(String[] args) {

        List<String>list_Strings = new ArrayList<String>();

        list_Strings.add("Alex");
        list_Strings.add("Andrew");
        list_Strings.add("John");
        list_Strings.add("Jose");
        list_Strings.add("Mike");

        System.out.println(list_Strings);
        String element = list_Strings.get(0);

        System.out.println("First element:"+element);

        element = list_Strings.get(2);

        System.out.println("Third element:"+element);

    }
}
