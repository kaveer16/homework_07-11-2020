package javaProgram;
/*Write a Java program to create a new array list, add some colours (string) and
printout the collection.*/

import java.util.ArrayList;
import java.util.List;

    public class ExcerciseTwo {

        public static void main(String[] args) {
            //creating array list using string
            List<String> list_Strings = new ArrayList<String>();
            list_Strings.add("Red");
            list_Strings.add("Green");
            list_Strings.add("Orange");
            list_Strings.add("White");
            list_Strings.add("Black");
            System.out.println(list_Strings);
        }
    }


