//Write a Java program to iterate through all elements in a array list
//Created by Raj Anilkumar on 08/11/2020


package javaProgram;

import java.util.*;
public class ExcerciseThree {

    public static void main(String[] args) {
        // Create a list and add some city names to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Surat");
        list_Strings.add("Baroda");
        list_Strings.add("Valsad");
        list_Strings.add("Ahmedabad");
        list_Strings.add("Porbandar");
            // Print the list
            for (String element : list_Strings) {
                System.out.println(element);
            }
        }
    }

