//Write a Java program to test an array list is empty or not
//Created By Raj Anilkumar on 08/11/20202

package javaProgram;

import java.util.ArrayList;

public class ExcerciseFive {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list.isEmpty());     //true

        list.add("A");

        System.out.println(list.isEmpty());     //false

        list.clear();

        System.out.println(list.isEmpty());     //true
    }

    }



