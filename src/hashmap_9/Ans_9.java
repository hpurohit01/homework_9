package hashmap_9;
/*Create a HashMap object called people that will store String keys and Integer
        values: And use for each loop to iterate the value from Map.*/


import java.util.HashMap;

public class Ans_9 {



        public static void main(String[] args) {


            HashMap<String, Integer> people = new HashMap<String, Integer>();

            people.put("Ram", 20);
            people.put("Sam", 40);
            people.put("Aryan", 23);

            for (String i : people.keySet()) {
                System.out.println("key: " + i + " value: " + people.get(i));
            }
        }
    }




