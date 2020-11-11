/*Write a Java program to retrieve an element (at a specified index) from a given in array list
Created By Raj Anilkumar on 08//11/2020
 */
package javaProgram;

import java.util.ArrayList;
import java.util.List;

public class ExcerciseFour {

    public static void main(String args[]) throws Exception {
        List aList = new ArrayList();
        aList.add("Raj");
        aList.add("Kruti");
        aList.add("Kyra");
        aList.add("Kriva");
        aList.add("Viraj");
        System.out.println("The element at index 3 in the ArrayList is: " + aList.get(0));
    }
    }

