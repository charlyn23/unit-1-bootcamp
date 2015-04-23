/**
* Created by alexandraqin on 4/14/15.
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataStructures
{
    public static void main(String args[])
    {
        Cat whiskers = new Cat("Whiskers");
        Cat pepper = new Cat("Pepper");
        Cat dusty = new Cat("Dusty");
        Cat simba = new Cat("Simba");
        Cat mufasa = new Cat("Mufasa");


        //1. Cool Cats Pt. II
        //Create an ArrayList of 5 Cats.
        //Use a loop to print the contents of each object in the ArrayList.

        ArrayList<Cat> coolCats = new ArrayList<Cat>();
        coolCats.add(whiskers);
        coolCats.add(pepper);
        coolCats.add(dusty);
        coolCats.add(simba);
        coolCats.add(mufasa);
        for(int i = 0; i < coolCats.size(); i++)
        {
            System.out.println(coolCats.get(i).getName());
        }
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(5);
        numbers.add(10);
        numbers.add(5);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        numbers.add(0);

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < numbers.size(); i++)
        {
            Integer count = map.get(numbers.get(i));
            map.put(numbers.get(i), count == null
                    ? 1
                    : count + 1);   //auto boxing and count
        }
        System.out.println(map);
        for(int i = 0; i < map.size(); i++)
        {
        }

        //3.1 Create a HashMap that maps the names of all the Access Coders in your Pod to their age.

        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("Charlyn", 28);
        ages.put("Kadeem", 24);
        ages.put("Jae", 28);
        ages.put("Reinard", 33);
        ages.put("Yulia", 25);

        //Test ages hashMap
        System.out.println(ages);

        //3.2 Use a loop to print each key-value pair of the HashMap.
        for(String key : ages.keySet())
        {             //for loop looking at key in hashmap
            Integer value = ages.get(key);            //gets the Integer value that goes with the key
            System.out.println(key + " = " + value);  //prints out the key and value
        }

        //Calling canRentACar
        System.out.println(canRentACar(ages));
    }

    //2. Write a method called mostFrequentElement that takes an ArrayList of Integers and finds
    // the most frequently occurring element in the ArrayList. At the end print the element and
    // its number of occurrences. If there is more than one such element, any one of them may
    // be printed.
    //First, make an array list of integers up in main
    public static void mostFrequentElement(ArrayList<Integer> numbers)
    {
        ArrayList<Integer> sortedNumbers = new ArrayList<Integer>();
        Collections.sort(numbers);
    }

    //4. Write a method called canRentACar that takes the Pod HashMap as a parameter and
    // returns whether or not the Pod can rent a car. If one or more students is over 25,
    // it should return true. If no one in the Pod is over 25, it should return false.
    public static boolean canRentACar(HashMap theOneYouJustMade)
    {
        for(Object value : theOneYouJustMade.keySet())
        {
            theOneYouJustMade.get(value);
            for(int i = 26; i > 26; i++)
            {
                if(value.equals(i))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        return boolean;
    }
}


//    public static boolean canRentACar(HashMap theOneYouJustMade)
//    {
//        for(int i = 0; i > 26; i++)
//        {
//            // Integer value = theOneYouJustMade.get(key);
//            if(theOneYouJustMade.keySet().contains(i))
//                return true;
//        } else  {
//        return false;
//    }
//    }